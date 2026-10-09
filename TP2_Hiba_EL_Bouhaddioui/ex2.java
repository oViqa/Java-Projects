public class ex2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Entrez le nombre d'elements du tableau (N) : ");
		int n = scanner.nextInt();
		if (n <= 0) {
			System.out.println("N doit etre strictement positif.");
			scanner.close();
			return;
		}

		int[] tableau = new int[n];
		System.out.println("Saisissez les elements du tableau :");
		for (int i = 0; i < n; i++) {
			tableau[i] = scanner.nextInt();
		}

		for (int i = 0; i < tableau.length; i++) {
			boolean dejaAffiche = false;

			for (int j = 0; j < i; j++) {
				if (tableau[i] == tableau[j]) {
					dejaAffiche = true;
					break;
				}
			}

			if (!dejaAffiche) {
				int repetitions = 0;
				for (int element : tableau) {
					if (element == tableau[i]) {
						repetitions++;
					}
				}
				System.out.println(tableau[i] + " se répète " + repetitions + " fois.");
			}
		}

		scanner.close();
	}
}
