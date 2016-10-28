public class climbing_stairs {
	public int climbStairs(int n) {
        if(n < 0){
        	return 0;
        }else if(n == 0){
        	return 1;
        }else if(n == 1){
        	return 1;
        }else if(n == 2){
        	return 2;
        }else{
        	int[] climb = new int[n];		//动态规划方法，该数组用于保存中间结果
        	climb[0] = 1;
        	climb[1] = 2;
        	for(int i = 2; i < n; i++){
        		climb[i] = climb[i - 1] + climb[i - 2];
        	}
        	return climb[n - 1];
        }
    }
}
