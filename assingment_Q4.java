import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class assingment_Q4 {
    public static List<List<Integer>> findDistinctElements(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        List<Integer> distinctNums1 = new ArrayList<>();
        List<Integer> distinctNums2 = new ArrayList<>();
        
        for (int num : set1) {
            if (!set2.contains(num)) {
                distinctNums1.add(num);
            }
        }
        
        for (int num : set2) {
            if (!set1.contains(num)) {
                distinctNums2.add(num);
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(distinctNums1);
        result.add(distinctNums2);
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> distinctElements = findDistinctElements(nums1, nums2);
        
        System.out.println("Distinct elements in nums1: " + distinctElements.get(0));
        System.out.println("Distinct elements in nums2: " + distinctElements.get(1));
    }
}
