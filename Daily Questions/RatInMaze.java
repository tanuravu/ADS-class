import java.util.ArrayList;
import java.util.List;


//given an  N*N grid where name cells are blocked(denoted by 0)
    //a rat starts at the top left cell and need to reach at bottom right
    //rat can move down right up left but can;t move in blocked cells.
    //we need to find all the possible paths.

    //Approach:
    // start at a(0,0) mark it as visted.
    //try moving in all four directions(D,U,L,R)
    //if the destination reached,add the current path to result
    //if moving leads to invalid,backtrack.
    //use a bollean array to keep track of visited cells.
    
public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        List<String> result = FPIM(maze);
        System.out.println("Possible paths: " + result);
    }

    private static void fp(int[][] maze, int x, int y, int n, boolean[][] vist, String path, List<String> paths) {
        // Base Case: If destination (n-1, n-1) is reached
        if (x == n - 1 && y == n - 1) {
            paths.add(path);
            return;
        }

        // Possible moves: Down, Right, Up, Left
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        char[] move = {'D', 'R', 'U', 'L'};

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            // Check if the move is valid
            if (isValid(newX, newY, n, maze, vist)) {
                // Mark as visited
                vist[newX][newY] = true;
                // Recursive call with updated path
                fp(maze, newX, newY, n, vist, path + move[i], paths);
                // Backtrack (unmark visited for other paths)
                vist[newX][newY] = false;
            }
        }
    }

    private static boolean isValid(int x, int y, int n, int[][] maze, boolean[][] vist) {
        return x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && !vist[x][y];
    }

    public static List<String> FPIM(int[][] maze) {
        List<String> paths = new ArrayList<>();
        int n = maze.length;

        // If starting or ending cell is blocked, return empty list
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return paths;
        }

        boolean[][] vist = new boolean[n][n];
        vist[0][0] = true;

        // Start recursive search from (0,0)
        fp(maze, 0, 0, n, vist, "", paths);

        return paths;
    }
}