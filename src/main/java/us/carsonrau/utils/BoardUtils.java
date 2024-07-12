package us.carsonrau.utils;

import java.util.Iterator;
import java.util.List;

public class BoardUtils {
    public static void removeInvalidMoves(int[] startingPosition, List<int[]> moves) {
        Iterator<int[]> iterator = moves.iterator();
        while (iterator.hasNext()) {
            int[] move = iterator.next();
            int x = startingPosition[0] + move[0];
            int y = startingPosition[1] + move[1];
            if (isValidIndex(x, y))
                iterator.remove();
        }
    }
    public static boolean isValidIndex(int x, int y) {
        return x < 0 || x >= 8 || y < 0 || y >= 8;
    }
    public static int[] positionToIndex(String position) {
        char column = position.charAt(0);
        char row = position.charAt(1);
        int colIndex = column - 'A';
        int rowIndex = '8' - row;
        return new int[] {rowIndex, colIndex};
    }
}
