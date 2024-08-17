// wonderful world of DSA
// singly linked list

// structure implements iterable as 
public class LinkedList<T> implements Iterable {

    int size = 0;
    Node<T> head = null;

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new myIterator<T>(head);
    }

    // adding T to linked list
    public T add(T element) {

        Node<T> newNode = new Node<T>();
        newNode.element = element;
        newNode.next = null;

        if (head == null) {

            head = newNode;

        } else {

            Node<T> last = head;

            while (last.next != null) {

                last = last.next;

            }

            last.next = newNode;
        }

        size++;

        return newNode.element;

    }

    public T get(int index) {

        Node<T> current = head;
        int count = 0;

        while (current != null) {

            if (count == index) {

                return current.element;

            }

            count++;
            current = current.next;

        }

        return null;

    }

    public T set(int index, T element) {

        Node<T> current = head;
        int count = 0;

        while (current != null) {

            if (count == index) {

                current.element = element;
                return current.element;

            }

            count++;
            current = current.next;

        }

        return null;

    }

    public T remove(int index) {

        try {

            if (index < 0 || index >= this.size()) {

                throw new IndexOutOfBoundsException();

            }
            
        } catch (IndexOutOfBoundsException e) {

            System.out.println("Index out of bounds");
            return null;

        }

        Node<T> current = head;
        Node<T> previous = null;
        int count = 0;

        while (current != null) {

            if (count == index) {

                if (previous == null) {

                    head = current.next;

                } else {

                    previous.next = current.next;

                }

                size--;
                return current.element;

            }

            count++;
            previous = current;
            current = current.next;

        }

        return null;

    }
    
}

// Node class necessary to handle data structure
class Node<E> {

    public E element;
    public Node<E> next;

}

// myIterator class to handle iteration through linked list
class MyIterator<T> implements Iterator<T> {

    Node<T> cursor;

    public myIterator(Node<T> head) {
        cursor = head;
    }

    public boolean hasNext() {
        return cursor != null;
    }

    public T next() {

        T value = cursor.element;

        cursor = cursor.next;

        return value;
    }

}
