
public class minPathSum {
	/*public int minPathSum(int[][] grid) {
        return minPartitionSum(grid, 0, 0);
    }
	public int minPartitionSum(int[][] grid, int i, int j){
		if(i == grid.length - 1 && j == grid[0].length - 1){
			return grid[i][j];
		}else if(i == grid.length - 1){
			return grid[i][j] + minPartitionSum(grid, i, j + 1);
		}else if(j == grid[0].length - 1){
			return grid[i][j] + minPartitionSum(grid, i + 1, j);
		}else{
			return Math.min(minPartitionSum(grid, i + 1, j), minPartitionSum(grid, i, j + 1)) + grid[i][j];
		}
	}*/	//递归超时
	
	public int minPathSum(int[][] grid){
		int m = grid.length;
		int n = grid[0].length;
		int[][] pathSum = new int[m][n];
		pathSum[m - 1][n - 1] = grid[m - 1][n - 1];
		for(int i = m - 2; i >= 0; i--){	//将最后一列先赋值
			pathSum[i][n - 1] = grid[i][n - 1] + pathSum[i + 1][n - 1];
		}
		for(int j = n - 2; j >= 0; j--){	//将最后一行先赋值
			pathSum[m - 1][j] += grid[m - 1][j] + pathSum[m - 1][j + 1];
		}
		for(int i = m - 2; i >= 0; i--){
			for(int j = n - 2; j >= 0; j--){
				pathSum[i][j] = grid[i][j] + Math.min(pathSum[i + 1][j], pathSum[i][j + 1]);
			}
		}
		return pathSum[0][0];
	}
}
