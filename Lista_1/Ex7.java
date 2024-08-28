package Lista_1;

import javax.swing.JOptionPane;

public class Ex7 {
    
    public static void main(String[] args) {
        
        int inicio, fim;
        int fatorial = 1;

        inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o início do intervalo:"));
        fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o final do intervalo:"));

        for (int i = inicio; i <= fim; i++) {
            
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println(i+"!= "+fatorial);
            fatorial = 1;
        }

    }

}
