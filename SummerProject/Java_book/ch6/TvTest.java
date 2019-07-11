package ch6;
class Tv{
	//Tv의 속성 
	String color;
	boolean power;
	int channel;
	
	//Tv의 메소드
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
		Tv t = new Tv(); // 인스턴스 생성
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은"+t.channel+"입니다.");
	}

}
