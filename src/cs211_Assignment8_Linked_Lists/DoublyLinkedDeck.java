package cs211_Assignment8_Linked_Lists;

class DoublyLinkedDeck {
    private DoubleNode head;
    private DoubleNode current;

    public DoublyLinkedDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        DoubleNode tail = null;

        for (String suit : suits) {
            for (String rank : ranks) {
                DoubleNode newNode = new DoubleNode(new Card(rank, suit));
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
            }
        }
        current = head;
    }

    public void advanceForward() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Reached end of deck.");
        }
    }

    public void advanceBackward() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("At beginning of deck.");
        }
    }

    public void inspect(Card searchCard) {
        if (current != null) {
            System.out.println("Current card: " + current.card);
            if (current.card.equals(searchCard)) {
                System.out.println("Card FOUND!");
            }
        } else {
            System.out.println("No card selected.");
        }
    }
}


