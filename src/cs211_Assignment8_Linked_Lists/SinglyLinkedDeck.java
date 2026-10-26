package cs211_Assignment8_Linked_Lists;

class SinglyLinkedDeck {
    private Node head;
    private Node current;

    public SinglyLinkedDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                addCard(new Card(rank, suit));
            }
        }

        current = head;
    }

    private void addCard(Card card) {
        Node newNode = new Node(card);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    

    public void advance() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Reached end of deck.");
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






