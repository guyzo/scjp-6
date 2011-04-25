package scjp.chapter.two.idrisbigui;

public class Draw
{

	protected double originX, originY;

	public Draw(double originX, double originY)
	{
		this.originX = originX;
		this.originY = originY;
	}
}

public abstract class Render extends Draw{}


/*
1. Compiles fine.
2. Compiles fine but throws a ConstructorNotFoundException at runtime.
3. Compiler error, unable to find constructor Draw()
4. Compiles & runs fine.

*/
