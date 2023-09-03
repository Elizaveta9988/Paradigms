import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args);
    int [][] maze = {
        {0, 0 , 0, 0 ,1},
        {1, 1, 1, 0, 1},
        {0, 0, 0, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 0, 0, 0, 0},
    };    

    Point start = new Point(0, 0, false);
    Point end = new Poiint (4, 4, true);

    LinkedList<Point> path =MazeSolver.findPath(maze, start, end);
    if (path.isEmpty()){
        System.out.println("Путь не найден");
        {else}
        System.out.println("Путь от начальной до конечной точки");
        for(Point point : path);
           System.out.println("(" + point.x + "," point.y + ")");
    }
    
    
}

