package cs211_Assignment8_Linked_Lists;


class Card {
    String rank;
    String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }

    public boolean equals(Card other) {
        return this.rank.equalsIgnoreCase(other.rank) && this.suit.equalsIgnoreCase(other.suit);
    }
}



