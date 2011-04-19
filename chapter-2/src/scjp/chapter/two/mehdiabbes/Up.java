package scjp.chapter.two.mehdiabbes;

public class Up {                                       //quel sera le résultat :  
	public int a = 5;                                   //                         
	public void doSmth(){                               //-	classe mère            
		System.out.println("classe mère");              //  	a = 5              
	}                                                   //    classe fille         
                                                        //    a = 10               
}                                                       //                         
                                                        //    classe fille         
class Down extends Up{                                  //    a = 5                
	public int a = 10;                                  //                         
	public void doSmth(){                               //-	classe mère            
		System.out.println("classe fille");             //  	a = 5              
	}                                                   //    classe mère          
}                                                       //    a = 10               
                                                        //                         
class Test{                                             //    classe fille         
	public static void main(String[] args) {            //    a = 5                
		Up up = new Up();                               //                         
		Down down = new Down();                         //-	classe mère            
		Up upDown = new Down();                         //  	a = 5              
		Test test = new Test();                         //    classe fille         
		test.blabla(up);                                //    a = 10               
		System.out.println();                           //                         
		test.blabla(down);                              //    classe fille         
		System.out.println();                           //    a = 10               
		test.blabla(upDown);                            //                         
	}                                                   //- compile pas            
	
	
	void blabla(Up up){
		up.doSmth();
		System.out.println("a = " + up.a);
	}
	void blabla(Down down){
		down.doSmth();
		System.out.println("a = " + down.a);
	}
}













