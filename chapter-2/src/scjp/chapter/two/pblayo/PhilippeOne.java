package scjp.chapter.two.pblayo;

public class PhilippeOne {

	short methodOne() {
		int result = 0;
		return result;  // line 7
	}

	int methodTwo() {
		short result = 0;
		return result;  // line 12
	}

	public static void main(String[] args) {
		PhilippeOne instance = new PhilippeOne();
		System.out.println(instance.methodOne());  // line 17
		System.out.println(instance.methodTwo());  // line 18
	}
}

/* What is the result :
 * A/ 00
 * B/ compilation error at line 7
 * C/ compilation error at line 12
 * D/ compilation error at line 17
 * E/ compilation error at line 18
 */