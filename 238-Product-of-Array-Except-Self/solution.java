public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] before_i=new int[nums.length];
        int[] after_i=new int[nums.length];
        int temp=1;
        for(int index=0;index<nums.length;index++){
            before_i[index]=temp;
            temp=nums[index]*temp;
        }
        temp=1;
        for(int index=nums.length-1;index>=0;index--){
            after_i[index]=temp;
            temp=nums[index]*temp;
            before_i[index]=after_i[index]*before_i[index];
        }
        
        return before_i;
        
    }
}