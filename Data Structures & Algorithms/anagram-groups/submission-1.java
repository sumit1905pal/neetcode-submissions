class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;

            for(int j=i+1;j<strs.length;j++){
                if(visited[j]) continue;

                if(strs[i].length() == strs[j].length()){
                   char[] c1 = strs[i].toCharArray();
                   char[] c2 = strs[j].toCharArray();
                   Arrays.sort(c1);
                   Arrays.sort(c2);
                   String s1 = new String(c1);
                   String s2 = new String(c2);
                   if(s1.equals(s2))
                   {
                    group.add(strs[j]);
                    visited[j]=true;
                   }
                  
                }
            }
            ans.add(group);
        }
        return ans;
        
    }
}
