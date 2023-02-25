package Abstraction.CardRank;

public class CardRankMain {
    enum CardRank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for (CardRank value : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",value.ordinal(),value.name());
        }

    }
}
