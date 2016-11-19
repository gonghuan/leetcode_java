
public class spiral_matirx_II {
	public int[][] generateMatrix(int n) {
        int num = 1;	//表示数字
        int[][] result = new int[n][n];	//返回结果
        int round = 0;	//表示圈数
        while(num <= n*n){		
        	int i = round;		
        	int j = round;
        	for(; j < n - round; j++){		//四个for循环完成一圈的赋值
        		result[i][j] = num;
        		num++;
        	}
        	j--;
        	for(++i; i < n - round; i++){
        		result[i][j] = num;
        		num++;
        	}
        	i--;
        	for(--j; j >=round; j--){
        		result[i][j] = num;
        		num++;
        	}
        	j++;
        	for(--i; i > round; i--){
        		result[i][j] = num;
        		num++;
        	}
        	round++;
        }
        return result;
    }
}
