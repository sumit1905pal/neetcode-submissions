class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int longest = 0;
        for(int num : nums){
            s.add(num);
        }
        for(int num : s){
            int streak = 1, current = num;
            while(s.contains(current+1)){
                streak++;
                current++;
            }
            longest = Math.max(longest,streak);
        }
        return longest;
    }
}
