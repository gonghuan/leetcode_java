
public class remove_duplicates_from_sorted_array {
	public int removeDuplicates(int[] A) {
        int count = 1;	//用来记录不重复的个数,刚开始为1,因为A[0]肯定存在
        if(A == null || A.length == 0){
        	return 0;
        }else{
        	for(int i = 1; i < A.length; i++){
            	if(A[i - 1] != A[i]){	//当两个值不相等时，count+1,并且将A[i]放到count的位置
            		A[count] = A[i];
            		count++;
            	}	//如果相等，就什么都不做
            }
            return count;
        }
    }
}
