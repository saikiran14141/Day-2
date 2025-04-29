public class Calculator
{
  public static void addition(int a , int b)
{
  System.out.println("addition of two numbers "+(a+b));
}
	public static void subtraction(int a , int b)
	{
	 System.out.println("subtraction of two numbers "+(a-b));
	}
		public static void multiplication(int a , int b)
		{
		 System.out.println("multiplication of two numbers "+(a*b));
		}
			public static void division(float a , float b)
			{
			 System.out.println("division of two numbers "+(a/b));
			}
				public static void Mod(int a , int b)
				{
				 System.out.println("Mod of two numbers "+(a%b));
				}



public static void main(String [] args)
  {
	addition(10,10);
	subtraction(20,10);
	multiplication(10,5);
	division(20,2);
	Mod(100,3);
  }
}
