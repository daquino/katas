package com.refactify;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @After
    public void tearDown() {
        game = null;
    }

    @Test
    public void testGameStartsAtLove() {
        assertEquals("love - love", game.score());
    }

    @Test
    public void testPlayerOneWinsPoint() {
        game.playerOneWinsPoint();
        assertEquals("15 - love", game.score());
    }

    @Test
    public void testPlayerTwoWinsPoint() {
        game.playerTwoWinsPoint();
        assertEquals("love - 15", game.score());
    }

    @Test
    public void testBothPlayersWinsPoint() {
        game.playerOneWinsPoint();
        game.playerTwoWinsPoint();
        assertEquals("15 - all", game.score());
    }

    @Test
    public void testPlayerOneWinsTwoPoints() {
        playerOneWinsPoints(2);
        assertEquals("30 - love", game.score());
    }

    public void playerOneWinsPoints(int points) {
        for(int i = 0; i < points; i++) {
            game.playerOneWinsPoint();
        }
    }

    @Test
    public void testPlayerTwoWinsTwoPoints() {
        playerTwoWinsPoints(2);
        assertEquals("love - 30", game.score());
    }

    public void playerTwoWinsPoints(int points) {
        for(int i = 0; i < points; i++) {
            game.playerTwoWinsPoint();
        }
    }

    @Test
    public void testBothPlayersWinsTwoPoints() {
        playerOneWinsPoints(2);
        playerTwoWinsPoints(2);
        assertEquals("30 - all", game.score());
    }

    @Test
    public void testPlayerOneWinsThreePoints() {
        playerOneWinsPoints(3);
        assertEquals("40 - love", game.score());
    }

    @Test
    public void testPlayerTwoWinsThreePoints() {
        playerTwoWinsPoints(3);
        assertEquals("love - 40", game.score());
    }

    @Test
    public void testBothPlayersWinsThreePoints() {
        playerOneWinsPoints(3);
        playerTwoWinsPoints(3);
        assertEquals("40 - all", game.score());
    }

    @Test
    public void testPlayerOneHasAdvantage() {
        playerOneWinsPoints(3);
        playerTwoWinsPoints(3);
        game.playerOneWinsPoint();
        assertEquals("ad in", game.score());
    }

    @Test
    public void testPlayerTwoHasAdvantage() {
        playerOneWinsPoints(3);
        playerTwoWinsPoints(3);
        game.playerTwoWinsPoint();
        assertEquals("ad out", game.score());
    }

    @Test
    public void testPlayerOneWinsSet() {
        playerOneWinsPoints(4);
        assertEquals("Set - Player One", game.score());
    }

    @Test
    public void testPlayerTwoWinsSet() {
        playerTwoWinsPoints(4);
        assertEquals("Set - Player Two", game.score());
    }

    @Test
    public void testPlayerOneWinsSetIfOverTwoPointsOfPlayerTwoAtThreePoints() {
        playerOneWinsPoints(3);
        playerTwoWinsPoints(3);
        playerOneWinsPoints(2);
        assertEquals("Set - Player One", game.score());
    }

    @Test
    public void testPlayerTwoWinsSetIfOverTwoPointsOfPlayerOneAtThreePoints() {
        playerOneWinsPoints(3);
        playerTwoWinsPoints(5);
        assertEquals("Set - Player Two", game.score());
    }
}
