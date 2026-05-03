class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[right]) left = mid+1;
            else if(nums[mid] <= nums[right]) right = mid;
        }
        int pivot = right;
        int rl = pivot, rr = nums.length - 1, ll = 0, lr = pivot - 1;
        while(rl <= rr){
            int mid = (rl+rr)/2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target) rl = mid+1;
            else if(nums[mid] > target) rr = mid-1; 
        }
        while(ll <= lr){
            int mid = (ll+lr)/2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target) ll = mid+1;
            else if(nums[mid] > target) lr = mid-1;
        }
        return -1;
    }

}
