class Solution {
    //Using the brute force Approcah
    //TC will be problem in this code as TC is O(N^2)
    //It is giving TLE.
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        int[] retArr=new int[2];
        for(int i=0;i<len;i++){
            int val1=numbers[i];
            for(int j=i+1;j<len && val1+numbers[j]<=target;j++){
                if(val1+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return retArr;
    }
}