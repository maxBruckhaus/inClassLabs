/**
 * Created by MAXIMILLION on 1/8/15.
 */
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Lab17_0 {

    public static void main(String[] args) {

        Lab17_0 lab = new Lab17_0();

        ArrayList <Comparable> list = lab.initializeList();
        ArrayList <Comparable> copy = lab.duplicate(list);

        System.out.println("Before Bubble Sort:");
        System.out.println(list);

        lab.bubbleSort(list);	// runs your Bubble Sort code
        Collections.sort(copy);	// runs built-in sorting code
        Collections.reverse(copy);

        System.out.println("After Bubble Sort:");
        System.out.println(list);
        System.out.println(copy.toString().equals(list.toString()) ? "CORRECT" : "NOT SORTED PROPERLY");

        list = lab.initializeList();
        copy = lab.duplicate(list);
        System.out.println("\nBefore Selection Sort:");
        System.out.println(list);

        lab.selectionSort(list);	// runs your Selection Sort code
        Collections.sort(copy);		// runs built-in sorting code

        System.out.println("After Selection Sort:");
        System.out.println(list);
        System.out.println(copy.toString().equals(list.toString()) ? "CORRECT" : "NOT SORTED PROPERLY");

        list = lab.initializeList();
        copy = lab.duplicate(list);
        System.out.println("\nBefore Insertion Sort:");
        System.out.println(list);

        lab.insertionSort(list);	// runs your Insertion Sort code
        Collections.sort(copy);		// runs built-in sorting code
        Collections.reverse(copy);

        System.out.println("After Insertion Sort:");
        System.out.println(list);
        System.out.println(copy.toString().equals(list.toString()) ? "CORRECT" : "NOT SORTED PROPERLY");
    }

    /* Write code for a Bubble Sort algorithm that starts at the right side of
     * of ArrayList of Comparable objects and "bubbles" the largest item to the
     * left of the list.  The result should be an ArrayList arranged in descending
     * order.
    */
    public ArrayList bubbleSort(ArrayList <Comparable> list) {
        for (int i = 0; i < list.size(); i++){
            for (int x = list.size() - 1; x > 0; x--){
                if (list.get(x).compareTo(list.get(x-1)) > 0){
                    Comparable temp = list.get(x);
                    list.set(x, list.get(x - 1));
                    list.set(x-1, temp);
                }
            }
        }
        return list;
    }

    /* Write code for a Selection Sort algorithm that starts at the left side
     * of an ArrayList of Comparable objects and searches through the list for
     * the largest item and then swaps it with the last item in the list.  The
     * "last item" then becomes the item to its left. The result should be
     * an ArrayList arranged in ascending order.
    */
    void selectionSort(ArrayList <Comparable> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int jPos = -1;
            Comparable min = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(min) < 0) {
                    jPos = j;
                    min = list.get(j);
                }
            }
            if (jPos != -1){
                list.set(jPos, list.get(i));
                list.set(i, min);
            }
        }
    }

    /* Write code for an Insertion Sort algorithm that starts at the left side
     * of an ArrayList of Comparable objects and inserts the first item (in
     * position 1) into it's correct place within the first two items...then
     * inserts the third item into its correct place on the left, then the fourth
     * item into its correct place on the left, etc, until the last item is
     * inserted into the list.  Insert items so the result is an ArrayList arranged
     * in descending order.
    */
    void insertionSort(ArrayList <Comparable> list) {
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            Comparable key = list.get(position);

            while (position > 0 && list.get(position - 1).compareTo(key) < 0){
                list.set(position, list.get(position - 1));
                position--;
            }
            list.set(position, key);
        }
    }

    ArrayList <Comparable> initializeList() {

        String[] words = {"apple", "orange", "banana", "pear", "peach", "plum",
                "grape", "cherry", "apricot", "strawberry"};

        ArrayList <Comparable> temp = new ArrayList<Comparable>();
        ArrayList <Comparable> list = new ArrayList<Comparable>();

        for (int i = 0; i < words.length; i++)
            temp.add(words[i]);

        list.clear(); // clear the list before adding to it

        while (temp.size() > 0) {
            list.add(temp.remove((int)(Math.random()*temp.size())));
        }

        return list;
    }

    ArrayList <Comparable> duplicate(ArrayList<Comparable> list) {

        ArrayList<Comparable> listCopy = new ArrayList<Comparable>();

        Iterator<Comparable> iter = list.iterator();

        while(iter.hasNext()){
            listCopy.add(iter.next());
        }

        return listCopy;
    }
}