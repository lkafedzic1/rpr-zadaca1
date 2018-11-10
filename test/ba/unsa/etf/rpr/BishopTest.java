package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {



    @Test
    void move() {
        Bishop b = new Bishop("D5", ChessPiece.Color.WHITE);
        assertDoesNotThrow(
                () -> b.move("F7")
        );
    }
}