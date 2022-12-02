class Solution {
    //Using Two Pointer Apporach
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        int low=0;
        int high=len-1;
        while(low<high){
            int sum=numbers[low]+numbers[high];
            if(sum==target){
                return new int[]{low+1,high+1};
            }
            else if(sum<target){
                low++;
            }
            else{
                high--;
            }
        }
        return new int[2];
    }
}