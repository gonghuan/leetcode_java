
public class remove_element {
	public int removeElement(int[] A, int elem) {
        //每次找到一个就把它和最后的调换位置
		int count = 0;
        for(int i = 0; i < A.length - count; i++){
        	if(A[i] == elem){
        		int temp = A[A.length - count - 1];
        		A[A.length - count - 1] = A[i];
        		A[i] = temp;
        		i--;	//因为最后一个数也有可能是elem，所以这个数也要判断
        		count++;	//最后再将count加1
        	}
        }
		return A.length - count;
    }
}
