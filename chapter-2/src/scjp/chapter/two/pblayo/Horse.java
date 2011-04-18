package scjp.chapter.two.pblayo;

public class Horse extends Mammal {
	
	public Horse(String name) {
		System.out.println("Horse");
	}

	public static void main(String[] args) {
		new Horse("philippe");
	}
}

class Mammal {

	public Mammal(String name) {
		System.out.println("Mammal");
	}
}

/*
1 package scjp.chapter.two.pblayo;
2
3 class Horse extends Mammal {
4	
5	public Horse(String name) {
6	}
7
8	public static void main(String[] args) {
9		new Horse("philippe");
10	}
11 }
12
13 class Mammal {
14
15	public Mammal(String name) {
16		System.out.println("Mammal");
17	}
18 }

 * What is the result :
 * A/ Mammal Horse
 * B/ compilation error at line 5
 * C/ compilation error at line 6
 * D/ compilation error at line 10
 * E/ compilation error at line 16
 */