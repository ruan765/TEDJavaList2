import java.util.Scanner;

public class atv2LISTA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;

        int[] numbers = new int[5];

        for(int i = 0; i<numbers.length; i++) {
            System.out.printf("numero %d:" , i+1);
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i<numbers.length; i++) {
            if (maior < numbers[i]) {
                maior = numbers[i];
                
            }
        }
        System.out.println("O maior numero é " + maior);
        System.out.println("fskjfas");

        sc.close();
    }
    
}
