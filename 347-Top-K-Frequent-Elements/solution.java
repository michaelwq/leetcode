public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> numToCounter=new HashMap<Integer, Integer>();
			Map<Integer, Set<Integer>> counterToNum=new HashMap<Integer, Set<Integer>>();
			
			for(int index=0;index<nums.length;index++){
				if(!numToCounter.containsKey(nums[index])){
					numToCounter.put(nums[index],1);
					if(counterToNum.containsKey(1)){
						counterToNum.get(1).add(nums[index]);
					}else{
						Set<Integer> temp=new HashSet<Integer>();
						temp.add(nums[index]);
						counterToNum.put(1,temp);
					}
				}else{
//					if(counterToNum.get(numToCounter.get(nums[index])).size()==1){
//						counterToNum.remove(numToCounter.get(nums[index]));
//					}else
						counterToNum.get(numToCounter.get(nums[index])).remove(nums[index]);
					
					
					if(counterToNum.containsKey(numToCounter.get(nums[index])+1)){
						counterToNum.get(numToCounter.get(nums[index])+1).add(nums[index]);
					}else{
						Set<Integer> temp=new HashSet<Integer>();
						temp.add(nums[index]);
						counterToNum.put(numToCounter.get(nums[index])+1,temp);
					}
					numToCounter.put(nums[index],numToCounter.get(nums[index])+1);
				}
				
			}
			List<Integer> out=new ArrayList<Integer>();
			int total=0;
			for(int index=counterToNum.size();index>=0;index--){
				
				if(total<k){
					out.addAll(counterToNum.get(index));
					total+=counterToNum.get(index).size();
				
				}
				
				if(total>=k){
					break;
				}
			}
			
			return out;
    }
}