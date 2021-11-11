
package exemplodowhile;

import java.util.Scanner;


public class ExemploDoWhile {

   
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        
        int opcao = 0;
        
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - iniciar Jogo");
            System.out.println("2 - Ajuda");
            System.out.println("3 - Sair");
            System.out.println("OPÇÃO: ");
            opcao = imput.nextInt();
            
        }while (opcao != 3);
        System.out.println("Programa Finalizado!");
        
    }
    
}
