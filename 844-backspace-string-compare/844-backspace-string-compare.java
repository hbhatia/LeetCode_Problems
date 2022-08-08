class Solution {
    //Another approach of StringBuilder Based
    public boolean backspaceCompare(String s, String t) {
        String str1=getString(s);
        String str2=getString(t);
        return str1.equals(str2);
    }
    public String getString(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='#'){
                if(sb.length()!=0) sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}