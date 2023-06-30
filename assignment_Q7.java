public class assignment_Q7 {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        // If the array is not rotated, return the first element
        if (nums[left] <= nums[right]) {
            return nums[left];
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If the middle element is greater than the rightmost element,
            // the minimum element must be in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // If the middle element is less than or equal to the rightmost element,
            // the minimum element must be in the left half (including the middle element)
            else {
                right = mid;
            }
        }
        
        // At the end of the loop, left == right and it points to the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int min = findMin(nums);
        System.out.println("Minimum element: " + min);
    }
}
