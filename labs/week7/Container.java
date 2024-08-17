// generic class, can be used for any type T, where T is a GenericType, but not an unknown type (I LOVE GENERICS!!!!! not)
public class Container<T> {

    // T exclusively references the type made in the class's initialization (i.e. Container<Integer>, means T = Integer)
    private T element;

    public Container(T element) {
        this.element = element;
    }

    public T get() {
        return element;
    }
    
    public void set(T element) {
        this.element = element;
    }

    public boolean isNull() {
        return element == null;
    }
}
