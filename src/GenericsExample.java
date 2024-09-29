/*
 * Generics allow you to write classes, interfaces,
 * and methods that can operate on any data type,
 * while maintaining type safety at compile time.
 * This is particularly useful in collections.
 */
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // Create a generic list that can contain only Strings
        List<String> names = new ArrayList<>();
        names.add("Mario");
        names.add("Luigi");

        // Iterate through the list
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Create a generic class
        Box<Integer> box = new Box<>(123);
        System.out.println("Content of the box: " + box.getContent());
    }
}

// Definition of a generic class
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
/**
 * Generics Usage:
 *
 *     Demonstrates the use of generics in the List<String> to restrict the type of elements to String.
 *     The Box<T> class allows any type to be stored while maintaining type safety.
 *
 * Type Safety:
 *
 *     Generics ensure that you cannot add incompatible types to the list or box, reducing runtime errors.
 *
 * Iterating Collections:
 *
 *     Shows how to iterate over a generic list using a for-each loop.
 */
