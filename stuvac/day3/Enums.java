// Enumerable not Enumerator
// Enums are a way to create a set of constants

public class Enums {

    public static int x = 5;

    public static void main(String[] args) {
        
        Enums m = new Enums(); // works because constructor is automatically created if not specified

        // an equivalent way to create an enum is
        // int[] c = int[] {0, 1, 2, 3};
        // as they're both a set of constants
        // however enums can have methods and fields

        System.out.println(x);

        // Card c1 = new Card(); - does not work as constructor is private (self-contained)
        // Card c2 = Card(); - does not work as constructor is private (self-contained)
        // Card c3 = Card.HEARTS(); - does not work as constructor is private (self-contained)
        // Card c4 = Card.HEARTS; - works as it is a constant

        Card c = Card.HEARTS;

        // the line above goes through every enum value and calls the constructor of each,
        // passing the value of the enum to the constructor for each instance

        System.out.println(c);
        System.out.println(c.ordinal()); // 1, this is the index of the enum
        System.out.println(c.num + " <This is the num of c>"); // null

        // Index = ordinal value
        // ords[index] = enum value
        Card[] cards = Card.values(); // returns an array of all the enum values



        for (Card card : cards) {
            System.out.println(card); // prints all the enum values in order
        }

        cards.toString(); // prints the memory address of the array

    }

}

enum Card {

    SPADES("1"), // each instance of the enum is created by calling the constructor, therefore the constructor must be called and the value must be passed
    HEARTS("2"),
    DIAMONDS("3"),
    CLUBS("4");

    String num;

    Card(String num) { // enum constructor, really just a method
       System.out.println("Creating a new card");
       this.num = num;
    }

}