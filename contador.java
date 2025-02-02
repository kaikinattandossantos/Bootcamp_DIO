import java.util.Scanner;

public class contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê as 3 transações e o valor mínimo
        System.out.print("Digite o valor da transação 1: ");
        double transacao1 = scanner.nextDouble();
        
        System.out.print("Digite o valor da transação 2: ");
        double transacao2 = scanner.nextDouble();
        
        System.out.print("Digite o valor da transação 3: ");
        double transacao3 = scanner.nextDouble();
        
        System.out.print("Digite o valor mínimo: ");
        double valorMinimo = scanner.nextDouble();

        // Armazena as transações em um array
        double[] transacoes = {transacao1, transacao2, transacao3};

        // Conta quantas transações são maiores que o valor mínimo
        int contador = 0;
        for (double transacao : transacoes) {
            if (transacao > valorMinimo) {
                contador++;
            }
        }

        // Exibe o resultado
        System.out.println("Número de transações maiores que o valor mínimo: " + contador);

        scanner.close();
    }
}