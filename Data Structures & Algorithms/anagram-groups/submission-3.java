class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> mpp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(mpp.containsKey(s)){
                List<String> group = mpp.get(s);
                group.add(strs[i]);
            }else{
                mpp.put(s, new ArrayList<>());
                mpp.get(s).add(strs[i]);
            }
        }
       /* for(List<String> gp : mpp.values()){
            ans.add(gp);
        }
        return ans;*/
        return new ArrayList<>(mpp.values());
    }
}
