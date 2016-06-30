public class Solution {
    public int findDuplicate(int[] nums) {
        int low=1;
		int high=nums.length-1;
		
		while(low<= high){
			int mid=low+(high-low)/2;
			int counter=0;
			for(int temp:nums){
				if(temp<=mid) counter++;
			}
			if(counter<=mid) low=mid+1;
			else high=mid-1;
		}
		return low;
    }
}