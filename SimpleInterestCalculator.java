public class SimpleInterestCalculator
{
	public static void calculateSimpleInterest(double principle , double rate , double time)
	{
	 System.out.println("Simple Interest : "+(principle * rate * time)/100);
	}
	public static void main(String args[])
	{
	 calculateSimpleInterest(100.0,5.0,2.0);
	}
}