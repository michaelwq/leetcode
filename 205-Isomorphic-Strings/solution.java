public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character ,List<Integer>> map=new HashMap<Character ,List<Integer>>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            List<Integer> list=new ArrayList<Integer>();
            
            char c = s.charAt(i);
            if(map.containsKey(c)){
                list.addAll(map.get(c));
            }
            list.add(i);
            map.put(c,list);
        }
        HashSet<Character> uniqueChar=new HashSet<Character>();
        for(Map.Entry<Character,List<Integer>> entry: map.entrySet()){
            HashSet<Character> check=new HashSet<Character>();
            if(uniqueChar.contains(t.charAt(entry.getValue().get(0)))){
                return false;
            }
            for(int item:entry.getValue()){
                check.add(t.charAt(item));
            }
            if(check.size()>1){
               return false; 
            }
            uniqueChar.add(t.charAt(entry.getValue().get(0)));
         
        }
        
        return true;
    }
}