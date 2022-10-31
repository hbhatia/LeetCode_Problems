class Solution {
    //Using Stack DS.
    //TC -O(N) and SC- O(N)
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<Integer>();
        // List<String> op=new ArrayList<String>(Arrays.asList("+","-","*","/"));
        for(String tk:tokens){
            if("+,-,*,/".contains(tk)){
                Integer val1=stk.pop();
                Integer val2=stk.pop();
                switch(tk){
                    case "+":
                     stk.push(val1+val2);
                     break;
                    case "-":
                     stk.push(val2-val1);
                     break;
                    case "*":
                     stk.push(val2*val1);
                     break;
                    case "/":
                     stk.push(val2/val1);
                     break;
                }
            }
            else{
                stk.push(Integer.parseInt(tk));
            }
        }
        return stk.pop();
    }
}