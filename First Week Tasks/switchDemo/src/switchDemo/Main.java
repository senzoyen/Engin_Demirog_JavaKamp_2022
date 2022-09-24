package switchDemo;

public class Main {
	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Nice");
			break;
		case 'B':
			System.out.println("Not bad!");
			break;
		case 'C':
			System.out.println("Mehh");
			break;
		default:
			System.out.println("?????????!");
			break;
		}
	}
}
