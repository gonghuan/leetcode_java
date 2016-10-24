public class container_with_most_water {
	public int maxArea(int[] height){
		int length = height.length;
		if(length == 0){				//如果height没有值，返回面积最大为0
			return 0;
		}else if(length == 1){			//如果height只有一个值，返回最大面积为0
			return 0;
		}else{							//如果height有两个及以上的值
			int result_max = Math.min(height[0], height[1]);		//最终返回的结果
			for(int i=2; i < length; i++){
				int temp_max = 0;		//用于保存嵌套循环中的最大值
				for(int j = 0; j < i; j++){
					int temp = Math.min(height[j], height[i])*(i - j);
					if(temp > temp_max){
						temp_max = temp;
					}
				}
				if(temp_max > result_max){
					result_max = temp_max;
				}
			}
			return result_max;
		}
	}
}
