package inheritance;

class Home
{
	
		public void payment1()
		{
			System.out.println("card payment");
		}
		public void payment2()
		{
			System.out.println("Net Banking");
		}
		public void payment3()
		{
			System.out.println("upi payment");
		}
		
	
}
class Theaters extends Home
{
	public void theater1()
	{
		System.out.println("cinepolis-orion East Mall");
	}
	public void theater2()
	{
		System.out.println("VR Cinemas Mallathalli ");
	}
	public void theater3()
	{
		System.out.println("Venkateshwara A/c digital cinemas K.R.Puram");
	}
}
class Kannada extends Theaters
{
	public void movie1()
	{
		System.out.println("Avatar");
	}
	public void movie2()
	{
		System.out.println("Vedha");
	}
	public void movie3()
	{
		System.out.println("Kantara");
	}
}
class Hindi extends Theaters
{
	public void movie1()
	{
		System.out.println("Atamaraksha");
	}
	public void movie2()
	{
		System.out.println("Drishyam 2");
	}
}
class Tamil extends Theaters
{
	public void movie1()
	{
		System.out.println("Laththi");
	}
	public void movie2()
	{
		System.out.println("connect");
	}
}
class Streams extends Home
{
	public void musicshow()
	{
		System.out.println("Musicshow");
	}
	public void comedyshow()
	{
		System.out.println("Comedyshow");
	}
}
class Concerts extends Streams
{
	public void concert1()
	{
		System.out.println("White party feat");
	}
	public void concert2()
	{
		System.out.println("Sunburn Goa 2022");
	}
	public void concert3()
	{
		System.out.println("Excuse Me Brother-Standup Comedy");
	}
	public void concert4()
	{
		System.out.println("Glen's Bakehouse Christmas Show");
	}
}
class Adventures extends Home
{
	public void adventure1()
	{
		System.out.println("wonderlaw ");
	}
	public void adventure2()
	{
		System.out.println("My hikes-Gokarna beach trek ");
	}
	
}

public class BookMyShow {

	public static void main(String[] args) {
		Kannada p1=new Kannada();
		p1.movie3();
		p1.theater2();
		p1.payment3();
		System.out.println("----------------------");
		Hindi p2=new Hindi();
		p2.movie1();
		p2.theater1();
		p2.payment1();
		System.out.println("----------------------");
		Tamil p3=new Tamil();
		p3.movie2();
		p3.theater3();
		p3.payment2();
		System.out.println("-----------------------");
		Concerts p4=new Concerts();
		p4.concert1();
		p4.payment1();
		System.out.println("-----------------------");
		Adventures p5=new Adventures();
		p5.adventure1();
		p5.payment3();

	}

}
