
package frutas;

import javax.swing.JOptionPane;


public class Frutas {

 
    public static void main(String[] args) {
       Object [] itens = {"MAÇÂ", "PERA", "BANANA"};
       
       Object SelectedValue = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]);//
       
       JOptionPane.showMessageDialog(null,"Você escolheu: "+ SelectedValue);
    }
    
}
