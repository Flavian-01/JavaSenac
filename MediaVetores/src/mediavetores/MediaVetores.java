
package mediavetores;

import java.util.Scanner;


public class MediaVetores {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero [] = new int [5];
        float soma = 0 ;
        float media;
        
        
        System.out.println("Média de Vetores");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o "+ (i + 1) + "º numero inteiro:");
            numero [i] = input.nextInt();
            soma = soma + numero [i];
        }
        
        media = soma/5;
        
        System.out.println("resultado: "+media);
    }
    
}
