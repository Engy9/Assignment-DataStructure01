package assgiment01dstruc;
import java.util.ArrayList;

public class ExerciseSix {

    // method to remove all occurrences of a key from an ArrayList
    public static ArrayList<Integer> removeAllOccurrencesList(ArrayList<Integer> list, int key) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : list) {
            if (num != key) {
                result.add(num);
            }
        }
        return result;
    }
}
