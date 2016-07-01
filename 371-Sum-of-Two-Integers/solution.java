public class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int carry=a&b;// the bit position which a and b have the same value
            a=a^b;//have different value
            b=carry<<1;
        }
        
        return a;
        
    }
}