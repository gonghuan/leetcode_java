import java.util.HashSet;
import java.util.Set;

public class valid_sudoku {
	public boolean isValidSudoku(char[][] board) {
        boolean result = true;
        Set<Character> set1 = new HashSet<>();	//第一个3×3正方形
        Set<Character> set2 = new HashSet<>();	//第二个3×3正方形
        Set<Character> set3 = new HashSet<>();	//第三个3×3正方形
        Set<Character> set = new HashSet<>();	//一行或者一列的结果
        if(board == null){
        	return false;
        }else{
        	int row_len = board.length;
            int col_len = board[0].length;
        	for(int i = 0; i < row_len; i++){		//判断行和每个3×3的正方形
        		for(int j = 0; j < col_len; j++){
        			if(board[i][j] != '.'){
        				result = set.add(board[i][j]);
            			if(!result){return false;}
            			else{
            				switch (j/3) {
    						case 0:
    							result = set1.add(board[i][j]);
    							break;
    						case 1:
    							result = set2.add(board[i][j]);
    							break;
    						case 2:
    							result = set3.add(board[i][j]);
    							break;
    						default:
    							break;
    						}
            				if(!result) return false;
            			}
        			}	
        		}
        		set.clear();
        		if(i % 3 == 2){
        			set1.clear();
        			set2.clear();
        			set3.clear();
        		}
        	}
        	for(int i = 0; i < row_len; i++){		//判断列是否符合
        		for(int j = 0; j < col_len; j++){
        			if(board[j][i] != '.'){
        				result = set.add(board[j][i]);
        				if(!result){return false;}
        			}
        		}
        		set.clear();
        	}
        	
        }
        return result;
    }
}
