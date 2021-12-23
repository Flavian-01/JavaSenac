
package nome;

import javax.swing.JOptionPane;


public class Nome {

  
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
       
       JOptionPane.showMessageDialog(null,"O seu nome é: "+ nome);
    }
    
}
