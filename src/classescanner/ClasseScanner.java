
package classescanner;

import java.util.Scanner;

public class ClasseScanner {

  
    public static void main(String[] args) {
      float numero;
      // declaração da classe scanner, com criação do objeto "entrada"
      float numero2;
    
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Digite um número: ");
      numero = entrada.nextFloat();
      System.out.println("Digite outro número: ");
      numero2 = entrada.nextFloat();
      
        float soma = numero + numero2; 
        System.out.println("A soma entre os numeros digitados  foi: " + soma );
    
    }
    
}
