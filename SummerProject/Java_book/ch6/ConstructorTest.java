package ch6;

// 생성자의 유무 > 생성자를 사용하는 것이 더 효율적이다.
class Data11 {
	int value;

}
class Data2{
	int value;
	
	Data2(int x){  // 매개변수가 있는 생성자
		value = x;
	}
	
	Data2(){
		
	}
}

class ConstructorTest{
	public static void main(String[] args) {
		Data11 d1 = new Data11();
		Data2 d2 = new Data2();
		
	}
}