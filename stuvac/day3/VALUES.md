HOW WE SEE THE CONSTRUCTION/DEFINITION OF AN ENUM:

```java
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
```

HOW THE COMPILER SEES IT:

```java
public final class Day extends Enum<Day> {
    public static final Day SUNDAY = new Day("SUNDAY", 0);
    public static final Day MONDAY = new Day("MONDAY", 1);
    public static final Day TUESDAY = new Day("TUESDAY", 2);
    public static final Day WEDNESDAY = new Day("WEDNESDAY", 3);
    public static final Day THURSDAY = new Day("THURSDAY", 4);
    public static final Day FRIDAY = new Day("FRIDAY", 5);
    public static final Day SATURDAY = new Day("SATURDAY", 6);

    // Static array containing all enum constants
    private static final Day[] $VALUES = new Day[] {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    };

    // Private constructor
    private Day(String name, int ordinal) {
        super(name, ordinal);
    }

    // Generated values() method
    public static Day[] values() {
        return $VALUES.clone();
    }

    // Generated valueOf() method
    public static Day valueOf(String name) {
        return (Day) Enum.valueOf(Day.class, name);
    }
}
```