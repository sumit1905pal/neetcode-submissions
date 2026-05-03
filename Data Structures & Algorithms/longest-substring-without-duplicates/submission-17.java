class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = i+1, ans = 1, cnt = 1;
        if(s.length() == 0)return 0;
        while(j<s.length()){
            int k = 0;
            for(k=j-1;k>=i;k--){
                if(s.charAt(k) != s.charAt(j)){
                    continue;
                }
                else{
                    break;
                }
            }
            if(k == i-1){
                cnt++;
                ans = Math.max(ans,cnt);
                j++;
            }else{
                i++;
                j = i+1;
                cnt = 1;
            }
            
        }
        return ans;
    }
}
