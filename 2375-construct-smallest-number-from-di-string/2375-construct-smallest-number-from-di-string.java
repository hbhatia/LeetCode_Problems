class Solution {
    //Using stack and StringBuilder
    //By Stack we will push element every time and if we see a I
    //Then we will pop up immediately and if we see D then we keep op adding element in stack
    //Or Either when i has reached the Pattern length then we will start popping element form the stack.
    //Link - https://leetcode.com/problems/construct-smallest-number-from-di-string/discuss/2422180/C%2B%2B-Clean-Stack-Solution
    public String smallestNumber(String pattern) {
        Stack<Integer> stk=new Stack<Integer>();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<=pattern.length();i++){
            stk.push(i+1);
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                while(!stk.isEmpty())
                str.append(stk.pop());
            }
        }
        return str.toString();
    }
}