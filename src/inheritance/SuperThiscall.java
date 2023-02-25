package inheritance;

class Practice
{
	public Practice()
	{
		System.out.println("1");
	}
	public Practice(int a)
	{
		this();
		System.out.println("2");
	}
	public Practice(double b)
	{
		this(4);
		System.out.println("3");
	}
	public Practice(int c, double d)
dddd		this(4.6);
		System.out.println("4");
	}
}
class Demo extends Practice
{
	public Demo()
	{
		super(5,8);
		System.out.println("5");
	}
	public Demo(int a)
	{
		this();
		System.out.println("6");
	}
	public Demo(double b)
	{
		this(3);
		System.out.println("7");
	}
	public Demo(int a,double b)
	{
		this(5.6);
		System.out.println("8");
	}
}
public class SuperThiscall {

	public static void main(String[] args) {
		new Demo(3,9.8);
		

	}

}
