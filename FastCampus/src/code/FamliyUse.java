package code;

public class FamliyUse {

	public static void main(String[] args) {
		Father father = new Father();
		Mother mother = new Mother();
		Son son = new Son();
		
		father.wash();
		mother.cook();
		son.study(); 
		father.sleep();
		mother.sleep();
		son.sleep();
		father.eat();
		mother.eat();
		son.eat();
		father.wash("sampoo");
		
	}

}
