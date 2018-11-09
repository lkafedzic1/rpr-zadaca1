package ba.unsa.etf.rpr;

public class King extends ChessPiece{
    public King(String position, ChessPiece.Color color) {
        super(position,color);

    }
    @Override
    public void move(String n_position) throws IllegalChessMoveException {
        //kretanje u desnu stranu i lijevu stranu, gore,dolje, dijagonalno
        if((this.position.charAt(0)+1==n_position.charAt(0) && this.position.charAt(1)==n_position.charAt(1))
        || (this.position.charAt(0)-1==n_position.charAt(0) && this.position.charAt(1)==n_position.charAt(1))
            || (this.position.charAt(0)==n_position.charAt(0) && this.position.charAt(1)+1==n_position.charAt(1))
        || (this.position.charAt(0)==n_position.charAt(0) && this.position.charAt(1)-1==n_position.charAt(1))

        || (this.position.charAt(0)+1==n_position.charAt(0) && this.position.charAt(1)+1==n_position.charAt(1))
        || (this.position.charAt(0)-1==n_position.charAt(0) && this.position.charAt(1)-1==n_position.charAt(1))
        || (this.position.charAt(0)+1==n_position.charAt(0) && this.position.charAt(1)-1==n_position.charAt(1))
        || (this.position.charAt(0)-1==n_position.charAt(0) && this.position.charAt(1)+1==n_position.charAt(1)))
            position=n_position;
        else throw new IllegalChessMoveException();
    }
}
