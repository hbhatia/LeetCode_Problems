class Solution {
    //Using the Enhanced Min Heap Approach 
    //But with good TC 
    //Sc will be same O(K)
    // Link --https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/solutions/1322101/c-java-python-maxheap-minheap-binary-search-picture-explain-clean-concise/
    //TC Will be O(k.logK)
    //SC will be O(k)
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
        int minR=Math.min(m,k);
        PriorityQueue<int[]> minqueue=new PriorityQueue<int[]>(Comparator.comparing(e->e[0]));
        for(int i=0;i<minR;i++){
            minqueue.add(new int[]{matrix[i][0],i,0});
        }
        int ans=-1;
        for(int i=0;i<k;i++){
            int[] topEle=minqueue.poll();
            ans=topEle[0];
            int r=topEle[1];
            int c=topEle[2];
            if(c+1<n)
            minqueue.add(new int[]{matrix[r][c+1],r,c+1});
        }
        return ans;
    }
}