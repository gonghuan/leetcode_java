import java.util.Arrays;

public class merge_sorted_array {
	public void merge(int A[], int m, int B[], int n) {
        //从后往前比较两个数组
		int i = m - 1;	//i初始值是A的最后一个位置
		int j = n - 1;	//j初始值是B的最后一个位置
		int count = 0;	//表示已经处理了多少个数
		while(i >= 0 && j >= 0){
			if(A[i] >= B[j]){
				A[m + n - 1 - count] = A[i];
				i--;
				count++;
			}else{
				A[m + n - 1 - count] = B[j];
				j--;
				count++;
			}
		}
		while(j >= 0){	//A已经遍历完而B没有遍历完还需要将B中剩下的加入A中
			A[m + n - 1 - count] = B[j];
			j--;
			count++;
		}
		//System.out.println(Arrays.toString(A));
    }
}
