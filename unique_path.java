
public class unique_path {
	/**
	 * 递归的方法，样例没有通过，时间复杂度太高！
	 * @param m
	 * @param n
	 * @return
	 */
	/*public int uniquePaths(int m, int n) {
        if(m <= 1 && n <= 1){
        	return 0;
        }else if((m == 1 && n == 2)||(m == 2 && n == 1)){
        	return 1;
        }else if(m == 1 && n > 2){
        	return uniquePaths(m, n - 1);
        }else if(n == 1 && m > 2){
        	return uniquePaths(m - 1, n);
        }else{
        	return  uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
        }
   }*/
	
	/**
	 * 采用迭代的方法
	 */
	public int uniquePaths(int m, int n){
		if(m < 1 && n < 1){
			return 0;
		}else if(m == 1 || n == 1){
			return 1;
		}else{
        	int[][] result = new int[m][n];		//二维数组，用于保存每一步的结果
        	for(int i = m - 1; i >= 0; i--){
        		for(int j = n - 1; j >= 0; j--){
        			if(i < m - 1 && j < n - 1){
        				result[i][j] = result[i+1][j] + result[i][j+1];
        			}else if(i < m - 2 && j == n - 1){
        				result[i][j] = result[i+1][j];
        			}else if(i == m - 1 && j < n - 2){
        				result[i][j] = result[i][j+1];
        			}else if(i == m - 2 && j == n - 1 || i == m - 1 && j == n - 2){		//用于赋初值
        				result[i][j] = 1;
        			}else{
        				result[i][j] = 0;		//用于赋初值
        			}
        		}
        	}
        	return result[0][0];
        }
	}
}
