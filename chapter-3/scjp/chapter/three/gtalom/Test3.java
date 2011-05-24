package scjp.chapter.three.gtalom;

public class Test {
	private String s;
	Test(String s){ System.out.println("Parent:" + s); } 
}

public class Test3 extends Test {
    String name ="toto";
	Test3(String s){ 
		name=s;
		System.out.println(name); 
	}
	Test3(){ 
		System.out.println(name);
	}
	
	static{System.out.print("1");}
	{System.out.print("2");}
	{System.out.print("3");}
	static{System.out.print("4");}
	
	public static void main(String[] args) {
		 
		new Test3();		
		new Test3("titi");
	}

}

/***
 * question : compile pas ? compile  ? si oui affihe ?
 * a-)  1 2 toto 3 4 titi
 * b-)  1 4 toto 2 3 titi
 * c-)  2 3 toto 1 4 titi    
 * 
 * */
