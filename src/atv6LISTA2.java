import java.util.Scanner;

import entities.alunoEx6;

public class atv6LISTA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        alunoEx6[] alunos = new alunoEx6[10];
        double[] aprovados = new double[10];
        int nAprovados = 0;
        
        System.out.println("Digite os dados dos alunos:");
        for(int i = 1; i<=alunos.length;i++) {
            System.out.printf("Digite o nome do aluno %d" , i);
            String nome = sc.nextLine();
            System.out.println("Digite a nota 1");
            double n1 = sc.nextDouble();
            System.out.println("Digite a nota 2");
            double n2 = sc.nextDouble();
            System.out.println("Digite a nota 3");
            double n3 = sc.nextDouble();
            System.out.println("Digite a nota 4");
            double n4 = sc.nextDouble();
            Double media = (n1 + n2 + n3 + n4) / 4;
            

            alunoEx6 aluno = new alunoEx6(nome,n1,n2,n3,n4, media);

            if (aluno.getMedia() >= 7) {
                for (int j = 0; j<=alunos.length; j++) {
                    aprovados[i] = aluno.getMedia();
                }
                nAprovados += 1;
                
            }
            sc.nextLine();
        }

        System.out.printf("O numero de aluno com media maior ou igual 7 é %d" , nAprovados);

        

        

        

        sc.close();
    }
    
}
