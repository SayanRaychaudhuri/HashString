
public class HashString {
	
	public static void main(String[] arg) {
		System.out.print(hashString(3));
	}
	
	public static String hashString(int k){
		if (k<0) {
			throw new IllegalArgumentException("k cannot be less than 0");
		}
		     return RepeatString.repeatString("#",count(k));
	}
	
	public static int count(int n) {
	if (n == 0){
	   return 1;
	   }
	   return 2 * count (n - 1);
	}
	

}
