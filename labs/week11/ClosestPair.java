import java.util.List;
 import java.util.ArrayList;
 import java.util.Random;

 class Point {
    private double x;
    private double y;

    public Point(double x, double y) { this.x = x; this.y = y; }

    public double x() { return x; }

    public double y() { return y; }

    public String toString() { return "(" + x + "," + y + ")"; }
 }

 public class ClosestPair {

    public static List<? extends Point> generatePoints(int n) {

        List<Point> points = new ArrayList<Point>();
        Random r = new Random();

        for(int i = 0; i < n; i++) {

            points.add(new Point(r.nextDouble(), r.nextDouble()));

        }

        return points;
    }


    public static Point[] closestPair(List<? extends Point> points) {

        Point[] pair = new Point[2];

        double minDistance = Double.MAX_VALUE; // Set to max value so that the first distance will always be less than this

        for(int i = 0; i < points.size(); i++) {

            for(int j = i + 1; j < points.size(); j++) {

                double distance = calculateDistance(points.get(i), points.get(j));

                if(distance < minDistance) {

                    minDistance = distance; // Update the minimum distance
                    pair[0] = points.get(i);
                    pair[1] = points.get(j);
                }
            }
        }
        

        return pair;
    }

    public static double calculateDistance(Point p1, Point p2) {

        double x1 = p1.x();
        double y1 = p1.y();
        double x2 = p2.x();
        double y2 = p2.y();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        LocationPoint p1 = new LocationPoint(1, 2, "Sydney");
        LocationPoint p2 = new LocationPoint(3, 4, "Melbourne");

        
        List<Point> points = (List<Point>) generatePoints(100);
        points.add(p1);
        points.add(p2);

        for(Point p : points) {

            System.out.println(p);
        }

        Point[] pair = closestPair(points);

        System.out.println("Closest pair: " + pair[0] + " " + pair[1]);
    }
 }

 class LocationPoint extends Point {

    String location;

    public LocationPoint(double x, double y, String location) {

        super(x, y);
        this.location = location;
    }
 }