import java.util.Scanner;

public class atv7LISTA2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int soma = 0;
        int mult = 1;

        System.out.println("Digite 5 numeros:");
        

        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = sc.nextInt();
            soma += i;
            mult = mult * numbers[i];
            
            
        }

        System.out.println("Numeros:");

        for (int i = 0; i<5; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("SOMA DOS NUMEROS");
        System.out.println(soma);

        System.out.println("MULTIPLICAÇÃO DOS NUMEROS:");
        System.out.println(mult);

        


        sc.close();
    }
}
