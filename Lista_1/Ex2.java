package Lista_1;

import javax.swing.JOptionPane;

public class Ex2 {
    
    public static void main(String[] args) {
        
        float salario, qtdKlw, klw;

        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Forneça o valor do salário Mínimo:"));
        qtdKlw = Float.parseFloat(JOptionPane.showInputDialog("Forneça a quantide de QuiloWhatts consumidos:"));

        klw = (float) (salario*0.01);

        JOptionPane.showMessageDialog(null, "Valor do quilowatt: "+klw+"\nValor a ser pago: "+(qtdKlw*klw));

    }

}
