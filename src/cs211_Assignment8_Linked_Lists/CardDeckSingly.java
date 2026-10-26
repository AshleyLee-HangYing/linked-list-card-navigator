package cs211_Assignment8_Linked_Lists;
import java.util.Scanner;

public class CardDeckSingly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedDeck deck = new SinglyLinkedDeck();

        System.out.print("Enter a card to search (e.g., 7 Spades): ");
        String rank = scanner.next();
        String suit = scanner.next();
        Card searchCard = new Card(rank, suit);

        String command;
        do {
            System.out.print("Enter command (N=next, I=inspect, Q=quit): ");
            command = scanner.next().toUpperCase();

            switch (command) {
                case "N":
                case ">":
                    deck.advance();
                    break;
                case "I":
                case "VIEW":
                    deck.inspect(searchCard);
                    break;
                case "Q":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        } while (!command.equals("Q"));

        scanner.close();
    }
}




