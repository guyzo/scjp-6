package scjp.chapter.three.mekoue;

class MyClass
{
	public static void main(String[] args)
	{
		double d = 10.7;
		A aa = new A();
		aa.calc(d);
		System.out.println(d);
	}
}
class A
{
	public double d;
	public void calc(double d)
	{
		d = d - 1.0;
	}
}
/*
 *Qu'affiche ce code?
 * a)rien sa produit une erreur  
 * b)10.7
 * c)9.7
 * d)0.0
 */