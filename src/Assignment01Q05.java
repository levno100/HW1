public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int l = m.length;
        int[] dist = new int[l];
        for (int k = 0; k < l; k++) {
            dist[k] = -1;
        }
        dist[i] = 0;
        int[] queue = new int[l];
        int head = 0;
        int tail = 0;
        queue[tail++] = i;
        while (head != tail) {
            int s = queue[head++];
            for (int k = 0; k < l; k++) {
                if (dist[k] == -1 && m[s][k] == 1) {
                    dist[k] = dist[s] + 1;
                    queue[tail++] = k;
                }
            }
        }
        return dist[j];
    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } }, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } }, 0, 2)); // 2
    }
}