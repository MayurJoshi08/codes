public class SearchInsert {
   
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid=0;

        while (start <= end) {
           mid = start + (end - start) / 2;
        
        if (nums[mid] == target){
            return mid;
        }else if (nums[mid] < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int insertionIndex = searchInsert(nums, target);
        System.out.println("The target " + target + " should be inserted at index " + insertionIndex);
    }
}

// 69, 367, 374, 34 