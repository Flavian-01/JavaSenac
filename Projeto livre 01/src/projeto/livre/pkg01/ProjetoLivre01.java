
package projeto.livre.pkg01;

import java.util.Scanner;


public class ProjetoLivre01 {

    
    public static void main(String[] args) {
        //Declarando o imput (entrada)
        Scanner imput = new Scanner (System.in);
        
        //Declarando as variáveis
        double TipoCalculo;
        double n1, n2;
        
        //O que será mostrado para o usuário
        System.out.println("--Calculadora Simples--");
        
        System.out.println("");
        
        System.out.println("1 - Para Somar(+)");
        System.out.println("2 - Para Diminuir(-)");  //Opções para o usuário escolher
        System.out.println("3 - Para Dividir(/)");
        System.out.println("4 - Para Multiplicar(*)");
        
        System.out.println("Digite o numero da opção que você deseja: "); //Usuário irá digitar a opção que deseja
        TipoCalculo = imput.nextDouble();
        
        System.out.println("Digite o Primeiro numero: "); //Usuário irá digitar os numeros para cálculo
         n1 = imput.nextDouble();
                
        System.out.println("Digite o Segundo numero: ");
         n2 = imput.nextDouble();
         
       
        //Será realizado o calculo de acordo com a opção que o usuário escolheu
        if (TipoCalculo == 1)
        {
            TipoCalculo = n1 + n2;
            System.out.println("A soma entre "+n1+" e "+n2+" é: "+ TipoCalculo); //Irá mostra o resultado
        } 
        else if (TipoCalculo == 2)
        {
            TipoCalculo = n1 - n2;
            System.out.println("A subtração entre "+n1+" e "+n2+" é: "+ TipoCalculo); 
        }
        else if (TipoCalculo == 3)
        {
            TipoCalculo = n1 / n2;
            System.out.println("A divisão entre "+n1+" e "+n2+" é: "+ TipoCalculo);
        }
        else if (TipoCalculo == 4)
        {
            TipoCalculo = n1 * n2;
            System.out.println("A multiplicação entre "+n1+" e "+n2+" é: "+TipoCalculo);
        }
        else 
        {
            System.out.println("Opção Inválida!!!!");
        }
      
        
       
     
        
    }
    
}
