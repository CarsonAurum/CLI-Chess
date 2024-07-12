package us.carsonrau.utils;

import us.carsonrau.models.PieceType;

import java.util.ArrayList;
import java.util.List;

public class PieceTypeUtils {
    public static char getType(PieceType pieceType) {
        return switch (pieceType) {
            case PAWN -> 'P';
            case KNIGHT -> 'N';
            case ROOK -> 'R';
            case BISHOP -> 'B';
            case QUEEN -> 'Q';
            case KING -> 'K';
            case NONE -> ' ';
        };
    }

    public static List<int[]> getPossibleMoves(PieceType pieceType) {
        return switch (pieceType) {
            case PAWN -> PieceMovementUtils.getPawnMoves();
            case KNIGHT -> PieceMovementUtils.getKnightMoves();
            case ROOK -> PieceMovementUtils.getRookMoves();
            case BISHOP -> PieceMovementUtils.getBishopMoves();
            case QUEEN -> PieceMovementUtils.getQueenMoves();
            case KING -> PieceMovementUtils.getKingMoves();
            case NONE -> new ArrayList<>();
        };
    }
}
