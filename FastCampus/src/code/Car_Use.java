package code;

public class Car_Use {

	public static void main(String[] args) {
		Car normalCar = new Car(4,"�Ϲ� ����","�극��ũ","�ڵ�");
		Car superCar = new Car(4,"���� ����",true,"�극��ũ","�ڵ�");
		
		normalCar.goForward();
		superCar.goBackward();
		
		superCar.isSuperCar();
		

	}

}
