import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.printf("Por favor, digite o número da Conta!\n");
        numero = sc.nextInt();

        System.out.printf("Por favor, digite o número da Agência!\n");
        agencia = sc.next();
        
        sc.nextLine();

        System.out.printf("Por favor, digite o Nome do Cliente!\n");
        nomeCliente = sc.nextLine();
        
        System.out.printf("Por favor, digite o Saldo da Conta!\n");
        saldo = sc.nextDouble();        


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
                                  nomeCliente, agencia, numero, saldo);
                            
        sc.close();
    }
}