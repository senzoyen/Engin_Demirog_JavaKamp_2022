package recapDemo1;

public class Main 
{

	public static void main(String[] args)
	{
		 int numb1 = 20;
	     int numb2 = 15;
	     int numb3 = 30;

	     String text= "En büyük sayı: ";

	     if (numb1 > numb2 && numb1 > numb3){
	            System.out.println(text + numb1);
	        } else if (numb2 > numb1 && numb2 > numb3) {
	            System.out.println(text + numb2);
	        } else {
	            System.out.println(text + numb3);
	        }

	}
}
