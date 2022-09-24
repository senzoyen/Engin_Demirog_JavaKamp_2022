package numberProject1;

public class Main {

	public static void main(String[] args) 
	{
		int numberx = 220;
		int numbery = 284;
		int i = 1;
		int j = 1;
		int resx = 0;
		int resy = 0;
		
		while (i < numberx) 
		{
			while (j < numbery) 
			{
				if (numbery % j == 0)
					resy += j;
				j++;
			}
			if(numberx % i == 0) 
			{
				resx += i;
			}
			i++;
		}
		System.out.println(resx);
		System.out.println(resy);
		if (resx == numbery && resy == numberx)
			System.out.println(numberx + " ve " + numbery + " arkadaş sayılardır.");
		else 
		{
			System.out.println(numberx + " ve " + numbery + " arkadaş sayılar değildir.");
		}
	}

}
