package vowelLetters;

public class Main {

	public static void main(String[] args) 
	{
		char letter = 'E';
		
		switch(letter) 
		{
			case 'A':
			case 'U':
			case 'I':
			case 'O':
				System.out.println("Kalın sesli harf.");
				break;
			case 'E':
			case 'İ':
			case 'Ü':
			case 'Ö':
				System.out.println("İnce sesli harf.");
				break;
			default:
				System.out.println("Sessiz harf.");
		}
	
	}

}
