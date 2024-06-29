import javax.swing.JOptionPane;
//exercicio 1 //////////////////////
public class Dolar {
    public static void main(String[] args) {
        //ler a cotação do dolar
        double cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog(" Digite a cotação do dolar : "));

        //ler a quantidade de dolar
        double quantidadeDolares = Double.parseDouble(JOptionPane.showInputDialog(" Digite a quantidade de dolares : "));

        //calcular o valor em reais 
        double valorEmReais = quantidadeDolares * cotacaoDolar ; 

        //mostrar o resultado
        JOptionPane.showMessageDialog(null, " O valor em reais é : R$" + valorEmReais) ;
    }

}
