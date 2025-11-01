package assgiment01dstruc;

import java.util.ArrayList;

public class ExerciseSix {
    public static ArrayList<Integer> getElementsAfterKey(ArrayList<Integer> list, int key) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key && i + 1 < list.size()) {
                result.add(list.get(i + 1));
            }
        }
        return result;
    }
}