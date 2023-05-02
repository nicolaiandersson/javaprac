/*
Øvelse 5
1. Lav en klasse ”Card” med to attributter ”suit” og ”value”
• Suit kan være ”hearts”, ”diamonds”, ”clubs” eller ”spades” – value kan være 1-
13
2. Tilføj en metode ”beats” der modtager et andet Card og fortæller
om dette korts værdi slår det andets værdi (ignorer suit)
3. Ret metoden så den også tager højde for suit – spades slår hearts,
som slår diamonds som slår clubs.
 */

public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        if(!isValidSuit(suit)) {
            throw new IllegalArgumentException("Enter valid suit");
        }
        if(!isValidValue(value)) {
            throw new IllegalArgumentException("Enter valid value. Between 1 and 14");
        }
        this.suit = suit;
        this.value = value;
    }

    public boolean isValidSuit(String suit) {
        return suit.equals("hearts") || suit.equals("clubs") || suit.equals("diamonds") || suit.equals("spades");
    }

    public boolean isValidValue(int value) {
        return value >= 1 && value <= 14;
    }

    public boolean beats(Card card) {
        if (suit.equals("spades") && card.suit.equals("hearts")) {
            return true;
        } else if (suit.equals("hearts") && card.suit.equals("diamonds")) {
            return true;
        } else if (suit.equals("diamonds") && card.suit.equals("clubs")) {
            return true;
        } else if (value > card.value && suit.equals(card.suit)) {
            return true;
        } else if (value > card.value && !suit.equals(card.suit)) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        Card card = new Card("hearts", 10);
        Card card2 = new Card("spades", 8);

        System.out.println(card.beats(card2));

    }
}
