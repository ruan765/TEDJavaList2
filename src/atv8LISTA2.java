import java.util.Scanner;

public class atv8LISTA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] altura = new double[5];
        int[] idade = new int [5];

        for(int i = 0; i < 5; i++) {
            System.out.printf("Digite a idade da pessoa %d" , i+1);
            idade[i] = sc.nextInt();
            System.out.printf("Digite a altura da pessoa %d" , i+1);
            altura[i] = sc.nextDouble();
            

        }

        System.out.println("print na posição invertida");

        for(int i = 4; i >= 0; i--) {
            System.out.printf("Idade: %d %n" ,idade[i]);

            System.out.printf("Altura %.2f %n" , altura[i]);
        }
        sc.close();
    }
    
}
