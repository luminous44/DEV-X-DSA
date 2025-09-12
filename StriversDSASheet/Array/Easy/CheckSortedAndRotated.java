public class CheckSortedAndRotated {

    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int next = nums[(i + 1) % n];  // circular comparison
            if (nums[i] > next) {
                count++;
            }
            if (count > 1) {
                return false; // More than one break => not sorted & rotated
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3, 4, 5};

        System.out.println(check(nums1)); // true
        System.out.println(check(nums2)); // false
        System.out.println(check(nums3)); // true
    }
}
