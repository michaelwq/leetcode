public class Solution {
    public boolean isAnagram(String s, String t) {
        if((s==null&&t!=null)||(s!=null&t==null)){
		return false;
    	}
    	if(s.length()!=t.length()){
    		return false;
    	}
    	HashMap<Character, Integer> charNumCache=new HashMap<Character,Integer>();
    	
    	for(int index=0;index<s.length();index++){
    		if(charNumCache.containsKey(s.charAt(index))){
    			charNumCache.put(s.charAt(index), charNumCache.get(s.charAt(index))+1);
    		}else{
    			charNumCache.put(s.charAt(index), 1);
    		}
    	}
        
    	for(int index=0;index<t.length();index++){
    		if(charNumCache.containsKey(t.charAt(index))){
    			if(charNumCache.get(t.charAt(index))==0){
    				return false;
    			}
    			charNumCache.put(t.charAt(index), charNumCache.get(t.charAt(index))-1);
    		}else{
    			return false;
    		}
    	}
    	for(char item: charNumCache.keySet()){
    		if(charNumCache.get(item)!=0){
    			return false;
    		}
    	}
    	
    	return true;
    }
}