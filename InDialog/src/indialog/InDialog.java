
package indialog;

import javax.swing.JOptionPane;


public class InDialog {

   
    public static void main(String[] args) {
        Object [] options = {"OK", "CANCELAR"};
        JOptionPane.showOptionDialog(null,"Clique OK para continuar ", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
    }
    
}
