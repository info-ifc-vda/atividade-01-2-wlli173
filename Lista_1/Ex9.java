package Lista_1;

import javax.swing.JOptionPane;

public class Ex9 {
    
    public static void main(String[] args) {
        
        int num;
        double raiz;
        boolean primo = true;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça um número"));

        raiz = (int)Math.sqrt(num);

        for (int i = 3; i <= raiz ; i+=2) {
            
            if ((num%i) == 0) {
                
                primo = false;
                break;

            }

        }

        if (primo) {
            JOptionPane.showInternalMessageDialog(null, num+" É um número primo");
        }else {
            JOptionPane.showInternalMessageDialog(null, num+" Não um número primo");
        }

    }

}
