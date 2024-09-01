import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o Nome do Cliente!");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o saldo da Conta!");
        float saldo = sc.nextFloat();

        System.out.println("Óla " + nome + ", obrigado por criar uma conta em nosso banco,"
            +"sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo 
            + "já está disponível para saque.");

        sc.close();
    }
}
