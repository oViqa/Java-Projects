import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrez la taille du tableau : ");
		int n = scanner.nextInt();
		int[] tableau = new int[n];

		System.out.println("Entrez les éléments du tableau :");
		for (int i = 0; i < n; i++) {
			tableau[i] = scanner.nextInt();
		}

		boolean symetrique = true;
		for (int i = 0; i < n / 2; i++) {
			if (tableau[i] != tableau[n - 1 - i]) {
				symetrique = false;
				break;
			}
		}
		if (symetrique) {
			System.out.println("Le tableau est symétrique.");
		} else {
			System.out.println("Le tableau n'est pas symétrique.");
		}

		scanner.close();
	}
}
