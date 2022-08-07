class Solution {
    //Using 1st Approach given in Solution
    public boolean backspaceCompare(String s, String t) {
        return buildStr(s).equals(buildStr(t));
    }
    public String buildStr(String st){
        Stack<Character> stk=new Stack<Character>();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch!='#') stk.push(ch);
            else if(!stk.isEmpty()){
                stk.pop();
            }
        }
        return String.valueOf(stk);
    }
}