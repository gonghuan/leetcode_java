import java.util.Stack;

public class trapping_rain_water {
	public int trap(int[] A) {
        Stack<Integer> stack = new Stack<>();
        if(A == null || A.length == 0){
        	return 0;
        }else{
        	stack.push(A[0]);
        	int height = A[0];
        	int result = 0;
        	for(int i = 1; i < A.length; i++){
        		if(A[i] < height){		//如果当前值小于height,就加入栈当中
        			stack.push(A[i]);
        		}else{					//如果当前值大于等于height,那就说明可以存水
        			while(!stack.isEmpty()){
        				result += height - stack.pop();	//可以盛放多少水等于当前的高度height减去小方块的高度
        			}
        			stack.push(A[i]);	
        			height = A[i];	//修改高度
        		}
        	}
        	height = stack.pop();	//到最后都没有比当前height更高以后，从栈顶向栈底走逐步求可容纳的水量
        	while(!stack.isEmpty()){
        		int temp = stack.pop();
        		if(temp <= height) result += height - temp;
        		else{
        			height = temp;
        		}
        	}
        	return result;
        }
        
    }
}
