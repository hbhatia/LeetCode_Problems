class Solution {
    //Using 2nd Approach in the Solution
    //Here we will use 2 Stack to keep Count and String in Seprate Stack.
    //TC is O(MaxK*N) and SC is O(M+N) ,M=no of digits and N is numnber of character like a,b,c etc.
    public String decodeString(String s) {
        Stack<Integer> cStack=new Stack<Integer>();
        Stack<StringBuilder> sStack=new Stack<StringBuilder>();
        StringBuilder currStr=new StringBuilder();
        int k=0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
            }
            else if(ch=='['){
                cStack.push(k);
                k=0;
                sStack.push(currStr);
                currStr=new StringBuilder();
            }
            else if(ch==']'){
                StringBuilder prevString=sStack.pop();
                for(int countNum=cStack.pop();countNum>0;countNum--){
                    prevString.append(currStr);
                }
                currStr=prevString;
            }
            else{
                currStr.append(ch);
            }
        }
        return currStr.toString();
    }
}