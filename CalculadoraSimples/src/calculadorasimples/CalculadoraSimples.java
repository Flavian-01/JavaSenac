
package calculadorasimples;

import java.util.Scanner;


public class CalculadoraSimples {


    public static void main(String[] args) {
        //Declarando variáveis.
        double n1, n2;
        double soma, subt, mult, divi;

        //Biblioteca que irá permitir a interação do usuário.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--CALCULADORA SIMPLES--");
        System.out.println("Digite um número: ");
        n1 = entrada.nextDouble();
         System.out.println("Digite outro número: ");
        n2 = entrada.nextDouble();
        
        //Especificar o que cada variável faz
        soma = n1 + n2;
        subt = n1 - n2;
        mult = n1 * n2;
        divi = n1 * n2;
        
        // imprimir (mostrar) na tela os resultados
        System.out.println("A soma entre " + n1 +  " e " + n2 + " é :" + soma);
        System.out.println("A Subtração entre " + n1 +  " e " + n2 + " é :" + subt);
        System.out.println("A multiplicação entre " + n1 +  " e " + n2 + " é :" + mult);
        System.out.println("A Divisão entre " + n1 +  " e " + n2 + " é :" + divi);
    }
    
}
