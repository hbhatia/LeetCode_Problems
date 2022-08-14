class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int c=0;
        int sum=0;
        for(int i =len-1;i>=0;i--){
            if(i==len-1) sum=c+digits[i]+1;
            else sum=c+digits[i];
            int r=sum%10;
            digits[i]=r;
            c=sum/10;
        }
        int[] output;
        if(c>0){
            output=new int[len+1];
            output[0]=c;
            for(int i=0;i<len;i++){
                output[i+1]=digits[i];
            }
        }
        else{
            output=new int[len];
            for(int i=0;i<len;i++){
                output[i]=digits[i];
            }
        }
        return output;
    }
}