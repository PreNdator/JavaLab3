import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static final int MAX_ITERATIONS = 100000;
    private static final int MIN_ITERATIONS = 10000;
    private static final String LINKED_LIST_TEXT = "LinkedList";
    private static final String ARRAY_LIST_TEXT = "ArrayList";

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = MIN_ITERATIONS; i<=MAX_ITERATIONS; i*=10) {
            SpeedTester.measureExecutionTime(() -> linkedList.add(1), i, System.out, LINKED_LIST_TEXT + " add");
            SpeedTester.measureExecutionTime(() -> arrayList.add(1), i, System.out, ARRAY_LIST_TEXT+ " add");
            System.out.println();
            SpeedTester.measureExecutionTime(() -> linkedList.get(0), i, System.out, LINKED_LIST_TEXT + " get first");
            SpeedTester.measureExecutionTime(() -> arrayList.get(0), i, System.out, ARRAY_LIST_TEXT+ " get first");
            SpeedTester.measureExecutionTime(() -> linkedList.get(linkedList.size()/2), i, System.out, LINKED_LIST_TEXT + " get from center");
            SpeedTester.measureExecutionTime(() -> arrayList.get(arrayList.size()/2), i, System.out, ARRAY_LIST_TEXT+ " get from center");
            System.out.println();
            SpeedTester.measureExecutionTime(() -> linkedList.remove(0), i, System.out, LINKED_LIST_TEXT + " del first");
            SpeedTester.measureExecutionTime(() -> arrayList.remove(0), i, System.out, ARRAY_LIST_TEXT+ " del first");
            SpeedTester.measureExecutionTime(() -> linkedList.add(1), i);
            SpeedTester.measureExecutionTime(() -> arrayList.add(1), i);
            SpeedTester.measureExecutionTime(() -> linkedList.remove(0), i, System.out, LINKED_LIST_TEXT + " del last");
            SpeedTester.measureExecutionTime(() -> arrayList.remove(0), i, System.out, ARRAY_LIST_TEXT+ " del last");
            SpeedTester.measureExecutionTime(() -> linkedList.add(1), i);
            SpeedTester.measureExecutionTime(() -> arrayList.add(1), i);
            SpeedTester.measureExecutionTime(() -> linkedList.remove(linkedList.size()/2), i, System.out, LINKED_LIST_TEXT + " del center");
            SpeedTester.measureExecutionTime(() -> arrayList.remove(arrayList.size()/2), i, System.out, ARRAY_LIST_TEXT+ " del center");
            System.out.println();
            SpeedTester.measureExecutionTime(() -> linkedList.add(1), i);
            SpeedTester.measureExecutionTime(() -> arrayList.add(1), i);
            SpeedTester.measureExecutionTime(() -> linkedList.toArray(), i, System.out, LINKED_LIST_TEXT + " to array");
            SpeedTester.measureExecutionTime(() -> arrayList.toArray(), i, System.out, ARRAY_LIST_TEXT+ " to array");

            System.out.println("\n-------------------------\n");
        }

    }
}
