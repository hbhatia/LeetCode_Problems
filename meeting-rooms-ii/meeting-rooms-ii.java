class Solution {
    //Using Min Heap or So called PriorityQueue
    public int minMeetingRooms(int[][] intervals) {
        int countInterval=0;
        if(intervals.length==0){
            return countInterval;
        }
        Comparator<int[]> arrComp=new Comparator<int[]>(){
            @Override
            public int compare(int[]a ,int []b){
                return a[0]-b[0];
            }
        };
        // Arrays.sort(intervals,arrComp);
        Arrays.sort(intervals,new Comparator<int[]>(){

            @Override
            public int compare(int[]a,int[] b){
                return a[0]-b[0];
            }
        });
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        for(int i=0;i<intervals.length;i++){
            if(queue.isEmpty()){
                queue.add(intervals[i][1]);
            }
            else{
                int lastEndTime=queue.peek();
                if(lastEndTime<=intervals[i][0]){
                    queue.poll();
                    queue.add(intervals[i][1]);
                }
                else{
                     queue.add(intervals[i][1]);
                }
            }
        }
        return queue.size();
    }
}