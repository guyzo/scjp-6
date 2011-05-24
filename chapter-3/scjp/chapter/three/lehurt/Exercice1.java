package scjp.chapter.three.lehurt;

public class Exercice1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = 100;
		byte d = 0;

		byte[] myArray = { a, b, c };

		for (int i = 0; i < myArray.length; i++) {
			d = (d + (myArray[i] + a));
		}
		System.out.println(d);

		// What's the result?
		// d = 160
		// d = -96
		// Compilation error
	}
}
