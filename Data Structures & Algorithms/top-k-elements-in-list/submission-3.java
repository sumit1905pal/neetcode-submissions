class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> f = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        int[] result = new int[k];
        for(int n : nums){
            mpp.put(n,mpp.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> frequency : mpp.entrySet()){
            f.add(frequency);
            if(f.size()>k){
                f.poll();
            }
        }
        for(int i=0;i<k;i++){
            result[i] = f.poll().getKey();

        }
     return result;

    }
}
