public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int index=0;index<triangle.size()-1;index++){
				List<Integer> current=triangle.get(index);
				List<Integer> next=triangle.get(index+1);
				for(int nextIndex=0;nextIndex<next.size();nextIndex++){
					if(nextIndex==0){
						next.set(nextIndex,next.get(nextIndex)+current.get(nextIndex));
						continue;
					}
					if(nextIndex==next.size()-1){
						next.set(nextIndex,next.get(nextIndex).intValue()+current.get(nextIndex-1));
						break;
					}
					int temp=current.get(nextIndex-1)>=current.get(nextIndex)?current.get(nextIndex):current.get(nextIndex-1);
					next.set(nextIndex,next.get(nextIndex)+temp);			
				}
			}
			Collections.sort(triangle.get(triangle.size()-1));
			
			return triangle.get(triangle.size()-1).get(0);
    }
}