
package conversaodolarreal;

import java.util.Scanner;


public class ConversaoDolarReal {

 
    public static void main(String[] args) {
      Scanner  input = new Scanner (System.in);
      
      //Declarando as variáveis
      String nome;
      double cotDolar, quantDolar;
      double conversao;
      
        //O que será mostrado para o usuário
        System.out.println("Olá digite seu nome: ");
          nome = input.nextLine();     //Irá ler o que o usuário digitar
          
        System.out.println(nome+", quantos Dólares você tem: ");
          quantDolar = input.nextDouble();
          
        System.out.println("Digite a cotação do Dólar atualmente em Real : ");
          cotDolar = input.nextDouble();
          
        //convertendo dólar para real
        conversao = quantDolar * cotDolar;
        
        //Mensagem com o resultado final para o usuário
        System.out.println(nome+", Em você tem: "+"R$ "+ conversao+"Reais");
        
          
    }
    
}
