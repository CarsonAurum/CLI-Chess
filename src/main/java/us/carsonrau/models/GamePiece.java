package us.carsonrau.models;

import us.carsonrau.utils.PieceColorUtils;
import us.carsonrau.utils.PieceTypeUtils;

import java.util.List;

public class GamePiece {

    public static final GamePiece EMPTY = new GamePiece(PieceColor.NONE, PieceType.NONE);

    private final PieceColor color;
    private final PieceType type;

    public GamePiece(PieceColor color, PieceType type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return PieceColorUtils.getCode(color);
    }

    public char getType() {
        return PieceTypeUtils.getType(type);
    }
    public List<int[]> getValidMoves() {
        return PieceTypeUtils.getPossibleMoves(type);
    }

    public String toString() {
        return getColor() + getType();
    }
}
