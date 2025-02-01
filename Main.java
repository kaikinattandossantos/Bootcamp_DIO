import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Lê o valor total e o número de parcelas
        double valorTotal = scanner.nextDouble();
        int numeroParcelas = scanner.nextInt();
        
        // TODO: Crie a lógica para verificar se o parcelamento é possível:
        // A condição deve garantir que o valor de cada parcela seja maior ou igual a 1.
        
        // Calcula o valor da parcela
        double valorParcela = valorTotal / numeroParcelas;
        
        // Verifica se o parcelamento é possível
        if (valorParcela >= 1) {
            System.out.println("Parcela: " + valorParcela); // Exibe o valor da parcela
        } else {
            System.out.println("Parcelamento nao e possivel");
        }

        scanner.close();
    }
}