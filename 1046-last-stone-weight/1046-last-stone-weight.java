class Solution {
    //Using the MaxHeap Solution 
    //Using Priority Queue approach
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int stone:stones){
            heap.add(stone);
        }
        //Treverse the heap and minimise the elements as per the problem.
        while(heap.size()>1){
            int stone1=heap.remove();
            int stone2=heap.remove();
            if(stone1!=stone2){
                heap.add(stone1-stone2);
            }
        }
        //Finaly return the element.
        return heap.size()==0?0:heap.remove();
    }
}