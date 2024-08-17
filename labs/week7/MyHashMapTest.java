// testing class for MyHashMap
public class MyHashMapTest{
    public static void main(String[] args){
        MyHashMap<String, Integer> vehicle = new MyHashMap<String, Integer>();
        //stores vehicle name and number of seats
        vehicle.put("Bus", 30);
        vehicle.put("Bike", 2);
        vehicle.put("Car", 5);
        vehicle.put("Bus", 50);
        System.out.println("Output1: ");

        //skipcq
        for(String vehicleType : vehicle.keySet())
            System.out.println(vehicleType + " " +vehicle.get(vehicleType));
   
        MyHashMap<Integer, Integer> student =
        new MyHashMap<Integer, Integer>();
        //stores studentId and their marks

        student.put(12345, 80);
        student.put(21345, 90);
        student.put(36548, 50);
        student.put(36548, 70);
        System.out.println("Output2: ");

        //skipcq
        for(Integer sid : student.keySet())
            System.out.println(sid + " " +student.get(sid));
        }
    }