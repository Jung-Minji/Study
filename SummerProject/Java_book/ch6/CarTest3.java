package ch6;

// 생성자 매개변수로 참조변수사용

class NewCar {
	String color;
	String gearType;
	int door;
	
	NewCar(){
		this("white","auto",4);
	}
	
	NewCar(NewCar c){	// NewCar의 참조변수를 매개변수로 선언한 생성자 
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	NewCar(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest3{
	public static void main(String[] args) {
		NewCar c1 = new NewCar();
		NewCar c2 = new NewCar(c1);  // c1의 복사본 c2를 생성한다.
		
		System.out.printf("c1의 color=%s, gearType=%s, door=%d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d%n", c2.color, c2.gearType, c2.door);
		
		c1.door = 100;	// c1의 인스턴스 변수 door의 값을 변경한다.
		
		System.out.printf("c1의 color=%s, gearType=%s, door=%d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d%n", c2.color, c2.gearType, c2.door);
		
	}
}