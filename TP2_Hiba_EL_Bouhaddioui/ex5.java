import java.util.Scanner;

public class ex5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrer une chaine :");
        String t = sc.nextLine();
        
        System.out.print("Entrer le char a :");
        char a = sc.next().charAt(0);

        System.out.print("Entrer le char b :");
        char b = sc.next().charAt(0);

        t = t.replace(a,b);

        System.out.println("Chaine modifiee : " + t);
    }
}
