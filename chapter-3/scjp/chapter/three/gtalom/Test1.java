package scjp.chapter.three.gtalom;

public class Test1 {

	private int  i;
	private  Integer[] tab;
	private int  somme;

	public static void main(String[] args) {
		int size=5; 
		new Test1().go(size);							//line 1
	}

	public void go(Integer size){				
	 int compteur=0;
		tab=new Integer[new Integer(size)];				//line 2		
		for(i=0;i<tab.length;i++){
			somme++;									//line 3
			compteur=tab[i]++;							//line 4
			
		}
		System.out.println("somme =" + somme ); 		//line 5
		System.out.println("compteur =" + compteur ); 	//line 6
	}
}

/***
 * ce programme compile  ? 
 * sinon � quel ligne se trouve l'erreur
 * si oui quel sera l'affichage � l'�cran
 * 
 * **/
