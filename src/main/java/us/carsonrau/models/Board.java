package us.carsonrau.models;

public class Board {
    private final GamePiece[][] board;

    public Board(Team[] teams) {
        assert(teams.length == 2);
        board = new GamePiece[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = GamePiece.EMPTY;
            }
        }
    }

    public void move(String startingPosition, String endingPosition) {

    }

    public void capture(String startingPosition, String endPosition) {

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("    A   B   C   D   E   F   G   H\n");
        sb.append("  +").append("---+".repeat(8)).append("\n");

        for (int i = 0; i < 8; i++) {
            // Print the row number
            sb.append(String.format("%d |", 8 - i));
            for (int j = 0; j < 8; j++) {
                sb.append(String.format(" %s |", board[i][j]));
            }
            sb.append("\n");
            sb.append("  +").append("---+".repeat(8)).append("\n");
        }
        return sb.toString();
    }

}
