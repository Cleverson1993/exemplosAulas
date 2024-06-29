import javax.swing.JOptionPane;
// exercício 10 /////////////////////
public class CalculaImpostoDeCarro {
    public static void main(String[] args) {
        double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog(" Digite o custo de fábrica do carro :"));

        double custoFinal = custoFabrica + custoFabrica * 0.28 + custoFabrica * 0.45;

        JOptionPane.showMessageDialog(null, " O custo final do carro ao consumidor é : " + custoFinal);

    }

}
