public class TheBar {

    // class and main method for testing all the classes
    public static void main(String[] args) {

        PlasticCup cup = new PlasticCup(0, 500);
        FilteredJug jug = new FilteredJug(0, 1000, 0);
        WineGlass glass = new WineGlass(0, 700, false);

        System.out.println(cup);
        System.out.println(jug);
        System.out.println(glass);

        cup.fill(500);
        jug.fill(1000);
        glass.fill(250);

        System.out.println(cup);
        System.out.println(jug);
        System.out.println(glass);

        cup.pour(jug, 100);
        jug.pour(glass, 100);
        glass.pour(cup, 100);

        System.out.println(cup);
        System.out.println(jug);
        System.out.println(glass);

    }
}
