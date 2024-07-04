
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia; 
        String nomeCliente;
        double saldo;

        System.out.println(" ----------CONTA BANCARIA---------");
        System.out.println();
        System.out.println("Por favor, digite o número da Conta: (1234)");
        numero = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Agora digite o número da Agência: (123-8)");
        agencia = sc.nextLine();

        System.out.println("Me informe seu nome: ");
        nomeCliente = sc.nextLine(); 

        System.out.println("Por gentileza, informar seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf ("Olá %s, obrigado por criar uma conta em "
               + "nosso banco, sua agência é %s, "
               + "conta %d e seu saldo %.2f já está disponível "
               + "para saque.", nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}
