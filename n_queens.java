import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class n_queens {
	public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> result = new ArrayList<>();	//返回的结果
        
        String[] strs = new String[n];	//初始化String的数组，起始都是“.”
        char[] chs = new char[n];
        for(int i = 0; i < n; i++){
        	chs[i] = '.';
        }
        String str = String.valueOf(chs);
        for(int i = 0; i < n; i++){
        	strs[i] = str;
        }
        Map<Integer, Integer> map = new HashMap<>();
        result = solveNQueens(n, 0, map, result, strs);
        return result;
    }
	
	public ArrayList<String[]> solveNQueens(int n, int row, Map<Integer, Integer> map, ArrayList<String[]> result, String[] strs){
		if(row >= n){
			for(Map.Entry<Integer, Integer> entry : map.entrySet()){
				int key = entry.getKey();
				int value = entry.getValue();
				char[] chs = strs[key].toCharArray();
				chs[value] = 'Q';
				strs[key] = String.valueOf(chs);
			}
			String[] temps = new String[n];
			for(int i = 0; i < temps.length; i++){
				temps[i] = strs[i];
			}
			result.add(temps);
			for(int i = 0; i < n; i++){
				strs[i] = strs[i].replace("Q", ".");
			}
			return result;	//如果遍历过解空间树的叶子节点，说明该方法可行
		}
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
					result = solveNQueens(n, row + 1, map, result, strs);
					map.remove(row);					
				}	
			}
			return result;
		}
	}
}
