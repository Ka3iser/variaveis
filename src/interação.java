import java.util.Scanner;

public class interação {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        idade *= 2;

        System.out.println("Agora digite sua altura: ");
        double altura = scanner.nextDouble();

        scanner.close();

        System.out.println("seja bem vindo " + nome);
        System.out.println("O dobro da sua idade é: " + idade);
        System.out.println("A sua altura é: " + altura);

    }
}
