public class Celling  {

    public static int searchcelling(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int celling = -1;

        while (start <= end) {
           mid = start + (end - start) / 2;

        if (nums[mid] == target){
            return mid;
        }else if (nums[mid] < target){
            start = mid + 1;
        }
        else{
            celling = nums[mid];
            end = mid - 1;
        }
    }
        return celling;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int celling = searchcelling(nums, target);
        System.out.println("The target " + target + " should be inserted at index " + celling);
    }
}