class Solution {
    public int leastInterval(char[] tasks, int n) {
        //Total Task can be 26 as task are in Letters only.
        //Done using Approach 1 Greedy in Solution.
        int freq[]=new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        Arrays.sort(freq);
        int maxF=freq[25];
        int idleTime=(maxF-1)*n;
        //Now computing over Idle time 
        //Here we will reduce the IdleTime by puutting the remianing task on idle time spaces which are vacant.
        for(int i=24;i>=0 && idleTime>0;i--){
            idleTime-= Math.min(maxF-1,freq[i]);
        }
        idleTime=Math.max(0,idleTime);
        return idleTime+tasks.length;
    }
}