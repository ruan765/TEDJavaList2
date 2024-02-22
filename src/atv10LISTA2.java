import java.util.Scanner;

public class atv10LISTA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int [] vetFinal = new int[20];
        System.out.println("Digite os numeros que ficarão no vetor 1");
        for (int i = 0; i < 10; i ++) {
        
        vet1[i] = sc.nextInt();
        }
        System.out.println("Digite os numeros que ficarão no vetor 2");
        for (int i = 0; i < 10; i ++) {
            
            vet2[i] = sc.nextInt();
            }
        
        //PREECHENDO VETOR 3
        int posFinal = 0;
        for(int h = 0; h< 10; h++) {
            
            vetFinal[posFinal] = vet1[h];
            posFinal++;
            vetFinal[posFinal] = vet2[h];
            posFinal++;
        }

        for (int i = 0; i < vetFinal.length; i++) {
            System.out.println(vetFinal[i]);
        }

    }
}