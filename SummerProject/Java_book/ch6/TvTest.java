package ch6;
class Tv{
	//Tv�� �Ӽ� 
	String color;
	boolean power;
	int channel;
	
	//Tv�� �޼ҵ�
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv(); // �ν��Ͻ� ����
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä����"+t.channel+"�Դϴ�.");
	}

}
