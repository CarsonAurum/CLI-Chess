package us.carsonrau.models;

import us.carsonrau.utils.PieceColorUtils;
import us.carsonrau.utils.PieceTypeUtils;

import java.util.List;

public class GamePiece {

    public static final GamePiece EMPTY = new GamePiece(PieceColor.NONE, PieceType.NONE);

    private final PieceColor color;
    private final PieceType type;
    private boolean isCaptured;

    public GamePiece(PieceColor color, PieceType type) {
        this.color = color;
        this.type = type;
        this.isCaptured = false;
    }

    public String getColor() {
        return PieceColorUtils.getCode(color);
    }

    public char getType() {
        return PieceTypeUtils.getType(type);
    }
    public PieceType getPieceType() { return type;}
    public List<int[]> getValidMoves() {
        return PieceTypeUtils.getPossibleMoves(type);
    }
    public boolean isCaptured() {
        return isCaptured;
    }
    public void capture() {
        isCaptured = true;
    }

    public String toString() {
        return getColor() + getType();
    }
}
