
package quadrado;

import java.util.Scanner;


public class Quadrado {

    public static int quadrado (int num){
        int quadrado;
        quadrado = num * num;
        return quadrado;
    }
    public static void main(String[] args) {
     int numero, numero_quadrado;
     Scanner input = new Scanner (System.in);
     
        System.out.println("Entre com um inteiro: ");
        numero = input.nextInt();
        numero_quadrado=quadrado(numero);
        
        System.out.printf("%d elevado ao quadrado é %d \n", numero, numero_quadrado);
    }
    
}
