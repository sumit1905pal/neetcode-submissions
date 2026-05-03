class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 1,cnt=1;
        Arrays.sort(nums);
        if(nums.length == 0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1] )continue;
            else if(nums[i] == nums[i-1]+1 ){
                cnt++;
            }else{
                longest = Math.max(longest,cnt);
                cnt = 1;
            }
            longest = Math.max(longest,cnt);
           
        }
        return longest;
    }
}
