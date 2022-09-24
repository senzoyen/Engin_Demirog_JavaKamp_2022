package stringsDemo;

public class Main 
{
	public static void main(String[] args)
	{
		String msg = "Bugün hava çok güzel";
		System.out.println(msg);
		
		System.out.println("Eleman sayısı : " + msg.length());
		System.out.println("5. eleman : " + msg.charAt(4));
		System.out.println(msg.replace('ü', 'u'));
		System.out.println(msg.concat(" !!"));
		System.out.println(msg.startsWith("B"));
		System.out.println(msg.endsWith("l"));
		char[] chars = new char[5];
		msg.getChars(0, 5, chars, 0);
		System.out.println(chars);
		System.out.println(msg.indexOf('a'));
		System.out.println(msg.lastIndexOf('a'));
		System.out.println(msg.substring(6 , 10));
		
		for (String word : msg.split(" ")) 
		{
			System.out.println(word);
		}
		System.out.println(msg.toLowerCase());
		System.out.println(msg.toUpperCase());
		
		/*
		 * int i = 1; if(msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z') { while (i <
		 * msg.length()) { String newMsg = msg.toUpperCase();
		 * System.out.println(newMsg); break; } i++; }
		 */
		System.out.println(msg.trim()); //boslukları atar 
	}
}
