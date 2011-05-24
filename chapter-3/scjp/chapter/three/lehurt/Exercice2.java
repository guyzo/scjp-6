package scjp.chapter.three.lehurt;

public class Exercice2 {

	static void go(int x) {
		System.out.println("int");
	}

	static void go(short x) {
		System.out.println("short");
	}

	static void go(float x) {
		System.out.println("float");
	}

	public static void main(String[] args) {
		byte b = 5;
		short s = 1;
		float f = 5.0f;
		double d = 20;

		go(b);
		go(s);
		go(f);
		go(d);

		// What's the result?
		// int int float float
		// Compilation error

	}
}
