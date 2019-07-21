package ch6;
// 생성자

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {} // 매개변수가 없는 생성자

	Car(String c, String g, int d){		//매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}
}
class CarTest{
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white"; 
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 =  new Car("white","auto",4);
		
		System.out.printf("c1의 color=%s, gear=%s,door=%d%n",c1.color,c1.gearType,c1.door);
		System.out.printf("c2의 color=%s, gear=%s,door=%d%n",c2.color,c2.gearType,c2.door);
		
	}

}