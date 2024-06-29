import javax.swing.JOptionPane;
//inicio da classe 
public class SomaDoisNum {
    public static void main(String[] args) {
        double primeiroValor, segundoValor, resultado;// variáveis

        //entrada 

        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor : "));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog(" Digite o segundo valor :"));

        //processamento
        resultado = primeiroValor + segundoValor;

        //saída
        JOptionPane.showMessageDialog(null," soma = " + resultado);
    }

}
