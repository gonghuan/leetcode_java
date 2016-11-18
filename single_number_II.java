
public class single_number_II {
	public int singleNumber(int[] A) {
        if(A == null){
        	return Integer.MIN_VALUE;
        }else{
        	int one = 0;	//出现过一次的位
        	int two = 0;	//出现过两次的位
        	int three = 0;	//出现过三次的位
        	for(int i = 0; i < A.length; i++){
        		int a = A[i];
        		two |= one&a;	//先修改two
        		one ^= a;		//再修改one
        		three = one&two;	//one和two相应位置都是1的表示出现过3次
        		one &= ~three;		//出现过3次的位在one和two中都修正回0
        		two &= ~three;
        	}
        	return one;
        }
    }
}
