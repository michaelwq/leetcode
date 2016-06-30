public class Solution {
    int sum=0;
    public int totalNQueens(int n) {
        int[] applyColumn=new int[n];
		
		
		//initial state is row 0

		placeQueen(0, n,applyColumn);
				
		return sum;
    }
	
	public void placeQueen(int row, int n,int[] applyColumn){
		if(row==n)
			sum++;
		for(int col=0;col<n;col++){
			if(isAvailable(row, col, applyColumn)){
				applyColumn[row]=col;
				placeQueen(row+1, n, applyColumn);
			}
		}
	}
	
	
	public boolean isAvailable(int row, int col, int[] applyColumn){
		if(row==0){
			return true;
		}
		
		for(int i=0;i<row;i++){
			if(col==applyColumn[i]){
				return false;
			}
			if((row-i)==Math.abs(col-applyColumn[i])){
				return false;
			}
			
		}
		return true;
	}
}