
package salariovendedor;

import java.util.Scanner;


public class SalarioVendedor {

   
    public static void main(String[] args) {
        //classe SCANNER que permite a interação do usuário.
        Scanner input = new Scanner (System.in);
        
        //declaração das classes.
        String nomeVendedor;
        double salarioFixo; //salrio fixo do vendedor.
        double vendas; // vendas efetuadas pelo vendedor.
        double comissao ; //referente a comissão que o vendedor receberá em cima das vendas( nessa caso 15% ).
        double salarioFinal; //salario final = salario fixo + comisão.
    
        System.out.println("Digite o seu nome: ");
        nomeVendedor = input.nextLine();
        /*
        teste de mesa
        System.out.println(nomeVendedor +" <- irá aparecer o nome que foi digitado acima");
        */
        
        System.out.println("Digite o salário fixo do vendedor: ");
        salarioFixo = input.nextDouble();
        
        System.out.println("Digite o valor de vendas realizadas: ");
        vendas = input.nextDouble();
        
        System.out.println("Digite a comissão: ");
        comissao = input.nextDouble();
        
        //resolver a variavel comissão 
        comissao = (vendas * comissao) / 100;
        
        //estipular algum valor variavel salarioFinal.
        
        salarioFinal = comissao + salarioFixo;
        
        System.out.println("---------------------");
        System.out.println("Nome do Vendedor: "+ nomeVendedor);
        System.out.println("Salário Fixo: "+ salarioFixo);
        System.out.println("Comissão: "+ comissao);
        System.out.println("Salário Final: "+ salarioFinal);
}
    
}
