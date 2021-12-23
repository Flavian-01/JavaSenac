
package somajoption;

import javax.swing.JOptionPane;


public class SomaJOption {

    
    public static void main(String[] args) {
        int x, y;
        String n1, n2;
        int resultado;
        
    //Abrindo a Janeja para a entrada de Strings
        n1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
    
        n2 = JOptionPane.showInputDialog ("Digite o segundo numero: ");
    
    //Passando o conteúdo de n1 e n2 para inteiro e executando a soma

        resultado = Integer.parseInt (n1) + Integer.parseInt(n2);
        
        
    //Abrindo a janela de saída de dados (String entre parênteses e usado + para concatenar)

        JOptionPane.showMessageDialog(null,"A soma é "+ resultado);
    
    }
    
}
