package ba.unsa.etf.rpr;

public class ChessPiece {
    private boolean isLegalPosition(String s) {
        if(s.length()!=2 || s.charAt(0)<'A' || s.charAt(0)>'H' || s.charAt(1)<'0' || s.charAt(1)>'8' ) return false;
        else return true;
    }

    private String position;
    private String color;
    public enum Color{BLACK,WHITE};
    public ChessPiece(String pozicija, String boja) {}
    public String getPosition() {return this.position;}
    public String getColor() {return this.color;}
    public void move(String position) {

    }

}
