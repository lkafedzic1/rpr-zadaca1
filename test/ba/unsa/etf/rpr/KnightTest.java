package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {



    @Test
    void move() {
        Knight k = new Knight("B1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> k.move("C3")
        );

    }
    @Test
    void moveDiagonal() {
        Knight k = new Knight("D5", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> k.move("F7")
        );
    }
    @Test
    void moveBack() {
        Knight n = new Knight("D3", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> n.move("D2")
        );
    }
    @Test
    void moveLeftt() {
        Knight n = new Knight("D3", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> n.move("C3")
        );
    }
    @Test
    void moveRight() {
        Knight n = new Knight ("D3", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> n.move("E3")
        );
    }
    @Test
    void moveFront() {
        Knight n = new Knight("D3", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> n.move("D7")
        );
    }
    @Test
    void constructor1() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Knight("I2", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Knight("B9", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor3() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Knight("", ChessPiece.Color.WHITE)
        );
    }
    @Test
    void constructor4() {
        assertThrows(IllegalArgumentException.class,
                ()->new Knight("Start",ChessPiece.Color.WHITE));
    }
}