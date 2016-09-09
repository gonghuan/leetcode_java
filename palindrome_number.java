public class palindrome_number {
	public boolean isPalindrome(int x){
		if(x < 0 || x > Integer.MAX_VALUE){
			return false;
		}
		x = Math.abs(x);
		System.out.println(Math.abs(x));
		int div = 1;
		int left = 0;
		int right = 0;
		while(x/div >= 10){
			div *= 10;
		}
		while(div > 1){
			left = x / div;
			right = x % 10;
			if(left != right){return false;}
			x = (x%div)/10;
			div /= 100;
		}
		return true;
	}
}
