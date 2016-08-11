public class Solution {
    public int uniquePaths(int m, int n) {
		ResultSet resultSet = new ResultSet(0, 0, 1);
        return getPath(resultSet, m, n).result;
        
    }
    private ResultSet getPath(ResultSet resultSet, int m_limit, int n_limit){
        if(resultSet.m < m_limit - 1 && resultSet.n < n_limit - 1){
			int m = resultSet.m;
			int n = resultSet.n;
			int result = resultSet.result;
			if(resultSet.m < m_limit - 1){
				ResultSet right = new ResultSet(m+1, n, result);
				right = getPath(right , m_limit, n_limit);
				result = right.result;
			}
			if (resultSet.n < n_limit - 1){
				ResultSet down = new ResultSet(m, n+1, result + 1);
				down = getPath(down , m_limit, n_limit);
				result = down.result;
			}
			return new ResultSet(m_limit, n_limit, result) ;
		}
		return resultSet;
    }
	class ResultSet{
		int m;
		int n;
		int result;
		ResultSet(int m, int n, int result){
			this.m = m;
			this.n = n;
			this.result = result;
		}
	}
}