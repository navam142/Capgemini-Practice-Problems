import java.util.*;

public class TicTacToe {

    static char[][] board;
    static char currentPlayer;
    static Map<Integer, int[]> map;
    public static void main(String[] args) {
        initializeGame();
        Scanner sc = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + " enter your move (1-9)");
            Integer value = null;
            try {
                value = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Input should must be (1-9)");
            }
            if (isValidMove(value)) {
                markValue(value);
                if (checkWin()) {
                    printBoard();
                    System.out.println("player " + currentPlayer + " won!");
                    break;
                }
                if (checkDraw()) {
                    printBoard();
                    System.out.println("board is full\ngame draw");
                    break;
                }
                switchPlayer();
            }
        }
        
    }

    public static void inputMapper() {
        map.put(1, new int[]{0, 0});
        map.put(2, new int[]{0, 1});
        map.put(3, new int[]{0, 2});
        map.put(4, new int[]{1, 0});
        map.put(5, new int[]{1, 1});
        map.put(6, new int[]{1, 2});
        map.put(7, new int[]{2, 0});
        map.put(8, new int[]{2, 1});
        map.put(9, new int[]{2, 2});
    }

    public static void markValue(int value) {
        int[] position = map.get(value);
        board[position[0]][position[1]] = currentPlayer;
    }

    public static void initializeGame() {
        board = new char[3][3];
        initializeBoard();
        currentPlayer = 'x';
        map = new HashMap<>();
        inputMapper();

    }

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static boolean checkDraw() {
        for (char[] row : board)
            for (char cell : row)
                if (cell == ' ')
                    return false;
        return true;
    }

    public static boolean isValidMove(int value) {
        if (value >= 1 && value <= 9 ) {
            int[] position = map.get(value);
            if (board[position[0]][position[1]] == ' ') {
                return true;
            } else {
                System.out.println("Invalid move\nposition " + value + " was already used by player " + board[position[0]][position[1]]);
                return false;
            }
        } else {
            System.out.println("Invalid move choose between (1-9)");
            return false;
        }
    }

    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'x') ? 'o' : 'x';
    }

    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
        System.out.println();
    }

    static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                board[i][1] == currentPlayer &&
                board[i][2] == currentPlayer)
                return true;

            if (board[0][i] == currentPlayer &&
                board[1][i] == currentPlayer &&
                board[2][i] == currentPlayer)
                return true;
        }

        if (board[0][0] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][2] == currentPlayer)
            return true;

        if (board[0][2] == currentPlayer &&
            board[1][1] == currentPlayer &&
            board[2][0] == currentPlayer)
            return true;

        return false;
    }
}
