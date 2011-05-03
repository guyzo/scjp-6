package scjp.chapter.two.micheline;

class AA{
	static int y = 2;
	AA(int x) { this(); y*= 2; }
}
class BB extends AA {
	BB() { super(y); y += 3; }
	public static void main(String [] args) {
		new BB();
		System.out.println(y);
	}
}
//What is the result?