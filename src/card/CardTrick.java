/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
//Johnathon Chin-Maynard
//991200827
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(numGen());
            c.setSuit(Card.SUITS[ranNumGen(0,3)]);
            magicHand[i] = c;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick a number from 1 to 13: ");
        int cardNum = scanner.nextInt();
        System.out.println("Please pick 0-hearts, 1-diamonds, 2-spades, 3-clubs: ");
        int cardShape = scanner.nextInt(); 
        
        Card guessCard = new Card();
        guessCard.setValue(cardNum);
        guessCard.setSuit(Card.SUITS[cardShape]);
        
        boolean corrCard = false;
        for (Card card: magicHand) {
            if (card == guessCard) {
                corrCard = true;
                break;
            }
        }
        
        if (corrCard) {
            System.out.println("Good guess");
        } else {
            System.out.println("Try again");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
    private static int numGen() {
        return ranNumGen(1,13);
    }
    private static int ranNumGen(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
