package exercism;

import java.util.Map;
import java.util.stream.Stream;

public class Blackjack {

    private static final Map<String, Integer> CARDS = Map.ofEntries(
            Map.entry("ace", 11),
            Map.entry("two", 2),
            Map.entry("three", 3),
            Map.entry("four", 4),
            Map.entry("five", 5),
            Map.entry("six", 6),
            Map.entry("seven", 7),
            Map.entry("eight", 8),
            Map.entry("nine", 9),
            Map.entry("ten", 10),
            Map.entry("jack", 10),
            Map.entry("queen", 10),
            Map.entry("king", 10)
    );

    public int parseCard(String card) {

        if (!CARDS.containsKey(card)) {
            throw new IllegalArgumentException(String.format("Unknown card '%s'", card));
        }

        return CARDS.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {

        return Stream.of(card1, card2)
                .mapToInt(this::parseCard)
                .sum() == 21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

        if (!isBlackjack) {
            return Option.SPLIT.code;
        }

        if (dealerScore < 10) {
            return Option.AUTOMATICALLY_WIN.code;
        }

        return Option.STAND.code;
    }

    public String smallHand(int handScore, int dealerScore) {

        if (handScore >= 17) {
            return Option.STAND.code;
        }

        if (handScore <= 11) {
            return Option.HIT.code;
        }

        return dealerScore >= 7 ? Option.HIT.code : Option.STAND.code;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {

        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

    private enum Option {

        STAND("S"),
        HIT("H"),
        SPLIT("P"),
        AUTOMATICALLY_WIN("W");

        private final String code;

        Option(String code) {
            this.code = code;
        }
    }
}
