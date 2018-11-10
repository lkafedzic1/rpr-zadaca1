package ba.unsa.etf.rpr;

import static java.lang.Math.abs;

public class Bishop extends ChessPiece {


    public Bishop(String position, Color color) {
        super(position, color);
    }

    @Override
    public void move(String n_position) throws IllegalArgumentException, IllegalChessMoveException {
        if (!isLegalPosition(n_position)) throw new IllegalArgumentException();
        if (abs(position.charAt(0) - n_position.charAt(0)) == abs(position.charAt(1) - n_position.charAt(1)) )
            position = n_position;
        else throw new IllegalChessMoveException();
    }
}