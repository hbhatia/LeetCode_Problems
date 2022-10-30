class Solution {
    //Using first Approach given in Solution
    public String decodeString(String s) {
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(ch==']'){
                //Need to pop the values from Stack
                StringBuilder str=new StringBuilder();
                while(!stk.isEmpty() && stk.peek()!='['){
                    str.append(stk.pop());
                }
                //Delete the [ from stack
                stk.pop();
                //Findinh the number to whihc we will multiple the occurance
                int num=0;
                int base=1;
                while(!stk.isEmpty() && Character.isDigit(stk.peek())){
                    num=num+(stk.pop()-'0')*base;
                    base=base*10;
                }
                //We will reverse push the string num times in the stack again
                while(num>0){
                    for(int k=str.length()-1;k>=0;k--){
                        stk.push(str.charAt(k));
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