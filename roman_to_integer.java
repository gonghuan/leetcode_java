
public class roman_to_integer {
	public int romanToInt(String s) {
        int sum = 0;
        for(int i = s.length() - 1; i >= 0; i--){
        	if(s.charAt(i) == 'I'){
        		sum += 1;
        	}else if(s.charAt(i) == 'V'){
        		sum += 5;
        		if(i-1 >= 0 && s.charAt(i-1) == 'I'){		//IV
        			sum -= 1;
        			i--;
        		}
        	}else if(s.charAt(i) == 'X'){
        		sum += 10;
        		if(i-1 >= 0 && s.charAt(i-1) == 'I'){		//IX
        			sum -= 1;
        			i--;
        		}
        	}else if(s.charAt(i) == 'L'){
        		sum += 50;
        		if(i-1 >= 0 && s.charAt(i-1) == 'X'){		//XL
        			sum -= 10;
        			i--;
        		}
        	}else if(s.charAt(i) == 'C'){
        		sum += 100;
        		if(i-1 >= 0 && s.charAt(i-1) == 'X'){		//XC
        			sum -= 10;
        			i--;
        		}
        	}else if(s.charAt(i) == 'D'){
        		sum += 500;
        		if(i-1 >= 0 && s.charAt(i-1) == 'C'){		//CD
        			sum -= 100;
        			i--;
        		}
        	}else{
        		sum += 1000;
        		if(i-1 >= 0 && s.charAt(i-1) == 'C'){		//CM
        			sum -= 100;
        			i--;
        		}
        	} 
        }
        
        return sum;
    }
}
