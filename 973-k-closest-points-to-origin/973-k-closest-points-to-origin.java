class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        Map<Double, List<int[]>> map = new TreeMap<>();
        for (int[] each : points) {
            double dist = distance(each);
            if (map.containsKey(dist)) {
                List<int[]> temp = map.get(dist);
                temp.add(each);
            }
            else {
                List<int[]> temp = new LinkedList<>();
                temp.add(each);
                map.put(dist, temp);
            }
        }
        int added = 0;
        ArrayList<Double> keys = new ArrayList<>(map.keySet());
        while (added < k) {
            List<int[]> temp = map.get(keys.remove(0));
            for (int[] x : temp) {
                res[added++] = x;
            }
        }
        return res;
    }
    
    public double distance(int[] x) {
        int x1 = x[0]; 
        int y1 = x[1];
        int x2 = 0;
        int y2 = 0;
        
        return (((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
    }
}