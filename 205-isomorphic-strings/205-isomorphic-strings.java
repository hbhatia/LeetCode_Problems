class Solution {
    //Using One array of 512 size to keep both data in same array
    public boolean isIsomorphic(String s, String t) {
        int[] arr=new int[512];
        //Here s.length() t.length() will always be equal so dont need to handle.
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]!=arr[t.charAt(i)+256]){
                return false;
            }
            arr[s.charAt(i)]=i+1;
            arr[t.charAt(i)+256]=i+1;
        }
        return true;
    }
}