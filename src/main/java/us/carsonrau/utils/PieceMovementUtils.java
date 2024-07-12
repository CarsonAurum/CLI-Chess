package us.carsonrau.utils;

import java.util.ArrayList;
import java.util.List;

public class PieceMovementUtils {
        public static List<int[]> getPawnMoves() {
        return new ArrayList<>() {{
            add(new int[]{0, 1});
            add(new int[]{0, 2});
        }};
        // TODO: Support captures and promotions.
    }

    public static List<int[]> getKnightMoves() {
        return new ArrayList<>() {{
            add(new int[]{-2, -1});
            add(new int[]{-1, -2});
            add(new int[]{1, -2});
            add(new int[]{2, -1});
            add(new int[]{2, 1});
            add(new int[]{1, 2});
            add(new int[]{-1, 2});
            add(new int[]{-2, 1});
        }};
    }

    public static List<int[]> getRookMoves() {
        return new ArrayList<>() {{
            for (int i = 1; i < 8; i++) {
                add(new int[]{i, 0});
                add(new int[]{-i, 0});
                add(new int[]{0, i});
                add(new int[]{0, -i});
            }
        }};
    }

    public static List<int[]> getBishopMoves() {
        return new ArrayList<>() {{
            for (int i = 1; i < 8; i++) {
                add(new int[]{i, i});
                add(new int[]{-i, -i});
                add(new int[]{i, -i});
                add(new int[]{-i, i});
            }
        }};
    }

    public static List<int[]> getQueenMoves() {
        return new ArrayList<>() {{
            addAll(getRookMoves());
            addAll(getBishopMoves());
        }};
    }

    public static List<int[]> getKingMoves() {
        return new ArrayList<>() {{
            add(new int[]{1, 0});
            add(new int[]{1, 1});
            add(new int[]{0, 1});
            add(new int[]{-1, 1});
            add(new int[]{-1, 0});
            add(new int[]{-1, -1});
            add(new int[]{0, -1});
            add(new int[]{1, -1});
        }};
    }
}
