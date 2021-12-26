class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if ( i != j) {
                    if (
                        (intervals[j][0] > intervals[i][0] && intervals[j][0] < intervals[i][1]) || 
                        (intervals[j][1] > intervals[i][0] && intervals[j][1] < intervals[i][1]) ||
                        (intervals[j][0] == intervals[i][0] && intervals[j][1] == intervals[i][1])
                    ) return false;
                }
            }
        }
        return true;
    }
}