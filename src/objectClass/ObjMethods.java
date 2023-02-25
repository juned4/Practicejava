package objectClass;

public class ObjMethods 
{
	@Override
	public int hashCode()
	{
		return 10;
	}
	@Override
	public String toString()
	{
		return "to String is Overriden";
	}
//	@Override
//	public boolean equals(Object a)
//	{
//		return ;
//	}

	public static void main(String[] args) {
		ObjMethods m1=new ObjMethods();
		ObjMethods m2=new ObjMethods();
		
		System.out.println("------hashcode method------");
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println();
		System.out.println("------to string method------");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println();
		System.out.println("------equals method-------");
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m2));
		System.out.println(m2.equals(m1));
	}

}
