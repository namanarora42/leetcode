class Solution {
    public int reverse(int x) {
        try {
            StringBuilder xStr = new StringBuilder();
            xStr.append(Math.abs(x));
            xStr.reverse();
            return (x < 0 ? -1 : 1) * Integer.parseInt(xStr.toString());
        }
        catch (Exception ignored) {}
        return 0;
    }
}