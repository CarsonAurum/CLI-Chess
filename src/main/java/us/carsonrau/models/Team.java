package us.carsonrau.models;

import us.carsonrau.utils.PieceColorUtils;

public class Team {
    private PieceColor teamColor;
    private GamePiece[] pieces;

    public Team(PieceColor teamColor) {
        this.teamColor = teamColor;
        pieces = new GamePiece[]{
                new GamePiece(teamColor, PieceType.PAWN),
                new GamePiece(teamColor, PieceType.PAWN),
                new GamePiece(teamColor, PieceType.PAWN),
                new GamePiece(teamColor, PieceType.PAWN),
                new GamePiece(teamColor, PieceType.PAWN),
                new GamePiece(teamColor, PieceType.PAWN),
                new GamePiece(teamColor, PieceType.PAWN),
                new GamePiece(teamColor, PieceType.PAWN),
                new GamePiece(teamColor, PieceType.ROOK),
                new GamePiece(teamColor, PieceType.ROOK),
                new GamePiece(teamColor, PieceType.KNIGHT),
                new GamePiece(teamColor, PieceType.KNIGHT),
                new GamePiece(teamColor, PieceType.BISHOP),
                new GamePiece(teamColor, PieceType.BISHOP),
                new GamePiece(teamColor, PieceType.QUEEN),
                new GamePiece(teamColor, PieceType.KING)
        };
    }

    public PieceColor getTeamPieceColor() {
        return teamColor;
    }

    public String getTeamColorCode() {
        return PieceColorUtils.getCode(teamColor);
    }

    public GamePiece getPiece(PieceType type) {
        for (GamePiece piece: pieces) {
            if (piece.getPieceType() == type)
                return piece;
        }
        return GamePiece.EMPTY;
    }
}
