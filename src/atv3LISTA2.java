import java.util.Scanner;

public class atv3LISTA2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 numeros:");
        double soma = 0;
        
        for (int i = 0; i<5; i++ ) {
            double n = sc.nextInt();
            soma = soma + n;

        }
        double media = soma / 5;
        System.out.printf("A soma dos numeros digitados é %.2f e a media é %.2f", soma, media);
        sc.close();
    }
}
