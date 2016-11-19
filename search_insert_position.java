
public class search_insert_position {
	public int searchInsert(int[] A, int target) {
        return binarySearch(A, 0, A.length - 1, target);
    }
	
	public int binarySearch(int[] A, int begin, int end, int target){
		if(begin >= end){
			int mid = (begin + end) / 2;
			if(A[mid] >= target) return mid;
			else return mid + 1;
		}else{
			int mid = (begin + end) / 2;
			if(A[mid] == target) return mid;
			else if(A[mid] > target) return binarySearch(A, begin, mid - 1, target);
			else return binarySearch(A, mid + 1, end, target);
		}
	}
}
