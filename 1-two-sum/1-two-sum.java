class Solution {
    //Using HashMap
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{i,map.get(rem)};                     
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}