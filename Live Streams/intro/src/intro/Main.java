package intro;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		//java'da camelCase tanımlanır.
		String middleText = "İlginizi çekebilir.";
		String lowerText = "Vade süresi.";
		
		System.out.println(middleText);
		System.out.println(lowerText);
		
		int	a = 15;
		System.out.println(a);
		
		double usdYesterday = 18.15;
		double usdToday = 18.15;
		
		boolean isUsdUp;
		
		String arrowDir;
		
		if (usdYesterday > usdToday) //true
		{
			arrowDir = "down.svg";
			isUsdUp = false;
			System.out.println(arrowDir);
		}
		else if (usdYesterday == usdToday) 
		{
			arrowDir = "equal.svg";
			System.out.println(arrowDir);
		}
		else 
		{
			arrowDir = "up.svg";
			isUsdUp = true;
			System.out.println(arrowDir);
		}
		
		//array && for && while
		
		String[] credit = {"Kredi x", "Kredi y", "Kredi z"};
		
		for (int i = 0; i < credit.length; i++) 
		{
			System.out.println(credit[i]);
		}
		
		int x;
		
		x = 0;
		
		while (x < credit.length) 
		{
			System.out.println(credit[x]);
			x++;
		}	
	}
}
