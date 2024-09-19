package day17;

public class ChessBoard {

  ChessPiece[][] pieces;

  public ChessBoard(ChessPiece[][] pieces) {
    this.pieces = pieces;
  }

  public void print() {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print(pieces[i][j].getSymbol());
      }
      System.out.println();
    }
  }
}
