public class Solution {
    public int check(char c){
	int num=0;
	switch(c){
		case 'I':	
			num=1;
			break;
		case 'V':	
			num=5;
			break;
		case 'X':	
			num=10;
			break;
		case 'L':	
			num=50;
			break;
		case 'C':	
			num=100;
			break;
		case 'D':	
			num=500;
			break;
		case 'M':	
			num=1000;
			break;

	}
	return num;
}
public int romanToInt(String s) {
    int result=0;
    if(s.length()==1){
        return check(s.charAt(0));
    }
	int index=s.length()-2;
    while(index>=0){
		int after=check(s.charAt(index+1));
		int before=check(s.charAt(index));
		if(after<=before){
			result=result+after;
			if(index==0)
				result=result+before;
			
			index--;
		}else{
			result=result+after-before;
			if(index==1){
				result=result+check(s.charAt(0));
			}
			index-=2;
		}
	
	}
	
	return result;
	
}
}