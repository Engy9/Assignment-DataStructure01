
package Assig;
import assgiment01dstruc.ExerciseSix;
import assgiment01dstruc.ExerciseSix;
import java.util.ArrayList;
import java.util.Scanner;

public class Assg2 extends ExerciseSix  {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Question One
        System.out.println("Question One:");
        System.out.print("Enter size of array: ");
        int size1 = input.nextInt();
        int[] numbers = new int[size1];

        System.out.println("Enter " + size1 + " numbers:");
        for (int i = 0; i < size1; i++) {
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array's elements: " + sum);
        System.out.println("******************************");

        // Question Two
        System.out.println("Question Two:");
        System.out.print("Enter size of array: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter " + size2 + " numbers (sorted for duplicate removal):");
        for (int i = 0; i < size2; i++) {
            arr2[i] = input.nextInt();
        }

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
        System.out.println("Question Three:");
        System.out.print("Enter size of array: ");
        int size3 = input.nextInt();
        int[] arr3 = new int[size3];
        System.out.println("Enter " + size3 + " numbers:");
        for (int i = 0; i < size3; i++) {
            arr3[i] = input.nextInt();
        }

        System.out.print("Enter number to remove: ");
        int key = input.nextInt();

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
        System.out.println("Question Four:");
        System.out.print("Enter size of ArrayList: ");
        int size4 = input.nextInt();
        ArrayList<Integer> numberss = new ArrayList<>();

        System.out.println("Enter " + size4 + " numbers:");
        for (int i = 0; i < size4; i++) {
            numberss.add(input.nextInt());
        }

        int summ = 0;
        for (int num : numberss) {
            summ += num;
        }
        System.out.println("Sum of ArrayList elements: " + summ);
        System.out.println("******************************");

        // Question Five
        System.out.println("Question Five:");
        System.out.print("Enter size of ArrayList: ");
        int size5 = input.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter " + size5 + " numbers (sorted for duplicate removal):");
        for (int i = 0; i < size5; i++) {
            list2.add(input.nextInt());
        }

        ArrayList<Integer> noDup = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            if (i == 0 || !list2.get(i).equals(list2.get(i - 1))) {
                noDup.add(list2.get(i));
            }
        }
        System.out.println("List after removing duplicates: " + noDup);
        System.out.println("******************************");

        // Question Six
        System.out.println("Question Six:");
        System.out.print("Enter size of ArrayList: ");
        int size6 = input.nextInt();
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println("Enter " + size6 + " numbers:");
        for (int i = 0; i < size6; i++) {
            list3.add(input.nextInt());
        }

        System.out.print("Enter number to remove: ");
        int key2 = input.nextInt();

        ArrayList<Integer> filtered = ExerciseSix.removeAllOccurrencesList(list3, key2);
        System.out.println("List after removing " + key2 + ": " + filtered);

        input.close();
    }
}

    
   
