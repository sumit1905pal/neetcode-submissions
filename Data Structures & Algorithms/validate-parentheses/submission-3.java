class Solution {
    public boolean isValid(String s) {
        Stack<Character> block = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                block.push(c);
            }else{
                if(block.isEmpty()) return false;
                char t = block.pop();
                if(c == ')' && t != '(') return false;
                if(c == '}' && t != '{') return false;
                if(c == ']' && t != '[') return false;
            }
        }
        return block.isEmpty();
    }
}
