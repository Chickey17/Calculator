package Calculator;

public class Verifier 
{
	public static void nonZeroDivision(double number2) throws MyArithmeticException
	{
		if(number2==0) 
		{
			throw new MyArithmeticException("Cant divide by zero");
		}
	}
}
