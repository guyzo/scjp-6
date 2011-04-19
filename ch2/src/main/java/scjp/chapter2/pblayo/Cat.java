package scjp.chapter2.pblayo;

public class Cat extends Animal {
	
	public Cat(String name) {
		System.out.println("Cat");
	}

	public static void main(String[] args) {
		new Cat("philippe");
	}
}

class Animal {

	public Animal() {
		System.out.println("Animal");
	}
}

/*
1 package scjp.chapter.two.pblayo;
2
3 class Cat extends Animal {
4	
5	public Cat(String name) {
6 }
7
8	 public static void main(String[] args) {
9		new Cat("philippe");
10	 }
11 }
12
13 class Animal {
14
15	public Animal() {
16		System.out.println("Animal");
17	}
18 }

 * What is the result :
 * A/ Animal Cat
 * B/ compilation error at line 5
 * C/ compilation error at line 6
 * D/ compilation error at line 10
 * E/ compilation error at line 16
 */