import java.util.Arrays;
import java.util.HashSet;

public class assignment_Q8 {
    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) {
            return new int[0]; // If the size is odd, changed is not a doubled array
        }

        Arrays.sort(changed); // Sort the changed array in ascending order

        HashSet<Integer> set = new HashSet<>();
        int[] original = new int[n / 2];
        int index = 0;

        for (int num : changed) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                int twiceNum = num * 2;
                if (!set.contains(twiceNum)) {
                    return new int[0]; // If the doubled value is not found, changed is not a doubled array
                }

                set.remove(twiceNum);
                original[index++] = num;
            }
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);

        System.out.println("Original array: " + Arrays.toString(original));
    }
}
