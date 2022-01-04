class Solution {
    // public int bitwiseComplement(int n) {
    //     String bin = Integer.toBinaryString(n);
    //     StringBuilder res = new StringBuilder();
    //     for (char c : bin.toCharArray()) {
    //         if (c == '0') {
    //             res.append('1');
    //         }
    //         else {
    //             res.append('0');
    //         }
    //     }
    //     return Integer.parseInt(res.toString(), 2);
    // }
    
    public int bitwiseComplement(int n) {
        int res = 0;
        char[] digits = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[digits.length - i - 1] == '0') {
                res += Math.pow(2,i);
            }
        }
        return res;
    }
}