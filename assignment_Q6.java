import java.util.ArrayList;
import java.util.List;

public class assignment_Q6 {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            // Swap the number to its correct position if it is not already there
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        // Now, the duplicates will be at the positions where nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                duplicates.add(nums[i]);
            }
        }
        
        return duplicates;
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicates: " + duplicates);
    }
}
