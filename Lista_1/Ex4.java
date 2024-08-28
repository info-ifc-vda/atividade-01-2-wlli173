package Lista_1;

import javax.swing.JOptionPane;

public class Ex4 {
    
    public static void main(String[] args) {
        
        int cod, qtd;
        double preco, precoTotal, desconto;

        cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça o código do produto comprado:"));
        qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "FOrnça a quantidade comprada do produto"));

        if (cod < 11) {
            preco = 10;
        }else if ( cod < 21) {
            preco = 15;
        }else if (cod < 31) {
            preco = 20;
        }else {
            preco = 40;
        }

        precoTotal = preco * qtd;

        if (precoTotal <= 250.00) {
            desconto = 0.05;
        }else if (precoTotal  <= 500.00) {
            desconto = 0.1;
        }else{
            desconto = 0.15;
        }

        desconto *= precoTotal;

        JOptionPane.showMessageDialog(null, "Preço do produto comprado: "+preco+
        "\nPreço total da nota: "+precoTotal+
        "\nValor do desconto: "+desconto+
        "\nValor final da nota: "+(precoTotal-desconto));

    }

}
