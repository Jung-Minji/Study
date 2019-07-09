package ch2;

public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';  //char ch = 65
		int code = (int)ch; // ch를 int형으로 형변환 값을 code에 저장
		
		System.out.printf("%c=%d(%#X)%n", ch,code,code); // printf l
		
		char hch = '가';
		System.out.printf("%c=%d(%#X)%n",hch, (int)hch,(int)hch);
		
		
		
		
				
		

	}

}
