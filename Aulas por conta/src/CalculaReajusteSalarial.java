import javax.swing.JOptionPane;
// exercício 9 ////////////////////////////
public class CalculaReajusteSalarial {
    public static void main(String[] args) {
        double salrioAtual = Double.parseDouble(JOptionPane.showInputDialog(" Digite o salário atual:"));

        double percentualReajuste = Double.parseDouble(JOptionPane.showInputDialog(" Digite o percentual reajuste :"));

        double novoSalario = salrioAtual * (1 + percentualReajuste/ 100);

        JOptionPane.showMessageDialog(null, " O novo salário e : " + novoSalario);
    }

}
