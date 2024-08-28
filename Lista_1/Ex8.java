package Lista_1;

import javax.swing.JOptionPane;

public class Ex8 {
    
    public static void main(String[] args) {

        // Obtém o valor da compra e o valor do pagamento
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor da compra?"));
        float pagamento = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor do seu pagamento?"));

        // Define as cédulas disponíveis
        int cedulas[] = {100, 50, 20, 10, 5, 2, 1};

        if (pagamento >= valor) {
            
            float troco = pagamento - valor; 

            // Exibe o troco e as cédulas que compõem o troco
            System.out.println("Seu troco sera: R$" + String.format("%.2f", troco) + " e é composto por:");

            for (int cedula : cedulas) {
                int quantidadeCedulas = (int) (troco / cedula);
                if (quantidadeCedulas > 0) {
                    System.out.println(quantidadeCedulas + " cedula(s) de R$" + cedula);
                    troco = troco % cedula;
                }
            }

        }
    }
}
