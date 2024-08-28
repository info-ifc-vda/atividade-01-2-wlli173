package Lista_1;

import javax.swing.JOptionPane;

public class Ex10 {

    public static void main(String[] args) {

        int num;
        int qtd = 10;

        for (int index = 0; index < 10; index++) {

            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça um número"));
            
            // Considera-se que números menores que 2 não são primos
            if (num < 2) {
                qtd--;
                continue;
            }

            boolean primo = true;
            double raiz = Math.sqrt(num);

            if (num % 2 == 0 && num != 2) {
                primo = false; 
            } else {
                for (int i = 3; i <= raiz; i += 2) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (!primo) {
                qtd--;
            }
        }

        JOptionPane.showMessageDialog(null, "Dos 10 números fornecidos, " + qtd + " eram números primos");
    }
}
