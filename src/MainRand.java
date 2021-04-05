import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module3
 * @class Main
 * @since 04.04.2021 - 14.14
 **/

public class MainRand {
    public static void main(String[] args) {
        System.out.println("Array list Create");

        ArrayList<Integer> arrayList = new ArrayList<>();

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 100_000; i++) {
            int a = (int) (Math.random() * 100_000);
            arrayList.add(a);
        }
        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Array list creation time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());
        System.out.println("\nArray list Insert");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            arrayList.add(10, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Insert Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        int middle = arrayList.size() / 2;
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            arrayList.add(middle, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Insert Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            arrayList.add(100_000, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Insert End time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());
        System.out.println("\nArray list Update");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            arrayList.set(10 + i, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Update Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        middle = arrayList.size() / 2;
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            arrayList.set(middle + i, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Update Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            arrayList.set(100_000 - i, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Update End time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());
        System.out.println("\nArray list Delete");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(10);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Delete Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(middle);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Delete Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - (1 + i));
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Delete End time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        System.out.println("\nLinked list Create-----------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<>();

        start = LocalDateTime.now();
        for (int i = 0; i < 100_000; i++) {
            int a = (int) (Math.random() * 100_000);
            linkedList.add(a);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list creation time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());
        System.out.println("\nLinked list Insert");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            linkedList.add(10, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Insert Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        middle = linkedList.size() / 2;
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            linkedList.add(middle, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Insert Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            linkedList.add(100_000, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Insert End time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());
        System.out.println("\nLinked list Update");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            linkedList.set(10 + i, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Update Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        middle = linkedList.size() / 2;
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            linkedList.set(middle + i, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Update Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            int a = (int) (Math.random() * 100_000);
            linkedList.set(100_000 - i, a);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Update End time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());
        System.out.println("\nLinked list Delete");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(10);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Delete Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(middle);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Delete Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() - (1 + i));
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Delete End time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());
    }
}

/*      Array list Create                       Linked list Create
        Array list creation time = 31           Linked list creation time = 53
        Current size = 100000                   Current size = 100000
        Result: Array list is faster


        Array list Insert                       Linked list Insert
        Array list Insert Start time = 37       Linked list Insert Start time = 0
        Current size = 101000                   Current size = 101000
        Result: Linked list is faster

        Array list Insert Middle time = 10      Linked list Insert Middle time = 147
        Current size = 102000                   Current size = 102000
        Result: Array list is faster

        Array list Insert End time = 0          Linked list Insert End time = 4
        Current size = 103000                   Current size = 103000
        Result: Array list is faster


        Array list Update                       Linked list Update
        Array list Update Start time = 1        Linked list Update Start time = 1
        Current size = 103000                   Current size = 103000
        Result: Same speed

        Array list Update Middle time = 0       Linked list Update Middle time = 96
        Current size = 103000                   Current size = 103000
        Result: Array list is faster

        Array list Update End time = 0          Linked list Update End time = 5
        Current size = 103000                   Current size = 103000
        Result: Array list is faster


        Array list Delete                       Linked list Delete
        Array list Delete Start time = 40       Linked list Delete Start time = 0
        Current size = 102000                   Current size = 102000
        Result: Linked list is faster

        Array list Delete Middle time = 11      Linked list Delete Middle time = 98
        Current size = 101000                   Current size = 101000
        Result: Array list is faster

        Array list Delete End time = 1          Linked list Delete End time = 0
        Current size = 100000                   Current size = 100000
        Result: Same speed

        Array list is faster when it comes to processing data in the middle of the list.
        Linked list is faster in the beginning of the list.
        Speed is roughly the same in the end of the list.
*/
