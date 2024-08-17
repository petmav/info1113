public class InheritanceTwo {
        
        public static void main(String[] args) {

            Child c = new Child("John Doe", 10, "Ashfield Boys High School");

            c.getOlder();

            System.out.println(c.getName());
            System.out.println(c.getAge());
            System.out.println(c.school);
    
        }

}

class Parent {

    private String name;
    private int age;

    public Parent(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public void getOlder() {

        age++;

    }

    public String getName () {

        return name;

    }

    public int getAge() {

        return age;

    }
}

class Child extends Parent {

    String school;

    public Child(String name, int age, String school) {

        super(name, age);
        this.school = school;

    }
}
