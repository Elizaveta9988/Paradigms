import java.util.LinkedList;
import java.util.Queue;

public class MazeSolver{
    private static final int[][] DIRECTIONS = {{-1,0}, {0, -1}, {1,0}, {0,1}};

}
public static LinkedList<Point> findPath(int[][] maze, Point start, Point end ){
    int rows = maze.length;
    int columns = maze[0].length;
}
 
boolean[][] visited = new boolean[rows][columns];
Point[][] parents = new Point[rows][columns];

Queue<Point> queue = new LinkedList<>();

queue.offer(start);
visited[start.x][start.y] = true;

while (!queue.isEmpty());
    Point current = queue.poll();

    if (current.x == end.x && current.y == end.y){
        return buildPath(parents, start, end);
    }

    for (int[] direction : DIRECTIONS){
        int nextX=current.x +direction[0];
        int nextY = current.y + direction[1];

        if (isVaValid(maze, nextX, nextY, visited)){
            Point nexPoint = new Point(nextX, nextY,true);
            queue.offer(nexPoint);
            visited[nextX][nextY] = true;
            parents[nextX][nextY] = current;
        }

        return new LinkedList<>();
    }

    private static LinkedList<Point> buildPath(Point[][] parents, Point start, Point end){
        LinkedList<Point> path = new LinkedList<>();

        Point current = end;
    }

    while (current != null && current != start){
        path.addFirst(current);
        current = parents[current.x][current.y];
    }

    path.addFirst(start);

    return path;

    private static boolean isValid(int[][] maze, int x, int y, boolean[][] visited){
        int rows = maze.length;
        int columns = maze[0].length;

        return x >= 0 && x <rows && y >= 0 && y < columns && maze [x][y] == 0 && !visited[x][y];
    }