
public class RepeatString {
	public static String repeatString(String s, int times) {
		if (times<0) {
			throw new IllegalArgumentException("k cannot be less than 0");
		}
	    if (times <= 0) return "";
	    else return s + repeatString(s, times-1);
	}
}
