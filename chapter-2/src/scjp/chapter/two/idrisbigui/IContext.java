package scjp.chapter.two.idrisbigui;
public interface IContext
{
	public double originX = 0;
}

public interface IShape extends IContext
{
	public double originX = 10;
}

public class Draw implements IShape
{

	public Draw()
	{
		double originX = this.originX;
	}
}


/*

Given the following interface & class declarations in their respective files, what is the value
of the local variable originX in the contsructor of class Draw ? 

a. 0.0
b. 10.0
c. Code will not compile, "this" reference in the constructor of class Draw is ambiguous.
d. Code will compile, but we'll get a runtime exception since the "this" reference in the constructor of class Draw is ambiguous.



*/