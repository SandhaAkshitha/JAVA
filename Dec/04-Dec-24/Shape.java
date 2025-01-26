
package dec_o4_24;

class Shapes
{
	public Shapes()
	{
		
	}
	public void draw()
	{
		System.out.println("Shape Draw");
		}

	public void erase()
	{
		System.out.println("Shape erase");
	}
	
	public static Shapes randshape()
	{
		switch ((int) (Math.random()*3))
		{
		case 0: return new Circle();
		case 1: return new Square();
		case 2: return new Traiangle();
		default: 
			System.out.println("Default Shape");
			return new Shapes();
		}
		
    }

}
class Circle extends Shapes
{
	public Circle()
	{
		
	}

@Override
	public void draw() {
				System.out.println("Circle Draw");
}

	@Override
	public void erase() {
		System.out.println("Circle erase");
		}
}

class Traiangle extends Shapes
{
	public Traiangle()
	{
		
	}

@Override
	public void draw() {
				System.out.println("Traiangle Draw");
}

	@Override
	public void erase() {
		System.out.println("Traingle erase");
		}
}
class Square extends Shapes
{
	public Square()
	{
		
	}

@Override
	public void draw() {
				System.out.println("Square Draw");
}

	@Override
	public void erase() {
		System.out.println("Square erase");
		}
}


public class Shape {

	public static void main(String[] args)
	{
		for(int i=0;i<4;i++)
		{
			Shapes shape = Shapes.randshape();
			shape.draw();
			shape.erase();
			System.out.println();
		}
		
	}

}
