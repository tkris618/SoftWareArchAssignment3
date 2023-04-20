package wctc.edu.test;
import org.junit.Before;
import org.junit.Test;
import wctc.edu.Card;
import wctc.edu.Game;

import static org.junit.Assert.assertTrue;
import static wctc.edu.Face.*;
import static wctc.edu.Suit.*;

class GameTest {
    private Card[] hand;

    @Before
    public void setUp() {
        hand = new Card[]{new Card(JACK,CLUBS, 11), new Card(FIVE,CLUBS, 5), new Card(JACK,SPADES, 11)};
    }

    @Test
    public void twoOfAKindTest() {
        assertTrue("Two of a kind should have matched",Game.twoOfAKind(hand));
    }

    @Before
    public void setUpTwo() {
        hand = new Card[]{new Card(ACE, SPADES, 1), new Card(ACE, HEARTS, 1), new Card(ACE, CLUBS, 1)};
    }

    @Test
    public void threeOfKindTest() {assertTrue("Three of a kind should match.", Game.threeOfAKind(hand));
    }

    @Before
    public void setUpThree() {
        hand = new Card[]{new Card(FIVE, HEARTS, 5), new Card(SIX, HEARTS, 6), new Card(SEVEN, HEARTS, 7), new Card(EIGHT, HEARTS, 8), new Card(NINE, HEARTS, 9)};
    }
    @Test
    public void straightFlushTest() {assertTrue("Straight flush!", Game.straightFlush(hand));
    }

    @Before
    public void setUpFour() {
        hand = new Card[]{new Card(ACE, DIAMONDS, 1), new Card(ACE, CLUBS, 1), new Card(ACE, HEARTS, 1), new Card(SEVEN, DIAMONDS, 7), new Card(SEVEN, CLUBS, 7)};
    }

    @Test
    public void fullHouseTest() {assertTrue("Full house!", Game.straightFlush(hand));}

    @Before
    public void setUpFive() {
        hand = new Card[]{new Card(ACE, HEARTS, 1), new Card(TEN, HEARTS, 10), new Card(JACK, HEARTS, 10), new Card(KING, HEARTS, 10), new Card(QUEEN, HEARTS, 10), new Card(KING, HEARTS, 10)};
    }

    @Test
    public void royalFlushTest() {assertTrue("Royal FLush!", Game.royalFlush(hand));}
}