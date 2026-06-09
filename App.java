import java.util.Scanner;

public class App {
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US); //isso forca o iscan a usar " ." como separador.
        
        System.out.println("Seu nome Completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Olá, " + nomeCompleto + "!");


        System.out.print("Qual sua Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Você tem " + idade + " anos.");


        System.out.print("Qual sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Sua altura é " + altura + " metros.");

        System.out.print("Qual seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Seu peso é " + peso + " kg.");

        System.out.print("Qual seu sexo: ");
        String sexo = scanner.next();
        System.out.println("Seu Sexo é " + sexo + ".");

        System.out.print("Qual seu Estado Civil: ");
        String estadoCivil = scanner.next();
        System.out.println("Seu Estado Civil é " + estadoCivil + ".");

        System.out.print("Qual sua cidade: ");
        String cidade = scanner.next();
        System.out.println("Você mora em " + cidade + ".");

        System.out.print("Qual seu profissão: ");
        String profissao = scanner.next();
        System.out.println("Sua profissão é " + profissao + ".");

        scanner.close();


        
    }
}