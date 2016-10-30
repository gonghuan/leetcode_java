
public class rotate_image {
	public void rotate(int[][] matrix){
		if(matrix == null || matrix.length == 1){
			return;
		}else{
			int n = matrix.length;		//n*n的矩阵,n表示大小
			int i = n - 1;				//数组的最后一个位置
			int k = 0;
			while(k < i){
				for(int j = k; j < i; j++){
					int temp1 = matrix[j][i];
					matrix[j][i] = matrix[k][j];
					int temp2 = matrix[i][i + k - j];
					matrix[i][i + k - j] = temp1;
					temp1 = matrix[i + k - j][k];
					matrix[i + k - j][k] = temp2;
					matrix[k][j] = temp1;
				}
				k++;
				i--;
			}
			for(int a = 0; a < n; a++){
				for(int b = 0; b < n; b++){
					System.out.println(matrix[a][b]);
				}
			}
		}
	}
}
