class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            queue.add(stones[i]);
        }
        while(queue.size()>1){
            int b=queue.poll();
            int a=queue.poll();
            if(a==b){
                continue;
            }
            else{
                int diff=b-a;
                queue.add(diff);
            }
        }
        return queue.size()>0?queue.peek():0;
    }
}