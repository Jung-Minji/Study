package ch6;
// t2�� channel����?

class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t2 = t1;
		t1.channel = 7;

		t3.channel = 10 + t1.channel;
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t3�� channel���� " + t3.channel + "�Դϴ�.");
		t2.channel = 5;		
		System.out.println("t1�� channel���� "+t1.channel+"�� �����߽��ϴ�.");
		System.out.println("t2�� channel���� "+t2.channel+"�� �����߽��ϴ�.");
		
		t1.channel = 10;
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		System.out.println("t3�� channel���� " + t3.channel + "�Դϴ�.");
		
	}

}
