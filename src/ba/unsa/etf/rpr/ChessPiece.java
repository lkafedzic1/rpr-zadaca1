package ba.unsa.etf.rpr;

public class ChessPiece {
    boolean isLegalPosition(String s) {
        return s.length() == 2 && ((s.charAt(0) >= 'A' && s.charAt(0) <= 'H') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'h'))
                && (s.charAt(1) > '0' && s.charAt(1) <= '8');
    }

    private String position;
    private Color color;
    public enum Color{BLACK,WHITE}
    public ChessPiece(String n_pos, Color n_col) throws IllegalArgumentException {
        if (!isLegalPosition(n_pos)) throw new IllegalArgumentException();
        position=n_pos;
        color=n_col;
    }
    void setPosition(String pos) {this.position=pos;}
    String getPosition() {return this.position;}
    public Color getColor() {return this.color;}
    public void move(String position) throws IllegalChessMoveException, IllegalArgumentException {}
}
