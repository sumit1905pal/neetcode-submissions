class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      //  Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            while(i>0 && i<nums.length-2 && nums[i] == nums[i-1]){
               // continue;
               i++;
            }
            int j = i+1, k = nums.length-1;
            while(j < k){
            if(nums[i] + nums[j] + nums[k] == 0){
                List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
               // set.add(temp);
               result.add(temp);
               while(j<k && nums[j] == nums[j+1])j++;
               while(j<k && nums[k] == nums[k-1])k--;
                j++;
                k--;
            }else if(nums[i] + nums[j] + nums[k] > 0){
                k--;
            }else if( nums[i] + nums[j] + nums[k] < 0){
                j++;
            }
            }
        }
        return result;
    }
}
