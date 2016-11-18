
public class single_number {
	public int singleNumber(int[] A) {
        if(A == null){
        	return Integer.MIN_VALUE;
        }else{
        	int length = A.length;
        	int result = 0;
        	for(int i = 0; i < length; i++){
        		result ^= A[i];
        	}
        	return result;
        }
    }
}
