package scjp.chapter.three.gtalom;

public class Test2 {
	static Integer s=0;	
	public static void main(String[] args) {
		int a=4;
		Short b=6;
		short y=5;	
		Short[] s={1,2,3};	
				
		go(s);
		go(b,a);
		go(3.14);	
	}

	static void go (Integer in){ System.out.println("1");}
	static void go (Object obj){ System.out.println("2");}
	static void go(short a, int b){System.out.println("3");}
	static void go(short ...t){System.out.println("4");}
	static void go(Long l){System.out.println("5");}
	static void go(Short sh1, Short sh2, Short sh3){System.out.println("6");}
	static void go(Float f){System.out.println("7");}
	static void go(float f){System.out.println("8");}
}

/**
 * Quel est le r�sultat lors de l'ex�cution ? 
 * a-	1 4 7
 * b-   1 4 8
 * c-	4 3 2
 * d-	2 3 8
 * e- 	2 3 2
 * f- 	Erreur de compilation
 */