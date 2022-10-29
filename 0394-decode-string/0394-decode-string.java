class Solution {
    //Using First Approach given in Solution
    //We will use stack to store every character in String s
    public String decodeString(String s) {
        Stack<Character> stk=new Stack<Character>();
        for(Character ch:s.toCharArray()){
            if(ch==']'){
                StringBuilder str=new StringBuilder();
                while(!stk.isEmpty() && stk.peek()!='['){
                    Character c=stk.pop();
                    str.append(c);
                }
                //Popping [ from the stack.
                stk.pop();
                //Now its time to find the digit ,digit may be more than 1 
                int base=1;
                int num=0;
                while(!stk.isEmpty() && Character.isDigit(stk.peek())){
                    num=num+(stk.pop()-'0')*base;
                    base*=10;
                }
                //Now push this string str to stack num times.
                while(num!=0){
                    for(int i=str.length()-1;i>=0;i--){
                        stk.push(str.charAt(i));
                    }
                    num--;
                }
            }
            else{
                stk.push(ch);
            }
        }
        StringBuilder output=new StringBuilder();
        while(!stk.isEmpty()){
            output.append(stk.pop());
        }
        return output.reverse().toString();
    }
}