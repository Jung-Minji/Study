package ch2;

public class FloatToBinEx {

	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);  // float�� int������ �ؼ��ؼ� ��ȯ��
		
		System.out.println("f="+f);
		System.out.printf("%X",i);

	}

}
