import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira os dados abaixo!");

        System.out.print("Nome do cliente: ");
        String clientName = sc.nextLine();

        System.out.print("Agência da conta: ");
        String bankAgency = sc.next();

        System.out.print("Número da conta: ");
        int accountNumber = sc.nextInt();

        System.out.print("Saldo: ");
        double accountBalance = sc.nextDouble();

        System.out.println("Olá "
                + clientName
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + bankAgency
                + ", conta "
                + accountNumber
                + " e seu saldo "
                + String.format("%.2f", accountBalance)
                + " já está disponível para saque.");

        sc.close();
    }
}
