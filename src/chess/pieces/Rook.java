package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	// no do professor nao ha o parametro null.
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard(null).getRows()][getBoard(null).getColumns()];
		return mat;
	}
}
