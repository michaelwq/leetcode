public class Solution {
    public int singleNumber(int[] nums) {
        
        int[] count=new int[32];

        int result=0;
        
        for(int index=0; index<32;index++){
            for(int i=0;i<nums.length;i++){
                count[index]+=nums[i]>>index&1;
            }
            
            result|=(count[index]%3)<<index;
        }
        
        return result;
        
    }
}