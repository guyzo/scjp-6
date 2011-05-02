package scjp.chapter2.mehdiabbes;

abstract class Bobo{					//Where is Bryan (the problem)
	
	char getChar(){
		return 'c';
	}
	
	static int getInt (){
		return 5;
	}
	
	static{
		System.out.println("static init bloc");
		System.out.println(getInt());
	}
	{
		System.out.println("init bloc");
		System.out.println(getChar());		
	}
	
	public Bobo(int i){
		System.out.println("bobo constructor");		
	}
	
}

public class Toto extends Bobo{		
	
	public Toto(){
		super(getChar());
		System.out.println("toto constructor with no args");		
	}
		
	public Toto(String a, String b){
		this();
		System.out.println("toto constructor with args");
	}
	
	public static void main(String[] args) {
		
		new Toto("", "");
		
	}
}
