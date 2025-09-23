import java.util.Scanner;

public class entrada {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        System.out.println(n);

        String a = scanner.nextLine();

        scanner.close();

        System.out.println(a);

    }
}
