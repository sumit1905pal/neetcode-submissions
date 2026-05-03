class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        mpp.put(nums[i],i);
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(mpp.containsKey(diff) && mpp.get(diff) != i)
            return new int[]{i,mpp.get(diff)};
        }
        return new int[0];
    }
}
