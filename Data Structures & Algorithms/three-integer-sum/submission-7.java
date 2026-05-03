class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Map<Integer,Integer> mpp = new HashMap<>();
        Arrays.sort(nums);
        for(int num : nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        for(int i=0;i<nums.length-1;i++){
            if(i>0 && nums[i] == nums[i-1])continue;
           mpp.put(nums[i], mpp.get(nums[i]) - 1);
            for(int j=i+1;j<nums.length;j++){
                if(j > i+1 && nums[j] == nums[j-1]){continue;}
                mpp.put(nums[j], mpp.get(nums[j])-1);
                int target = -(nums[i] + nums[j]);
                if( mpp.containsKey(target) && mpp.get(target) > 0 ){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], target);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                mpp.put(nums[j], mpp.get(nums[j])+1);
            }
            mpp.put(nums[i], mpp.get(nums[i])+1);
        }
        return new ArrayList<>(ans);
        
    }
}
