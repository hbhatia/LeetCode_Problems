/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    //Using Approach of BS
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            boolean isMidValid=isBadVersion(mid);
            if(!isMidValid){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}