package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RookTest {
    @Test
    void moveRight() {
        Rook r = new Rook("E1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> r.move("E2")
        );
    }
    @Test
    void moveLeft() {
        Rook r = new Rook("E4", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> r.move("E7")
        );
    }
    @Test
    void moveFront() {
        Rook r = new Rook("E1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> r.move("E5")
        );
    }
    @Test
    void moveBack() {
        Rook r = new Rook("D4", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> r.move("D2")
        );
    }
    @Test
    void moveDiagonal() {
        Rook b = new Rook("D5", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> b.move("F7")
        );
    }
    @Test
    void constructor1() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Rook("I2", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Rook("B9", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor3() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Rook("", ChessPiece.Color.WHITE)
        );
    }
    @Test
    void moveIllegal1() {
        Rook k = new Rook("C1", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("C0")
        );
    }

    @Test
    void moveIllegal2() {
        Rook k = new Rook("H1", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("I1")
        );
    }

    @Test
    void moveIllegal3() {
        Rook k = new Rook("C1", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("")
        );
    }
    @Test
    void moveIllegal4(){
        Rook k = new Rook("C1", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("Start")
        );
    }


}