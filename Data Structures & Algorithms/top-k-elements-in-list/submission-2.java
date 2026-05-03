class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> f = new HashMap<>();
        int[] ans = new int[k];
        for(int i=0;i<nums.length;i++){
            f.put(nums[i],f.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<k;i++){
            int max =Integer.MIN_VALUE ,temp,element;
            for(Map.Entry<Integer,Integer> mpp : f.entrySet()){
               temp = max;
               max = Math.max(max,mpp.getValue());
               element = mpp.getKey();
               if(max != temp){
                ans[i] = mpp.getKey();
               }

            }
            f.put(ans[i],0);

        }
        return ans;
    }
}
