// class implementation of the enum Cards, for demonstration purposes

public class CardsClass {

  private final String shorthand;
  private final String colour;

  CardsClass HEART =
      new CardsClass("H", "red") {
        public String getColour() {
          return "pink";
        }
      };

  public CardsClass(String shorthand, String colour) {
    this.shorthand = shorthand;
    this.colour = colour;
  }
}
