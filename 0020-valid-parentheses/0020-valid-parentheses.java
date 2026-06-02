class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(') st.push(')');
            else if(ch=='[') st.push(']');
           else if(ch=='{') st.push('}');
            else if(st.isEmpty() || st.pop()!=ch) return false;
               
        }
        return st.isEmpty();
        
    }
}
// TC ->O(n)
// SC ->O(n)
// Approach -> For every opening bracket, add its equivalent closing bracket to stack
//             For every closing bracket, just look for top of stack ,if same then pop