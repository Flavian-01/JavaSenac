
package exemplovetor;

import java.util.Scanner;




public class ExemploVetor {

   
    public static void main(String[] args) {
       Scanner imput = new Scanner (System.in);
       Scanner entrada = new Scanner (System.in);
       String[] nomes;
       nomes = new String[5];
       double[] notas = new double [5];
       double soma = 0, media;
      
       for (int i = 0; i <= 4 ; i++){
           System.out.println("Entre com o nome do aluno nº "+ (i+1));
           nomes[i] = entrada.nextLine();
           System.out.println("Entre com a nota do aluno nº "+ (i+1));
           notas [i] = imput.nextDouble();
           soma = soma + notas [i];
       }
       
       media = soma / 5;
        System.out.println("A média dos alunos é: "+ media);
        System.out.println();
        System.out.println("Lista dos alunos cuja nota é superior a media da turma");
        
        for (int i = 0; i <= 4; i++) {
            if (notas [i] > media)
                System.out.println(nomes[i]);
        }
       
    }
    
}
