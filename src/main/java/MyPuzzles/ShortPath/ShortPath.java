package MyPuzzles.ShortPath;

public class ShortPath {
    private int m;
    private int n;
    private int startX;
    private int startY;
    private int finishX;
    private int finishY;
    private int[][] map;
    private int result = Integer.MAX_VALUE;

    public int calculate(int[][] map) {
        this.map = map;
        m = map.length;
        n = map[0].length;
        findStartAndFinish();

        findRoute(startX, startY, 0);

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private void findStartAndFinish() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int START = 2;
                if (map[i][j] == START) {
                    startX = i;
                    startY = j;
                }
                int FINISH = 3;
                if (map[i][j] == FINISH) {
                    finishX = i;
                    finishY = j;
                }
            }
        }
    }

    private void findRoute(int x, int y, int pathLen) {
        if (x == finishX && y == finishY) {
            result = Math.min(result, pathLen);
            return;
        }
        int BUILDING = 1;
        int VISITED = 4;
        if (x < 0 || x >= m ||
                y < 0 || y >= n ||
                map[x][y] == VISITED ||
                map[x][y] == BUILDING) {
            return;
        }
        map[x][y] = VISITED;
        pathLen++;
//        up
        findRoute(x, y - 1, pathLen);
//        down
        findRoute(x, y + 1, pathLen);
//        left
        findRoute(x - 1, y, pathLen);
        findRoute(x + 1, y, pathLen);

    }
}
