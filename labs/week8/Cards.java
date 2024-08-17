// enums are classes with a fixed set of values, individual constructors, and methods
// for more information, see: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
// they're kinda useless tbh
public enum Cards {
    
    HEART ("H", "red") {
        public String getColour() {
            return "pink";
        }
    
    },
    DIAMOND ("D", "red"),
    SPADE ("S", "black"),
    CLUB ("C", "black");

    private final String shorthand;
    private final String colour;


    Cards(String shorthand, String colour) {
        this.shorthand = shorthand;
        this.colour = colour;
    }

    public String getShorthand() {
        return this.shorthand;
    }

    public String getColour() {
        return this.colour;
    }

    
}
