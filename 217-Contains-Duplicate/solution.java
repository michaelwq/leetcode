public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> cache=new HashSet<Integer>();
        for(int index=0;index<nums.length;index++){
            if(cache.contains(nums[index])){
                return true;
            }
            cache.add(nums[index]);
        }
        
        return false;
        
    }
}