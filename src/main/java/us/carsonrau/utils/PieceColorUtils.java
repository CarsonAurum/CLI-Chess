package us.carsonrau.utils;

import us.carsonrau.models.PieceColor;

// All the helper functions to work with PieceColor.
public class PieceColorUtils {
    public static String getCode(PieceColor pieceColor) {
        return switch (pieceColor) {
            case WHITE -> "\033[0;37m";
            case BLACK -> "\033[0;30m";
            case NONE -> "\033[0m";
        };
    }

    public static PieceColor getColor(char color) {
        if (color == 'W' || color == 'w')
            return PieceColor.WHITE;
        if (color == 'B' || color == 'b')
            return PieceColor.BLACK;
        return PieceColor.NONE;
    }
}
