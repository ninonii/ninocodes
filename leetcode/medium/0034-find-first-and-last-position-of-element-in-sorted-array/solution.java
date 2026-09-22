  class Solution {
    public int[] searchRange(int[] nums, int target) {
    
        int low = 0, high = nums.length - 1, first = -1, last = -1;
        int ans[]= new int[2];
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= target) high = mid - 1;
            else low = mid + 1;

            if (nums[mid] == target) first = mid;
        } ans[0]= first;

        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] <= target) low = mid + 1;
            else high = mid - 1;

            if (nums[mid] == target) last = mid;
        } ans[1]= last;

        return ans;
    }
}
    

    
