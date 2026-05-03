class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ansArr = new int[2];
        int i = 0;
        for(int j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j] == target){
                ansArr[0]=i;
                ansArr[1]=j;
                break;
            }else if(j==nums.length-1){
                if(i<j){
                    i++;
                    j=i;
                }
            }

            }
        
        return ansArr;
    }
}
