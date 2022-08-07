class Solution {
    //Using Array of 9 Size to store count of Values from Secret String
    public String getHint(String secret, String guess) {
        int[] count=new int[10];
        for(char c:secret.toCharArray()){
            count[c-'0']++;
        }
        int len=guess.length();
        int m=0,nm=0;
        for(int i=0;i<len;i++){
            char c1=secret.charAt(i);
            char c2=guess.charAt(i);
            if(c1==c2){
                m++;
                count[c1-'0']--;
            }
        }
        for(int i=0;i<len;i++){
            char c1=secret.charAt(i);
            char c2=guess.charAt(i);
            if(c1!=c2 && count[c2-'0']!=0){
                count[c2-'0']--;
                nm++;
            }
        }
        
        return new String(m+"A"+nm+"B");
    }
}