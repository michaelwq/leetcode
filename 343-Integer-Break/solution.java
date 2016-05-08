public class Solution {
    public int integerBreak(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        if(n==4)
            return 4;
            
        int tmp=1;
        while(n>4){
            n=n-3;
            tmp*=3;

        }
        return tmp*n;
        
    }
}