class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i : nums){
            //int count = 0;
            
                mpp.put(i,mpp.getOrDefault(i,0)+1);
            
          //  mpp.get(i)+1;
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mpp.entrySet());
        list.sort((a,b)->b.getValue() - a.getValue());
        
        for(int i=0;i<k;i++){
         ans[i] = list.get(i).getKey();
        }
        return ans;
    }
}
