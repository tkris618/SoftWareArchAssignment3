package wctc.edu;

import java.util.Arrays;
/**
 * This is the utility class consisting of static methods to determine if a hand
 * @author Lady Tiffany Kristian, the tired.
 * @version 1.0
 */
public class Game {
    /**
     * @param hand An Array of cards
     * @return True if there are two of a kind and false if not
     */
    public static boolean twoOfAKind(Card[] hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOFmatches = 0;
        for(int i=0;i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }

    /**
     * @param hand An Array of cards
     * @return True if there is three of a kind and false if not
     */
    public static boolean threeOfAKind(Card[]hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOfMacthes = 0;
        for(int i=0; i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }

    /**
     * @param hand An Array of cards
     * @return True if there are five cards with the same color and same suit
     */

    public static boolean straightFlush(Card[]hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOfMacthes = 0;
        for(int i=0; i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }

    /**
     * @param hand An array of cards
     * @return true if the hand contains three cards of one rank and two card of another.
     */

    public static boolean fullHouse(Card[]hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOfMacthes = 0;
        for(int i=0; i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }

    /**
     * @param hand An array of cards
     * @return true if a straight from a ten to an ace and all five cards of the same suit. if not false
     */
    public static boolean royalFlush(Card[]hand) {
        Arrays.sort(hand, (a, b) -> a.getFace().compareTo(b.getFace()));
        int numberOfMacthes = 0;
        for(int i=0; i < hand.length-1; i++) {
            if (hand[i].getFace().equals(hand[i+1].getFace())) return true;
        }
        return false;
    }



}
