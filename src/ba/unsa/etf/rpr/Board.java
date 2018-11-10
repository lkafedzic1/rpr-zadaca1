package ba.unsa.etf.rpr;

public class Board {
    //Pocetni izgled table definisemo konstruktorom
    public Board() {
        ChessPiece[][] board= new ChessPiece[8][8];
        String[] kolona= new String[] {"a","b","c","d","e","f","g","h"};
        String[] red=new String[] {"1","2","3","4","5","6","7","8"};

        ChessPiece.Color color;
        //definiramo tabelu 8*8

        //Popunjavamo 2. i 7. red pijunima
        for(int j=1; j<=8; j++){
            board[1][j] = new Pawn(kolona[j]+red[1],ChessPiece.Color.WHITE);
        }
        for(int j=1; j<=8; j++){
            board[7][j] = new Pawn(kolona[j]+red[7],ChessPiece.Color.BLACK);
        }
        //Smjestanje ostalih figura:
        board[0][0] = new Rook(kolona[0]+red[0],ChessPiece.Color.WHITE);
        board[0][7] = new Rook(kolona[0]+red[7],ChessPiece.Color.WHITE);
        board[0][1] = new Knight(kolona[0]+red[1],ChessPiece.Color.WHITE);
        board[0][6] = new Knight(kolona[0]+red[6],ChessPiece.Color.WHITE);
        board[0][2] = new Bishop(kolona[0]+red[2],ChessPiece.Color.WHITE);
        board[0][3] = new Queen(kolona[0]+red[3],ChessPiece.Color.WHITE);
        board[0][4] = new King(kolona[0]+red[4],ChessPiece.Color.WHITE);
        board[0][5] = new Bishop(kolona[0]+red[5],ChessPiece.Color.WHITE);
        //Ostale crne figure
        board[7][7] = new Rook(kolona[7]+red[7],ChessPiece.Color.BLACK);
        board[7][0] = new Rook(kolona[7]+red[0],ChessPiece.Color.BLACK);
        board[7][6] = new Knight(kolona[7]+red[6],ChessPiece.Color.BLACK);
        board[7][1] = new Knight(kolona[7]+red[1],ChessPiece.Color.BLACK);
        board[7][2] = new Bishop(kolona[7]+red[2],ChessPiece.Color.BLACK);
        board[7][3] = new Queen(kolona[7]+red[3],ChessPiece.Color.BLACK);
        board[7][4] = new King(kolona[7]+red[4],ChessPiece.Color.BLACK);
        board[7][5] = new Bishop(kolona[7]+red[5],ChessPiece.Color.BLACK);
    }
    
    public void move(Class type, ChessPiece.Color color, String position) {}
    public void move(String oldPosition, String newPosition){}
    public boolean isCheck(ChessPiece.Color color) {return false;
    }
}
