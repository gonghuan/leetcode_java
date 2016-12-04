
public class jump_game_II {
	public int jump(int[] A) {
        int begin = 0;	//从0的位置开始向后遍历
        int jump = 0;	//最少需要跳多少次
        while(begin < A.length){
        	if(A[begin] == 0 || A.length == 1){			//如果某一个的值是0,则永远都不能到达，返回负数。
        		return 0;
        	}else if(begin + A[begin] >= A.length - 1){	//如果在跳得范围内可以到最后一个，就直接返回结果。
        		return jump + 1;
        	}
        	else{
        		int max = A[begin];		//max表示这一条和下一条之和最大的值，初始表示不跳。
        		int max_index = begin;	//取得最大值时，在数组中的索引
        		for(int i = begin + 1; i <= begin + A[begin]; i++){	//从begin的后一个开始查找,找最大可以跳的值
            		if(i - begin + A[i] > max){
            			max_index = i;
            			max = i - begin + A[i];
            		}
            	}
        		jump++;
        		begin = max_index;
        	}
        }
        return jump;
    }
}
