/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int index=1;
        while(index>=1&&index<=n){
        	index=(int)(((long)end+(long)start)/2);
        	if(isBadVersion(index)){
        		end=index;
        	}else{
        		start=index+1;
        	}
			if(start==end){
				break;
			}
        
       }
        
        return start;
    }
}