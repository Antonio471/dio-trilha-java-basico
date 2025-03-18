import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.println("Por favor, digite o número da conta!");
        sc.nextInt();

        System.out.println("Digite o número da agência!");
        sc.nextInt();

        System.out.println("Informe o nome do cliente.");
        sc.nextLine();

        System.out.println("Informe o saldo da conta.");
        sc.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta" 
        + "nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo" 
        + saldo + "já está disponível para saque.");

        sc.close();
    }
}
