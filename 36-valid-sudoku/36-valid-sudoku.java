class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean res = true;
        for (int i = 0; i < 9; i++) {
            //for columns
            char[] column = new char[9];
            for (int j = 0; j < 9; j++) {
                column[j] = board[j][i];
            }
            boolean colRes = rowCheck(column);
            
            //for smaller boxes
            char[] smallBox = new char[9];
            int z = 0;
            for (int x = Math.floorDiv(i,3) * 3; x < (Math.floorDiv(i,3) * 3) + 3; x++){
                for (int y = (i%3) * 3; y < ((i%3) * 3) + 3; y++) {
                    smallBox[z++] = board[x][y];
                }
            }
            boolean smallRes = rowCheck(smallBox);
            //for rows    
            res = rowCheck(board[i]) && colRes && smallRes;
            if (!res) {
                return false;
            }
        }
        return res;
    }
    
    private boolean rowCheck(char[] row) {
        Boolean[] check2 = new Boolean[9];
        List<Boolean> check = Arrays.asList(check2);
        Collections.fill(check, false);
        for (char c : row) {
            if (c == '.') continue;
            if (Character.getNumericValue(c) < 1 || Character.getNumericValue(c) > 9) return false;
            if (check.get(Character.getNumericValue(c) - 1) == true) return false;
            check.set(Character.getNumericValue(c) - 1, true);
        }
        return true;
    }
}