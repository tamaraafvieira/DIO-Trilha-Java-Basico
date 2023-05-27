import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner dados = new Scanner(System.in);

        int numero;  //int nextInt()
        String agencia, nomeCliente; // String nextLine()
        double saldo; // double nextDouble()

        System.out.println("Por favor informe seu nome completo: ");
        nomeCliente = dados.nextLine();

        System.out.println("Por favor digite sua agencia com o digito: ");
        agencia = dados.nextLine();

        System.out.println("Por favor digite sua conta: ");
        numero = dados.nextInt();

        System.out.println("Por favor informe o saldo: ");
        saldo = dados.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência (5 digitos) é %s, conta (5 digitos) %05d e seu saldo %.2f já está disponível para saque%n", nomeCliente, agencia, numero, saldo);
    }
}
