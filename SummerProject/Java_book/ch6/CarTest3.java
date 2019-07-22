package ch6;

// ������ �Ű������� �����������

class NewCar {
	String color;
	String gearType;
	int door;
	
	NewCar(){
		this("white","auto",4);
	}
	
	NewCar(NewCar c){	// NewCar�� ���������� �Ű������� ������ ������ 
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
		NewCar c2 = new NewCar(c1);  // c1�� ���纻 c2�� �����Ѵ�.
		
		System.out.printf("c1�� color=%s, gearType=%s, door=%d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2�� color=%s, gearType=%s, door=%d%n", c2.color, c2.gearType, c2.door);
		
		c1.door = 100;	// c1�� �ν��Ͻ� ���� door�� ���� �����Ѵ�.
		
		System.out.printf("c1�� color=%s, gearType=%s, door=%d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2�� color=%s, gearType=%s, door=%d%n", c2.color, c2.gearType, c2.door);
		
	}
}