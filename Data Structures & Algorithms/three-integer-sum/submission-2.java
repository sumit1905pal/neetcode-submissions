class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j = i+1, k = nums.length-1;
            while(j < k){
            if(nums[i] + nums[j] + nums[k] == 0){
                List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                set.add(temp);
                j++;
                k--;
            }else if(nums[i] + nums[j] + nums[k] > 0){
                k--;
            }else if( nums[i] + nums[j] + nums[k] < 0){
                j++;
            }
            }
        }
        return new ArrayList<>(set);
    }
}
