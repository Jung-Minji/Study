package ch6;
// t2의 channel값은?

class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1;
		t1.channel = 7;

		t3.channel = 10 + t1.channel;
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t3의 channel값은 " + t3.channel + "입니다.");
		t2.channel = 5;		
		System.out.println("t1의 channel값을 "+t1.channel+"로 변경했습니다.");
		System.out.println("t2의 channel값을 "+t2.channel+"로 변경했습니다.");
		
		t1.channel = 10;
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		System.out.println("t3의 channel값은 " + t3.channel + "입니다.");
		
	}

}
