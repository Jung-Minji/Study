package code;

public class Car {
	int tires;
	String engine;
	Boolean superEngine;
	String break_;
	String handle;
	
	public Car(int tires, String engine, String break_, String handle) {
		this.tires = tires;
		this.engine = engine;
		this.break_ = break_;
		this.handle = handle;
	
	}
	public Car(int tires, String engine, Boolean superEngine, String break_, String handle) {
		this.tires = tires;
		this.engine = engine;
		this.superEngine = superEngine;
		this.break_ = break_;
		this.handle = handle;
	}
	
	public void goForward() {
		System.out.println("�����մϴ�.");
	}
	public void goBackward() {
		System.out.println("�����մϴ�.");
	}
	public void isSuperCar() {
		if (superEngine == true) {
			System.out.println("����ī�Դϴ�.");
		}else {
			System.out.println("����ī�� �ƴմϴ�.");
		}
	}

}
