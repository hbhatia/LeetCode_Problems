class Solution {
    //Using Two array of 256 size
    public boolean isIsomorphic(String s, String t) {
        int[] sArr=new int[256];
        int[] tArr=new int[256];
        //Here s.length() t.length() will always be equal so dont need to handle.
        for(int i=0;i<s.length();i++){
            if(sArr[s.charAt(i)]!=tArr[t.charAt(i)]){
                return false;
            }
            sArr[s.charAt(i)]=i+1;
            tArr[t.charAt(i)]=i+1;
        }
        return true;
    }
}