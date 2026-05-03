class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            Set<Character> c = new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(c.contains(s.charAt(j))){
                    break;
                }
                c.add(s.charAt(j));
            }
            ans = Math.max(ans,c.size());
        }
        return ans;
    }
}
