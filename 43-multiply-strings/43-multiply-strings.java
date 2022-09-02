class Solution {
    //Doing by the Solution Given in discuss Section
    //Link -https://leetcode.com/problems/multiply-strings/discuss/17605/Easiest-JAVA-Solution-with-Graph-Explanation
    public String multiply(String num1, String num2) {
        int M=num1.length();
        int N=num2.length();
        int res[]=new int[M+N];
        
        //Start Calculate the multiplication
        for(int i=M-1;i>=0;i--){
            for(int j=N-1;j>=0;j--){
                int p1=i+j,p2=p1+1;
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';
                int mult=res[p2]+(d1*d2);
                res[p1]+=mult/10;
                res[p2]=mult%10;
            }
        }
        int i=0;
        StringBuilder multString=new StringBuilder();
        while(i<(M+N)){
            if(!(res[i]==0 && multString.isEmpty())){
                multString.append(res[i]);
            }
            i++;
        }
        return multString.isEmpty()?"0":multString.toString();
    }
}