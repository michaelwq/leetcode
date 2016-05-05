public class Solution {
    public int majorityElement(int[] nums) {
       if(nums.length==1){
           return nums[0];
       }

    	Map<Integer,Integer> cache=new HashMap<Integer,Integer>();
		int mid=nums.length/2;
        for(int index=0;index<nums.length;index++){

			if(cache.containsKey(nums[index])){
				if(cache.get(nums[index])==mid){
					return nums[index];
				}else
					cache.put(nums[index],cache.get(nums[index])+1);
				
			}else{
				if(((index+1<=mid)&&(nums.length%2==0))||((index<=mid)&&(nums.length%2>0))){
					cache.put(nums[index],1);
				}	
			}

		}
		
		return 0;
    }

}