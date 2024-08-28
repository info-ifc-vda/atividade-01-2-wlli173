package Lista_1;

import javax.swing.JOptionPane;

public class Ex3 {
    
    public static void main(String[] args) {
        
        double a, b, c, La, Lb, Lc;
        String angulos = new String("");
        String lados = new String("");

        La = Double.parseDouble(JOptionPane.showInputDialog(null, "Forneca o comprimento do lado A do trângulo"));
        Lb = Double.parseDouble(JOptionPane.showInputDialog(null, "Forneca o comprimento do lado B do trângulo"));
        Lc = Double.parseDouble(JOptionPane.showInputDialog(null, "Forneca o comprimento do lado C do trângulo"));

        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Forneca o ângulo do lado A do trângulo"));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Forneca o ângulo do lado B do trângulo"));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Forneca o ângulo do lado C do trângulo"));

        if (a == 90 || b == 90 || c == 90) {
            angulos = "Retângulo";
        }else if (a > 90 || b > 90 || c > 90) {
            angulos = "Obtusângulo";
        }else if ( (a*3) == 180) {
            angulos = "Acutângulo";
        }

        if (a == b && a == c) {
            lados = "Equilatero";
        }else if ( a == b || a== c) {
            lados = "Isóceles";
        }else {
            lados = "Escaleno";
        }

        JOptionPane.showMessageDialog(null, "O triângulo fornecido é: \nQuanto aos lados: "+lados+" \nQuanto aos ângulos: "+angulos);

    }

}
