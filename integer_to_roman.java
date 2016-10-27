public class integer_to_roman {
	
	public String intToRoman(int num) {
		StringBuffer buffer = new StringBuffer();
		int temp = num/1000;	//表示几千,最大值就是3（本题范围是[1,3999]）
		while(temp > 0){
			buffer.append("M");
			temp--;
		}
		num = num % 1000;
		temp = num/100;		//表示千位
		if(temp > 0 && temp < 4){
			while(temp > 0){
				buffer.append("C");
				temp--;
			}
		}else if(temp == 4){
			buffer.append("CD");
		}else if(temp > 4 && temp <= 8){
			buffer.append("D");
			temp -= 5;
			while(temp > 0){
				buffer.append("C");
				temp--;
			}
		}else if(temp == 9){
			buffer.append("CM");
		}
		
		num = num % 100;
		temp = num / 10;	//表示十位
		if(temp > 0 && temp < 4){
			while(temp > 0){
				buffer.append("X");
				temp--;
			}
		}else if(temp == 4){
			buffer.append("XL");
		}else if(temp > 4 && temp <= 8){
			buffer.append("L");
			temp -= 5;
			while(temp > 0){
				buffer.append("X");
				temp--;
			}
		}else  if(temp == 9){
			buffer.append("XC");
		}
		temp = num % 10;	//表示个位
		if(temp > 0 && temp < 4){
			while(temp > 0){
				buffer.append("I");
				temp--;
			}
		}else if(temp == 4){
			buffer.append("IV");
		}else if(temp > 4 && temp <= 8){
			buffer.append("V");
			temp -= 5;
			while(temp > 0){
				buffer.append("I");
				temp--;
			}
		}else  if(temp == 9){
			buffer.append("IX");
		}
		return buffer.toString();
    }
}
