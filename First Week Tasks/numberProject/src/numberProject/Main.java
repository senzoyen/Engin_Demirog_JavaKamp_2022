package numberProject;

public class Main {

	public static void main(String[] args) 
	{
		int number = 10;
		int i = 1;
		int res = 0;
		
		while (i < number) 
		{
			if (number % i == 0) 
			{
				res += i;
			}
			i++;
		}
		System.out.println(res);
		if (number == res)
			System.out.println(number + " Mükemmel sayı!");
		else 
			System.out.println(number + " Mükemmel sayı değil.");
	}

}
