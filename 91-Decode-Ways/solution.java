public class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] nums = new int[s.length() + 1];
        nums[0] = 1;
        nums[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= s.length(); i++) {
            if (s.charAt(i - 1) != '0') {
                nums[i] = nums[i - 1];
            }
            
            int twoDigits = (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0';
            if (twoDigits >= 10 && twoDigits <= 26) {
                nums[i] += nums[i - 2];
            }
        }
        return nums[s.length()];
// 	    if(s.equals("")||s==null){
// 	        return 0;
// 	    }
// 	    if(s.startsWith("0")){
// 	        return 0;
// 	    }
	
    	
// 		Map<Integer,Map<Boolean,Integer>> indexCache=new HashMap<Integer,Map<Boolean,Integer>>();
// 		int previousNum=0;
// 		int currentNum=0;
			
// 		int index=0;
// 		while(index<s.length()){
// 			//whether previous number is a two digit number
// 			Map<Boolean,Integer> currentWays=new HashMap<Boolean,Integer>();
// 			currentNum=s.charAt(index)-'0';
// 			if(index==0){
// 				currentWays.put(false,1);
// 				currentWays.put(true,0);
// 				indexCache.put(index,currentWays);
// 				previousNum=s.charAt(index)-'0';
// 				index++;
// 				continue;
// 			}
// 			if(currentNum==0){
// 				if((previousNum*10+currentNum)<=26){
// 					Map<Boolean,Integer> last=indexCache.get(index-1);
// 					currentWays.put(false,0);
// 					currentWays.put(true,last.get(false));
// 					indexCache.put(index,currentWays);
// 					previousNum=s.charAt(index)-'0';
// 					index++;
// 					continue;
				
// 				}else
// 					return 0;
			
// 			}
			
// 			Map<Boolean,Integer> last=indexCache.get(index-1);
// 			currentWays.put(false,last.get(true));
			
// 			if((previousNum*10+currentNum)<=26){
// 				currentWays.put(true,last.get(false));
// 				currentWays.put(false,currentWays.get(false)+last.get(false));
// 			}else{
// 				currentWays.put(true,0);
// 				currentWays.put(false,currentWays.get(false)+last.get(false));
// 			}
// 			indexCache.put(index,currentWays);
// 			previousNum=s.charAt(index)-'0';
// 			index++;
// 		}
		
// 		return indexCache.get(s.length()-1).get(false)+indexCache.get(s.length()-1).get(true);
    }
}