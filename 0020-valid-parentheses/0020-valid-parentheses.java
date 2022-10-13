class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length;i++){
            if(chars[i]=='(' || chars[i]=='{' || chars[i]=='['){
                stack.push(chars[i]);
            }
            else{
                switch(chars[i]){
                case ')':
                    if(stack.isEmpty()) return false;
                    else if(stack.peek()=='(') stack.pop();
                    else return false;
                    break;
                case '}':
                    if(stack.isEmpty()) return false;
                    else if(stack.peek()=='{') stack.pop();
                    else return false;
                    break;
                case ']':
                    if(stack.isEmpty()) return false;
                    else if(stack.peek()=='[') stack.pop();
                    else return false;    
                    break;
                }
            }     
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}