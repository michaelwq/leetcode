public class Solution {
    public int reverse(int x) {
        boolean negativeValue=false;
    	int output=0;
    	if(x<0){
    		negativeValue=true;
    		if(x==Integer.MIN_VALUE){
				return 0;
			}
    		x*=-1;
    	}
    	if(x==0)
    		return 0;
    	
    	while(x!=0){
    		if(Integer.MAX_VALUE/10<output){
    			return 0; 
    		}
    		if(Integer.MAX_VALUE/10==output&&x>7){
    			return 0; 
    		}
    		output=(x%10)+output*10;
    		x=x/10;
    	}
    	if(negativeValue){
    		output*=-1;
    	}
        return output;
    }
}