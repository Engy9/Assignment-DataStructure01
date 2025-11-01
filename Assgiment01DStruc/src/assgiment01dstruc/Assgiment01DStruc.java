package assgiment01dstruc;

import java.util.ArrayList;

public class Assgiment01DStruc extends ExerciseSix {
    public static void main(String[] args) {
        System.out.println("Question One:");
        int[] numbers = {1, 3, 5, 7, 9};
        int target = 5;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }

        ///////////////////////////////////////////////////////////////////
        System.out.println("\nQuestion Two:");
        int[] numberss = {2, 4, 6, 7, 9};
        int Sum1 = 0;
        for (int num : numberss) {
            Sum1 += num;
        }
        System.out.println("Sum of array elements: " + Sum1);

        ///////////////////////////////////////////////////////////////////
        System.out.println("\nQuestion Three:");
        int[] arr = {1, 2, 1, 3, 5, 1};
        int key = 1;
        int[] result = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                result[j++] = arr[i];
            }
        }

        System.out.println("*Input: \nArray = [1, 2, 1, 3, 5, 1]\nKey = " + key);
        System.out.print("*Output: \nArray after removing Key: [");
        for (int i = 0; i < j; i++) {
            System.out.print(result[i]);
            if (i < j - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        ///////////////////////////////////////////////////////////////////
        System.out.println("\nQuestion Four:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(9);

        int sum2 = 0;
        for (int num : list) {
            sum2 += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum2);

        ///////////////////////////////////////////////////////////////////
        System.out.println("\nQuestion Five:");
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(2);
        numbersList.add(4);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(9);

        int sum3 = 0;
        for (int num : numbersList) {
            sum3 += num;
        }
        System.out.println("Sum of ArrayList elements: " + sum3);

        ///////////////////////////////////////////////////////////////////
        System.out.println("\nQuestion Six:");
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(3);
        array.add(5);
        array.add(1);

        int keyy = 1;
        // استدعاء الدالة من ExerciseSix
        ArrayList<Integer> output = getElementsAfterKey(array, keyy);

        System.out.println("Input array: " + array);
        System.out.println("Key: " + keyy);
        System.out.println("Output: " + output);
    }
}