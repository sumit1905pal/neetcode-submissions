class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int longest = 0;
        for(int n : nums){
            s.add(n);
        }
        for(int i : s){
            if(!s.contains(i-1)){
                int cnt = 1;
                while(s.contains(i+1)){
                    i++;
                    cnt++;
                }

                longest = Math.max(longest,cnt);
            }
        }
        return longest;
        
    }
}
