package scjp.chapter2.mehdiabbes;

public class A {
	
	protected void doSmth(String...strings){
		for(String string : strings){
			System.out.println(string);
		}
	}

}

class B extends A{
	private  void doSmth(String[] chaines) throws Exception{
		for(String chaine : chaines)
			System.out.println(chaine);
	}
	
	private void doSmth(String string){
		System.out.println(string);
	}
}

//cool ou pas cool this is the question !