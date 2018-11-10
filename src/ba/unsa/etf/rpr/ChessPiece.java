package ba.unsa.etf.rpr;

public class ChessPiece {
    boolean isLegalPosition(String s) {
        if(s.length()==2 && ((s.charAt(0)>='A' && s.charAt(0)<='H') || (s.charAt(0)>='a' && s.charAt(0)<='h'))
                && (s.charAt(1)>'0' && s.charAt(1)<='8') ) return true;
        return false;
    }

    protected String position;
    protected Color color;
    public enum Color{BLACK,WHITE};
    public ChessPiece(String position, Color color) throws IllegalArgumentException {
        if (!isLegalPosition(position)) throw new IllegalArgumentException();
    }
    public String getPosition() {return this.position;}
    public Color getColor() {return this.color;}
    public void move(String position) throws IllegalChessMoveException, IllegalArgumentException {}
}
