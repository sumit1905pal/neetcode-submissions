class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> l = new ArrayList<>(3);
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        
                        set.add(l);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}