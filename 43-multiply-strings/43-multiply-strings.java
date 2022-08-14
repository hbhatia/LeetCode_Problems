class Solution {
    //Using Solution given in discuss section
    //Link - https://leetcode.com/problems/multiply-strings/discuss/17608/AC-solution-in-Java-with-explanation
    //Here we are computing digits by digits product and then storing these product in one array of size M+N
    public String multiply(String num1, String num2) {
        int M=num1.length();   //num1 length
        int N=num2.length();   //num2.length
        
        int res[]=new int[M+N];
        
        //Strat computing
        for(int i=M-1;i>=0;i--){
            for(int j=N-1;j>=0;j--){
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';
                res[i+j+1]+=d1*d2;
            }
        }
        int carry=0;
        for(int i=M+N-1;i>=0;i--){
            int sum=carry+res[i];
            carry=sum/10;
            res[i]=sum%10;
        }
        StringBuilder sb=new StringBuilder("");
        for(int num:res){
            sb.append(num);
        }
        while(sb.length()!=0 && sb.charAt(0)=='0') sb.deleteCharAt(0);
        
        return sb.length()==0?"0":sb.toString();
    }
}