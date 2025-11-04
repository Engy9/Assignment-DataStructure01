package assgiment01dstruc;
import java.util.ArrayList;

public class Assgiment01DStruc extends ExerciseSix{

    public static void main(String[] args) {

        // Question One
      System.out.println("Qustion One:");
        int[] numbers = {2, 4, 6, 7, 9};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array's elements :"+sum);
        System.out.println("******************************");

        // Question Two
        System.out.println("Qustion Two:");
        int[] arr2 = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] temp = new int[arr2.length];
        int j = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] != arr2[i + 1]) {
                temp[j++] = arr2[i];
            }
        }
        temp[j++] = arr2[arr2.length - 1];
        System.out.print("Array after removing duplicates: [");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i]);
            if (i < j - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("******************************");

        // Question Three
        System.out.println("Qustion Three:");
        int[] arr3 = {1, 2, 1, 3, 5, 1};
        int key = 1;
        int[] result = new int[arr3.length];
        int k = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] != key) {
                result[k++] = arr3[i];
            }
        }
        System.out.print("Array after removing " + key + ": [");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i]);
            if (i < k - 1) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("******************************");

        // Question Four
        System.out.println("Qustion Four:");  
        ArrayList<Integer> numberss = new ArrayList<>();
        numberss.add(2);
        numberss.add(4);
        numberss.add(6);
        numberss.add(7);
        numberss.add(9);
        int summ = 0;
        for (int i = 0; i < numberss.size(); i++) {
            summ += numberss.get(i);
        }
        System.out.println("Sum of ArrayList elements: " +summ);
        System.out.println("******************************");

        // Question Five
        System.out.println("Qustion Five:");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        ArrayList<Integer> noDup = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            if (i == 0 || !list2.get(i).equals(list2.get(i - 1))) {
                noDup.add(list2.get(i));
            }
        }
        System.out.println("List after removing duplicates: " + noDup);
        System.out.println("******************************");

        // Question Six
        System.out.println("Qustion Six:");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(1);
        list3.add(3);
        list3.add(5);
        list3.add(1);

        int key2 = 1;
        ArrayList<Integer> filtered = ExerciseSix.removeAllOccurrencesList(list3, key2);
        System.out.println("List after removing " + key2 + ": " + filtered);
    }
}

