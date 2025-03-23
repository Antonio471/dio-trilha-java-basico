import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da agência!");
        String agencia = sc.nextLine();

        System.out.println("Informe o nome do cliente.");
        String nomeCliente = sc.nextLine();


        System.out.println("Informe o saldo da conta.");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta!%n", nomeCliente); 
        System.out.printf("Sua agência é %s, conta %d e seu saldo %.2f já disponível para saque.%n", agencia, numero, saldo);

        sc.close();
    }
}
