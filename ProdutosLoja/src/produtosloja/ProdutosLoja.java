
package produtosloja;

import java.util.Scanner;


public class ProdutosLoja {

 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double compra;       
        int quantPrestacao = 5;
        double valorPrestacao ;
        
        System.out.println("Digite o valor da sua compra: ");
            compra = input.nextDouble();
            
        valorPrestacao = compra/ quantPrestacao;
        
        System.out.println("O valor da parcela é: "+quantPrestacao+"x de R$ "+ valorPrestacao+" Reais");
    }
    
}
