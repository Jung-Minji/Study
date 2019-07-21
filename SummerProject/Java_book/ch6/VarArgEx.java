package ch6;
// 가변인수 : 매개변수의 개수를 지정할 수 있다. 형태 : 타입...변수명

public class VarArgEx {

	public static void main(String[] args) {
		String [] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate("", new String[] {"1","2","3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
		
	}
	
	static String concatenate(String delim, String ...args) {
		String result ="";
		
		for (String str : args) {
			result += str + delim;
		}
		
		return result;
	}
}
