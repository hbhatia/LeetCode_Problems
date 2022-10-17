class Solution {
    //Using the solution given in Approach
    public String decodeString(String s) {
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==']'){
                List<Character> lst=new ArrayList<Character>();
                //Adding string to list
                while(stk.peek()!='['){
                    lst.add(stk.pop());
                }
                
                stk.pop();
                //Now will look out the number 
                int num=0;
                int b=1;
                while(!stk.isEmpty() && Character.isDigit(stk.peek())){
                    num=num+(stk.pop()-'0')*b;
                    b*=10;
                }
                //Constitue the string num times;
                while(num>0){
                    for(int j=lst.size()-1;j>=0;j--){
                        stk.push(lst.get(j));
                    }
                    num--;
                }
            }
            else{
                stk.push(c);
            }
        }
        //System.out.println(stk +" "+ stk.size());
        char[] res=new char[stk.size()];
        for(int j=res.length-1;j>=0;j--){
            res[j]=stk.pop();
        }
        return new String(res);
        //return String.valueOf(stk);
    }
}