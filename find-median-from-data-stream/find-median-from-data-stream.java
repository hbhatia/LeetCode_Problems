class MedianFinder {
    //Using the Two priority Queue Logic
    //https://leetcode.com/problems/find-median-from-data-stream/solutions/74047/java-python-two-heap-solution-o-log-n-add-o-1-find/
    PriorityQueue<Integer> smaller;
    PriorityQueue<Integer> larger;
    boolean even;
    public MedianFinder() {
        smaller=new PriorityQueue<Integer>(Collections.reverseOrder());
        larger=new PriorityQueue<Integer>();
        even =true;
    }
    
    public void addNum(int num) {
        if(even){
            larger.add(num);
            smaller.add(larger.poll());
        }
        else{
            smaller.add(num);
            larger.add(smaller.poll());
        }
        even=!even;
    }
    
    public double findMedian() {
        if(even){
            return (smaller.peek()+larger.peek())/2.0;
        }
        else{
            return smaller.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */