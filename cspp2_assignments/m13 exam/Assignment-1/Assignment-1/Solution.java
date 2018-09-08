import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Mounika2010
 */
class Set {
    //your code goes here...
    //Good luck :-)
    /**
     * private class.
     */
    private int[] set;
    /**
     * private class.
     */
    private int size;
    /**
     * Constructs the object.
     */
    public void Set() {
        final int s = 10;
        set = new int[s];
        size = 0;
    }

}


    public int size(final int item) {
        return size;
    }

    public boolean contains(final int item) {
        return indexOf(items) = -1;
    }


    public String toString() {
        String str = "{";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                str += set[i];
            } else {
                str += set[i] + ", ";
        }
    }
        str += "}"
}


    public void indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (item == set[i]) {
                return i;

            }

        } return -1;
    }

    public void add(final int item) {
        if (size < set.length) {
            set[size++] = item;
        } else {
            resize(item);
        }
    }

    public void resize(final int item) {
        set = Arrays.copyOf(set, size * 2);
        set[size++] = item;
    }

    publc void add(final int[] item) {
        if (item == item.set) {
            set[size] = item;
            size++;

        }
    }

    public Set intersection(Set elmt) {
        Set set1 = new Set();
        for (i = 0; i < size; i++) {
            for (j = 0; j < elmt.size; j++) {
                if (size[i] == elmt.set[j]) {
                    set1.add(elmt.set[j]);
                
                }

            }

        }
        return set1;
    }

    public Set retainAll(int[] elmts) {
        Set rset = new Set();
        for (int i = 0; i < size; i++) {
            for(int j = 0; j < elmts.length; j++) {                
                if(set[i] == elmts[j]) {
                    rset.add(elmts[j]);
            }
            }
        }
        return rSet;
    }

    /**
     * Solution class for code-eval.
    */
public final class Solution {
        /**
        * Constructs the object.
        */
    private Solution() {
        //constructor is used.
    }
        /**
         * helper function to convert string input to int array.
         *
         * @param      s     { string input from test case file }
         *
         * @return     { int array from the given string }
         */
    public static int[] intArray(final String s) {
            String input = s;
        if (input.equals("[]")) {
                return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        }
        /**
         * main function to execute test cases.
         *
         * @param      args  The arguments
         */
    public static void main(final String[] args) {
            // instantiate this set
            Set s = new Set();
            // code to read the test cases input file
            Scanner stdin = new Scanner(new BufferedInputStream(System.in));
            // check if there is one more line to process
        while (stdin.hasNext()) {
                // read the line
            String line = stdin.nextLine();
                // split the line using space
            String[] tokens = line.split(" ");
                // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                    System.out.println(s.size());
                break;
            case "contains":
                    System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                    System.out.println(s);
                break;
            case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                        s.add(intArray[0]);
                } else {
                        s.add(intArray);
                }
                break;
            case "intersection":
                    s = new Set();
                    Set t = new Set();
                    intArray = intArray(tokens[1]);
                    s.add(intArray);
                    intArray = intArray(tokens[2]);
                    t.add(intArray);
                    System.out.println(s.intersection(t));
                break;
            case "retainAll":
                    s = new Set();
                    intArray = intArray(tokens[1]);
                    s.add(intArray);
                    intArray = intArray(tokens[2]);
                    System.out.println(s.retainAll(intArray));
                break;
            case "cartesianProduct":
                    s = new Set();
                    t = new Set();
                    intArray = intArray(tokens[1]);
                    s.add(intArray);
                    intArray = intArray(tokens[2]);
                    t.add(intArray);
                    System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
            default:
                break;

            }
        }
    }
}
