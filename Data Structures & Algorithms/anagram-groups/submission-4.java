class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mpp =new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            char[] c = str.toCharArray();
            for(int i=0;i<c.length;i++){
                
                int index = c[i] - 'a';
                count[index]++;

            }
            String key = Arrays.toString(count);
            if(!mpp.containsKey(key)){
                mpp.put(key,new ArrayList<>());
                
            }
            mpp.get(key).add(str);
        }
        return new ArrayList<>(mpp.values());
    }
}
