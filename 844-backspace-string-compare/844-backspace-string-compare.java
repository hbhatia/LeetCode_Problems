class Solution {
    //Using Simple Traversing From backward.
    public boolean backspaceCompare(String s, String t) {
        String str1=findCorrectString(s);
        String str2=findCorrectString(t);
        return str1.equals(str2);
        
    }
    public String findCorrectString(String s){
        int len=s.length();
        int count=0;
        StringBuilder str=new StringBuilder();
        for(int i=len-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='#'){
                count++;
                continue;
            }
            if(count>0){
                //skip the character
                count--;
                continue;
            }
            else{
                str.append(c);
            }
        }
        return str.toString();
    }
}