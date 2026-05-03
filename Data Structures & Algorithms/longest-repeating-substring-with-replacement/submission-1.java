class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> f = new HashMap<>();
            int max = 0;
            for(int j=i;j<s.length();j++){
                f.put(s.charAt(j),f.getOrDefault(s.charAt(j),0)+1);
                max = Math.max(max,f.get(s.charAt(j)));
                if((j-i+1) - max <= k)
                res = Math.max(res,j-i+1);
            }
        }
        return res;
    }
}
