package ba.unsa.etf.rpr;

import static java.lang.Math.abs;

public class King extends ChessPiece {
    King(String position, ChessPiece.Color color) {
        super(position, color);

    }

    @Override
    public void move(String n_position) throws IllegalChessMoveException, IllegalArgumentException {
        //kretanje u desnu stranu i lijevu stranu, gore,dolje, dijagonalno
        if (!isLegalPosition(n_position)) throw new IllegalArgumentException();
        if ((abs(this.getPosition().charAt(1) - n_position.charAt(1)) <= 1) && (abs(this.getPosition().charAt(0) - n_position.charAt(0)) <= 1))
            setPosition(n_position);
        else throw new IllegalChessMoveException();

    }
}