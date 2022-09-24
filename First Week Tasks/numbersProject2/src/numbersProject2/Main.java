package numbersProject2;

public class Main 
{
	public static void main(String[] args)
	{
		int[] numbers = new int[] {1, 2, 5, 7, 9};
		int toFind = 3;
		boolean ok = false;
		
		for (int number : numbers) 
		{
			if(number == toFind)
			{
				ok = true;
				break;
			}
		}
		if (ok)
			System.out.println("Sayı mevcut.");
		else
			System.out.println("Sayı mevcut değil.");
	}
}
