package scjp.chapter2.mehdiabbes;

public class Ex {
	int i = 5;
	static void doStuff(){
		System.out.println("Ex doStuff");
		System.out.println("in parent doStuff i : " + new Ex().i);
	}

}

class SubEx extends Ex{
	int i =1;
	static void doStaff(){
		Ex ex = new SubEx();
		ex.i++;
		Ex.doStuff();
		System.out.println("subex doStuff");
		System.out.println("ex.i : " + ex.i);
		System.out.println("i : " + new SubEx().i);
	}
	
	public static void main(String[] args) {
		(new SubEx()).doStaff();
	}
}

//what's the output
