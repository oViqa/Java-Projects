import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Saisissez une chaîne : ");
		String t = scanner.nextLine();

		if (!t.isEmpty()) {
			t = t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase();
		}

		System.out.println(t);
		scanner.close();
	}
}
