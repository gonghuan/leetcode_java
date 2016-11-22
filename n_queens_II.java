import java.util.HashMap;
import java.util.Map;

public class n_queens_II {
	public int total = 0;	//全局变量,表示总共有多少种放置方法
	public int totalNQueens(int n) {  
		if(n <= 0) {
			return 0;
		}else if(n == 1){
			return 1;
		}else{
			for(int i = 0; i < n; i++){
				Map<Integer, Integer> map = new HashMap<>();
				map.put(0, i);
				totalNQueen(n, 1, map);
			}
			return total;
		}
    }
	
	//递归实现回溯
	public int totalNQueen(int n, int row, Map<Integer, Integer> map){	//row表示层数
		if(row >= n) return total + 1;	//如果遍历过解空间树的叶子节点，说明该方法可行，将结果加1
		else{
			for(int i = 0; i < n; i++){
				boolean satisfied = true;
				for(Map.Entry<Integer, Integer> entry : map.entrySet()){
					int key = entry.getKey();
					int value = entry.getValue();
					if(value == i || Math.abs(i - value) == (row - key)){	//判断该节点是否满足约束
						satisfied = false;									//不满足约束直接回溯
						break;
					}
				}
				if(satisfied){												//满足约束继续找下一层
					map.put(row, i);
					total = totalNQueen(n, row + 1, map);
					map.remove(row);
				}	
			}
			return total;
		}
	}
}
