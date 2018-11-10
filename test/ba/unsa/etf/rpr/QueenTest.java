package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @Test
    void moveDiagonal() {
        Queen q = new Queen("E1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> q.move("D2")
        );
    }
    @Test
    void moveRight() {
        Queen q = new Queen("E1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> q.move("E2")
        );
    }
    @Test
    void moveLeft() {
        Queen q = new Queen("E4", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> q.move("E7")
        );
    }
    @Test
    void moveFront() {
        Queen q = new Queen("E1", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> q.move("E5")
        );
    }
    @Test
    void moveBack() {
        Queen q = new Queen("D4", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> q.move("D2")
        );
    }
    @Test
    void moveWrong() {
        Queen q = new Queen("D4", ChessPiece.Color.WHITE);
        assertThrows(IllegalChessMoveException.class,
                () -> q.move("f5")
        );
    }
    @Test
    void constructor1() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Queen("I2", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor2() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Queen("B9", ChessPiece.Color.WHITE)
        );
    }

    @Test
    void constructor3() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Queen("", ChessPiece.Color.WHITE)
        );
    }
    @Test
    void moveIllegal1() {
        Queen k = new Queen("C1", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("C0")
        );
    }

    @Test
    void moveIllegal2() {
        Queen k = new Queen("H1", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("I1")
        );
    }

    @Test
    void moveIllegal3() {
        Queen k = new Queen("C1", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("")
        );
    }
    @Test
    void moveIllegal4(){
        Queen k = new Queen("C1", ChessPiece.Color.BLACK);
        assertThrows(
                IllegalArgumentException.class,
                () -> k.move("Start")
        );
    }

}