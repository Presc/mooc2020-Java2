import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(hand);
    }

    private int handValue() {
        return this.hand.stream()
                .map(Card::getValue)
                .mapToInt(Integer::intValue)
                .sum();
    }

    @Override
    public int compareTo(Hand other) {
        return this.handValue() - other.handValue();
    }

    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
