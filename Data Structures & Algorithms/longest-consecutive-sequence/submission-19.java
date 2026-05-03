class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int res = 0;
        for(int num : nums){
            if(!mpp.containsKey(num)){
            mpp.put(num,mpp.getOrDefault(num-1,0) + 1 + mpp.getOrDefault(num+1,0));
            mpp.put((num - mpp.getOrDefault(num-1,0)),mpp.get(num));
            mpp.put((num + mpp.getOrDefault(num+1,0)),mpp.get(num));
            res = Math.max(res,mpp.get(num));
        } 
        }
        return res;
    }
}
