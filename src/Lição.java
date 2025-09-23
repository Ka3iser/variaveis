import java.util.Scanner;

public class Lição {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo(a)!");

        System.out.println("Para começar, digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu cpf:");
        String cpf = scanner.nextLine();

        System.out.println("Digite seu estado civil:");
        String estadoCivil = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso:");
        Double peso = scanner.nextDouble();

        scanner.close();
        System.out.println("Seus dados são:");
        System.out.println("nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("idade: " + idade);
        System.out.println("peso: " + peso);
        System.out.println("altura: " + altura);
        System.out.println("estado civil: " + estadoCivil);


    }
}
