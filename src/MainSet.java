import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Croaker
 * @version 1.0.0
 * @project Module3
 * @class MainSet
 * @since 04.04.2021 - 15.18
 **/
public class MainSet {
    public static void main(String[] args) {
        System.out.println("Array list Create");

        ArrayList<Integer> arrayList = new ArrayList<>();

        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(1);
        }
        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Array list creation time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());
        System.out.println("\nArray list Insert");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(10, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Insert Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        int middle = arrayList.size() / 2;
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(middle, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Insert Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(100_000, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Insert End time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());
        System.out.println("\nArray list Update");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(10 + i, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Update Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        middle = arrayList.size() / 2;
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(middle + i, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Array list Update Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + arrayList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            arrayList.set(100_000 - i, 1);
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
            linkedList.add(1);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list creation time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());
        System.out.println("\nLinked list Insert");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(10, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Insert Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        middle = linkedList.size() / 2;
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(middle, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Insert Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(100_000, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Insert End time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());
        System.out.println("\nLinked list Update");

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(10 + i, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Update Start time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        middle = linkedList.size() / 2;
        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(middle + i, 1);
        }
        finish = LocalDateTime.now();

        System.out.println("Linked list Update Middle time = " + (int) ChronoUnit.MILLIS.between(start, finish));
        System.out.println("Current size = " + linkedList.size());

        start = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            linkedList.set(100_000 - i, 1);
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
        Array list creation time = 10           Linked list creation time = 30
        Current size = 100000                   Current size = 100000

        Array list Insert                       Linked list Insert
        Array list Insert Start time = 31       Linked list Insert Start time = 1
        Current size = 101000                   Current size = 101000
        Array list Insert Middle time = 9      Linked list Insert Middle time = 133
        Current size = 102000                   Current size = 102000
        Array list Insert End time = 0          Linked list Insert End time = 8
        Current size = 103000                   Current size = 103000

        Array list Update                       Linked list Update
        Array list Update Start time = 0        Linked list Update Start time = 0
        Current size = 103000                   Current size = 103000
        Array list Update Middle time = 0       Linked list Update Middle time = 100
        Current size = 103000                   Current size = 103000
        Array list Update End time = 1          Linked list Update End time = 6
        Current size = 103000                   Current size = 103000

        Array list Delete                       Linked list Delete
        Array list Delete Start time = 27       Linked list Delete Start time = 0
        Current size = 102000                   Current size = 102000
        Array list Delete Middle time = 8      Linked list Delete Middle time = 83
        Current size = 101000                   Current size = 101000
        Array list Delete End time = 0          Linked list Delete End time = 1
        Current size = 100000                   Current size = 100000
*/

