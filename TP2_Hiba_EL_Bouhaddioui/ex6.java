import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Saisissez une phrase : ");
		String phrase = scanner.nextLine().trim();

		int nombreDeMots = phrase.isEmpty() ? 0 : phrase.split("\\s+").length;
		System.out.println("Nombre de mots : " + nombreDeMots);

		scanner.close();
	}
}
