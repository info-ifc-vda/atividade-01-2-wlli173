package Lista_1;

import javax.swing.JOptionPane;

public class Ex1 {
    
    public static void main(String[] args) {
        
        float horas, vlrHora, salarioBruto, imposto;

        horas = Float.parseFloat(JOptionPane.showInputDialog("Forneça a quantia de horas trabalhadas"));
        vlrHora = Float.parseFloat(JOptionPane.showInputDialog("Forneça o valor das horas trabalhadas"));

        salarioBruto = horas*vlrHora;
        imposto = (float) (salarioBruto*0.3);

        JOptionPane.showMessageDialog(null, "Salario Bruto: "+salarioBruto+"\nSalario Liquido: "+(salarioBruto-imposto)+"\nImposto cobrado: "+imposto);


    }

}
