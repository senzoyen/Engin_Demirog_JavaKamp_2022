package miniProjectPrimeNumber;

public class Main
{
	public static void main(String[] args)
	{
		int number = 0;
		boolean isPrime = true;
		int i = 2;

		if(number == 1 || number == 0)
		{
			System.out.println(number + " Asal değildir.");
			return;
		}

		if(number < 1) 
		{
			System.out.println(number + " geçersiz sayı");
			return;
		}

		while (i < number)
		{
			if (number % i == 0)
			{
				isPrime = false;
				break;
			}
			i++;
		}

		if(isPrime)
			System.out.println(number + " Asal sayıdır.");
		else
			System.out.println(number + " Asal değildir.");
	}
}
