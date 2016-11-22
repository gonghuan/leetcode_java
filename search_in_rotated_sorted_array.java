
public class search_in_rotated_sorted_array {
	public int search(int[] A, int target) {
        int pivot_index = searchPivot(A, 0, A.length - 1);	//获得旋转点所在位置
        if(target >= A[pivot_index] && target <= A[A.length - 1]){//查找target
        	return binarySearch(A, pivot_index, A.length - 1, target);
        }else if(pivot_index > 0 && target >= A[0] && target <= A[pivot_index - 1]){
        	return binarySearch(A, 0, pivot_index - 1, target);
        }else{
        	return -1;
        }
    }
	
	/**
	 * 二分找到旋转点，如果没有就返回0
	 * @param A
	 * @param begin
	 * @param end
	 * @return
	 */
	public int searchPivot(int[] A, int begin, int end){
		if(begin > end) return 0;	//如果找不到pivot，则表示该数组没有旋转
		else{
			int mid = (begin + end) / 2;
			if(mid < A.length - 1 && A[mid] > A[mid + 1]){
				return mid + 1;
			}else{
				int left = searchPivot(A, begin, mid - 1);	//分治找左边
				int right = searchPivot(A, mid + 1, end);	//分治找右边
				if(left != 0){
					return left;
				}else if(right != 0){
					return right;
				}else{
					return 0;
				}
			}
		}
	}
	
	/**
	 * 二分查找target
	 * @param A
	 * @param begin
	 * @param end
	 * @param target
	 * @return
	 */
	public int binarySearch(int[]A, int begin, int end, int target){
		if(begin > end) return -1;
		else{
			int mid = (begin + end) /2;
			if(A[mid] == target) return mid;
			else{
				if(A[mid] > target) return binarySearch(A, begin, mid - 1, target);
				else return binarySearch(A, mid + 1, end, target);
			}
		}
	}
}
