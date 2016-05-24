public class Solution {
    public int maxProduct(String[] words) {
int product=0;
int[] processWords=new int[words.length];
for(int index=0; index<words.length;index++){

	for(int charIndex=0;charIndex<words[index].length();charIndex++){
		processWords[index]|=1<<words[index].charAt(charIndex)-'a';
	}
}

for(int i=0; i<processWords.length-1;i++){
	for(int j=i+1; j<processWords.length;j++){
		if((processWords[i]&processWords[j])==0&&words[i].length()*words[j].length()>product ){
			product=words[i].length()*words[j].length();
		}
	}
}

return product;
    }
}