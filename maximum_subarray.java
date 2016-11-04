
public class maximum_subarray {
	/*public int maxSubArray(int[] A) {			
		if(A == null){
			return 0;
		}else{
			int length = A.length;
			if(length == 1){
	        	return A[0];
	        }else{
	        	int[] result = divide(A, 0, length - 1);
	        	return result[0];
	        }
		}
    }
	public int[] divide(int[] A, int begin, int end){								//分解
		if(begin == end){
			int[] temp = {A[begin], begin, end};
			return temp;
		}else{
			int mid = (begin + end) / 2;
			return(combine(divide(A, begin, mid), divide(A, mid + 1, end)));
			
		}
	}
	
	public int[] combine(int[] A, int[] B){		//合并
		int max1 = A[0];		//左边数组最大的区间和
		int begin1 = A[1];		//左边最大区间起始位置
		int end1 = A[2];		//左边最大区间结束位置
		int max2 = B[0];		//右边数组最大的区间和
		int begin2 = B[1];		//右边最大区间起始位置
		int end2 = B[2]; 		//右边最大区间结束位置
		int max = 0;			//返回结果
		int begin = 0;
		int end = 0;
		if(max1 <= 0 || max2 <= 0 || end1 + 1 != begin2){
			max = max1 > max2 ? max1 : max2;
			if(max == max1){
				begin = begin1;
				end = end1;
			}else{
				begin = begin2;
				end = end2;
			}
		}else{
			max = max1 + max2;
			begin = begin1;
			end = end2;
		}
		int[] temp_result = {max, begin, end};
		return temp_result;
	}*/
	public int maxSubArray(int[] A){
		if(A == null){
			return 0;
		}else if(A.length == 1){
			return A[0];
		}else{
				int sum = 0; int max = A[0];
				int i = 0;
				while(i < A.length){
					sum += A[i];
					max = max > sum ? max : sum;
					if(sum < 0){
						sum = 0;
					}
					i++;
				}
				return max;
		}
	}
}
