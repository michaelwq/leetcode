public class Solution {
    public int[] singleNumber(int[] nums) {
		Map<Integer, Integer> numCache=new HashMap<Integer,Integer>();
        for(int index=0;index<nums.length;index++){
			if(numCache.containsKey(nums[index])){				
        		numCache.remove(nums[index]);   		
        		continue;
        	}else{
        		numCache.put(nums[index],index);
        	}
        }

        
        int[] output=new int[numCache.keySet().size()];
        int count=0;
        for(Integer item:numCache.keySet()){
        	output[count]=item;
        	count++;

        }
        return output;
    }
}