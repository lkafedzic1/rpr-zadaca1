package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    @Test
    void moveDiagonal() {
        Bishop b = new Bishop("D5", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> b.move("F7")
        );
    }
    @Test
    void moveBack() {
        Bishop b = new Bishop("D3", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> b.move("D2")
        );
    }
    @Test
    void moveLeftt() {
        Bishop b = new Bishop("D3", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> b.move("C3")
        );
    }
    @Test
    void moveRight() {
        Bishop b = new Bishop("D3", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> b.move("E3")
        );
    }
    @Test
    void moveFront() {
        Bishop b = new Bishop("D3", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> b.move("D7")
        );
    }
    @Test
    void constructor1() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Bishop("I2", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Bishop("B9", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor3() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Bishop("", ChessPiece.Color.WHITE)
        );
    }

}