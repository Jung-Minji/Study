package ch6;
// ������ ���� - this ���

class Car0 {
	String color;
	String gearType;
	int door;
	
	Car0(){   // Car(String color, String gearType, int door)�� ȣ��
		this("white", "auto", 4);  
	}
	
	Car0(String color){
		this(color, "auto", 4);
	}
	
	Car0(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest2{
	public static void main(String[] args) {
		Car0 c1 = new Car0();
		Car0 c2 = new Car0("blue");
		
		System.out.printf("c1�� color=%s,gearType=%s,door=%d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2�� color=%s,gearType=%s,door=%d", c2.color, c2.gearType, c2.door);
		
		
		
		
		
	}
}
