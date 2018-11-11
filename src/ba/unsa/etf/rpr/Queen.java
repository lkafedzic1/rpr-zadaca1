package ba.unsa.etf.rpr;

import static java.lang.Math.abs;

public class Queen extends ChessPiece {
    Queen(String position, Color color) {

        super(position, color);
    }

    @Override
    public void move(String n_position) throws IllegalArgumentException, IllegalChessMoveException {
        if (!isLegalPosition(n_position)) throw new IllegalArgumentException();
        else if ((abs(this.getPosition().charAt(0) - n_position.charAt(0)) == abs(this.getPosition().charAt(1) - n_position.charAt(1))) ||
                ((this.getPosition().charAt(0)- n_position.charAt(0))==0) || (this.getPosition().charAt(1)-n_position.charAt(1))==0)
            this.setPosition(n_position);
        else throw new IllegalChessMoveException();

    }




}
