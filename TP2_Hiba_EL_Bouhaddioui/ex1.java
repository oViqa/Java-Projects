public class ex1 {
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
		int somme = 0;

		System.out.println("Saisissez les elements du tableau :");
		for (int i = 0; i < n; i++) {
			System.out.print("Element " + (i + 1) + " : ");
			tableau[i] = scanner.nextInt();
			somme += tableau[i];
		}

		int min = tableau[0];
		int max = tableau[0];
		for (int i = 1; i < n; i++) {
			if (tableau[i] < min) {
				min = tableau[i];
			}
			if (tableau[i] > max) {
				max = tableau[i];
			}
		}

		double moyenne = (double) somme / n;
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);
		System.out.println("Somme : " + somme);
		System.out.println("Moyenne : " + moyenne);

		scanner.close();
	}
}
