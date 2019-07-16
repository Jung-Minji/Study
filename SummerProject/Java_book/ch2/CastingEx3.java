package ch2;

public class CastingEx3 {

	public static void main(String[] args) {
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f=%20.18f%n",f);
		System.out.printf("d=%20.18f%n",d); // 정밀도차이때문에 애초 f와 d에 저장되는 값이 다르다.
		System.out.printf("d2=%20.18f%n",d2);//저장할때 이미 값이 달라졌기 때문에 형변환을 해도 값이 다르다.
		

	}

}
