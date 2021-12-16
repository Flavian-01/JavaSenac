
package arrayteste;

import java.util.Scanner;


public class ArrayTeste {

    
    public static void main(String[] args) {
       int[] nota = new int [3];
       Scanner  input = new Scanner (System.in);
       
       //recebendo os números 
       for (int indice=0; indice < 3; indice++){
           System.out.println("\nEntre com o número " + (indice+1) + ":");
           nota [indice] = input.nextInt();
           
       }
       
       //exibindo os números 
       for (int indice = 0; indice < 3; indice++){
           System.out.printf("Número %d -> Valor armazenado:  %d\n", indice+1, nota[indice]);
       }
       
    }
    
}
