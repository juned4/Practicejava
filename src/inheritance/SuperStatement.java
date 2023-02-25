package inheritance;

class Account
{
	String name;
	String ifsc;
	long accno;
	double bal;
	
	public Account(String name,String ifsc,long accno)
	{
		this.name=name;
		this.ifsc=ifsc;
		this.accno=accno;
	}
	
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("name= "+name);
		System.out.println("ifsc= "+ifsc);
		System.out.println("accno= "+accno);
		System.out.println("balance is "+bal);
	}
	public void withdraw(double amt)
	{
		if(bal>amt)
		{
			bal=bal-amt;
			System.out.println("name= "+name);
			System.out.println("ifsc= "+ifsc);
			System.out.println("accno= "+accno);
			System.out.println("current balnce is "+bal);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
}
class Savings extends Account
{
	double roi=0.05;
	public Savings(String name,String ifsc,long accno)
	{
		super(name,ifsc,accno);
	}
	public void calaculateroi()
	{
		bal=bal+bal*roi;
		System.out.println(bal);
	}
	
}
class Current extends Account
{
	public Current(String name,String ifsc,long accno)
	{
		super(name,ifsc,accno);
	}
	double minbal=5000;
	public void showminbal()
	{
		System.out.println(minbal);
	}
}
public class SuperStatement {

	public static void main(String[] args) {
		Savings c1=new Savings("juned","KBL2515",94251558715l);
		c1.deposit(5000);
		c1.withdraw(6000);
		c1.calaculateroi();
		System.out.println("--------------------");
		Current c2=new Current("somu","KBL5484",4966588487l);
		c2.deposit(500000);
		c2.withdraw(40000);
		c2.showminbal();

	}

}
