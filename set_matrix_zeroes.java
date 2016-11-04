
public class set_matrix_zeroes {
	//利用第1行和第1列的空间做记录
	public void setZeroes(int[][] matrix) {
        //遍历第0行
		int row_length = matrix.length;			//行数
		int col_length = matrix[0].length;		//列数
		boolean row0 = false;					//记录第0行是否有0
		boolean col0 = false;					//记录第0列是否有0
		if(row_length <= 0 || col_length <= 0){	
			return;
		}else if(row_length == 1 || col_length == 1){	//只有1行或者1列时
			for(int i = 0; i < row_length; i++){
				for(int j = 0; j < col_length; j++){
					if(matrix[i][j] == 0){
						row0 = true;
						break;
					}
				}
			}
			if(row0 == true){
				for(int i = 0; i < row_length; i++){
					for(int j = 0; j < col_length; j++){
						matrix[i][j] = 0;
					}
				}
			}
		}else{											//行列都大于1时，判断第0行和第0列是否有0
			for(int j = 0; j < col_length; j++){
				if(matrix[0][j] == 0){
					row0 = true;
					break;
				}
			}
			for(int i = 0; i < row_length; i++){
				if(matrix[i][0] == 0){
					col0 = true;
					break;
				}
			}
			
			//遍历整个数组，判断是否为0
			for(int i = 1; i < row_length; i++){
				for(int j = 1; j < col_length; j++){
					if(matrix[i][j] == 0){
						matrix[i][0] = 0;				//将该结果保存到[i, 0]相应位置
						matrix[0][j] = 0;				//将该结果保存到[0, j]相应位置
					}
				}
			}
			
			//遍历第0行和第0列，将0所在的行或者列设置为0
			for(int i = 1; i < row_length; i++){
				if(matrix[i][0] == 0){
					for(int j = 1; j < col_length; j++){
						matrix[i][j] = 0;
					}
				}
			}
			for(int j = 1; j < col_length; j++){
				if(matrix[0][j] == 0){
					for(int i = 1; i < row_length; i++){
						matrix[i][j] = 0;
					}
				}
			}
			
			//最后改变第0行和第0列
			if(row0){
				for(int j = 0; j < col_length; j++){
					matrix[0][j] = 0;
				}
			}
			if(col0){
				for(int i = 0; i < row_length; i++){
					matrix[i][0] = 0;
				}
			}
		}
    }
}
