public class Solution {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> valueMap=new HashMap<Character,Integer>();
        int output=0;
        int index=1;
        for(char alphabet = 'A'; alphabet <= 'Z';alphabet++) {
            valueMap.put(alphabet,index);
            index++;
        }
        
        for(index=s.length()-1; index>=0 ;index--) {
            output=output+valueMap.get(s.charAt(index))*((int)Math.pow(26,s.length()-1-index ));
        }
        
        return output;
    }
}