import java.util.Scanner;

public class atv9LISTA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] quadrado = new int [10];
        int soma = 0;
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            quadrado[i] = numbers[i] * numbers[i];
            soma += quadrado[i];

        }
        System.out.printf("A soma dos quadrados é igual %d" , soma);



        sc.close();
    }
    
}
