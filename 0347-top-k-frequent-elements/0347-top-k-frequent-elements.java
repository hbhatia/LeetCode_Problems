class Solution {
    //Using the HashMap to store Key as Value and Value as its frequncy 
    //Then List to sort and store the values.
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> lst=new ArrayList<Integer>(map.keySet());
        Collections.sort(lst,(N1,N2)->map.get(N2)-map.get(N1));
        int[] ret=new int[k];
        for(int i=0;i<k;i++){
            ret[i]=lst.get(i);
        }
        return ret;
    }
}