package Lista_1;

import javax.swing.JOptionPane;

public class Ex6 {
    
    public static void main(String[] args) {
        
        int num;
        int fatorial = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Fornça um número para calcular o fatorial"));

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, num+"!= "+fatorial);

    }

}
