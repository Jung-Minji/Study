package ch6;

// �������� ���� > �����ڸ� ����ϴ� ���� �� ȿ�����̴�.
class Data11 {
	int value;

}
class Data2{
	int value;
	
	Data2(int x){  // �Ű������� �ִ� ������
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