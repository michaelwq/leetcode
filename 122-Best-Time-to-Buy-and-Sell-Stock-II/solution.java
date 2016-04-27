public class Solution {
    public int maxProfit(int[] prices) {
        int output=0;
    	int index=0;
    	while(index<prices.length-1){
    		int currentMax=prices[index];
    		for(int j=index+1;j<prices.length;j++){
    			if(prices[j]>=currentMax){
    				currentMax=prices[j];
    				if(j==prices.length-1){
    					output=output+currentMax-prices[index];
    					return output;
    				}
    				continue;
    			}else{
    				output=output+currentMax-prices[index];
    				index=j;
    				break;
    			}
    		
    		}
    	
    	}
    	return output;
    }
}