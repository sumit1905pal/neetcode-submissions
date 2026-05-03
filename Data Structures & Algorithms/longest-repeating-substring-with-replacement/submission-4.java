class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0,j = 0,res = 0,max = 0;
        Map<Character,Integer> mpp = new HashMap<>();
        while(j<s.length()){
            mpp.put(s.charAt(j),mpp.getOrDefault(s.charAt(j),0)+1);
            max = Math.max(max,mpp.get(s.charAt(j)));
            if((j-i+1) - max <= k){
                res = Math.max(res,j-i+1);
            }else{
                mpp.put(s.charAt(i),mpp.get(s.charAt(i))-1);
                i++;
            }
            j++;
        }
        return res;
    }
}
