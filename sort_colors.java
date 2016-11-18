import java.util.Arrays;

public class sort_colors {
	public void sortColors(int[] A) {
        int head = 0;	//前指针，用来放0
        int tail = A.length - 1;	//后指针，用来放2
        for(int i = 0; i < A.length; i++){
        	if(A[i] == 0 && head < i){		//把0放到前面
        		int temp = A[head];
        		A[head] = A[i];
        		A[i] = temp;
        		head++;
        		i--;						//还是要判断当前的值
        	}
        	if(A[i] == 2 && tail > i){		//把2放到后面
        		int temp = A[tail];
        		A[tail] = A[i];
        		A[i] = temp;
        		tail--;
        		i--;						//还是要判断当前的值
        	}
        }
        System.out.println(Arrays.toString(A));
    }
}
