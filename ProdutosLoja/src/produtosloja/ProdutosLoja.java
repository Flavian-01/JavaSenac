
package produtosloja;

import java.util.Scanner;


public class ProdutosLoja {

 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //Declarando variáveis
        double compra;       
        int quantPrestacao = 5;
        double valorPrestacao ;
        
        //Mensagem mostrada para o usuário
        System.out.println("Digite o valor da sua compra: ");
            compra = input.nextDouble();  //irá ler o que o usuário digitar
        
        //Calculo para saber o valor da prestação
        valorPrestacao = compra/ quantPrestacao;
        
        //Mensagem final para o usuário mostrando o resultado
        System.out.println("O valor da parcela é: "+quantPrestacao+"x de R$ "+ valorPrestacao+" Reais");
    }
    
}
