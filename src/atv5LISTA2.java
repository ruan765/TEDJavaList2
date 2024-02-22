import java.util.Scanner;

public class atv5LISTA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println();
        if(number1 < number2) {
            for(int i = number1 + 1; i < number2; i++) {
                System.out.println(i);
            }
        } else {
            for(int i = number2 + 1; i < number1; i++) {
                System.out.println(i);
            }

        }      


        sc.close();
    }
}
