import javax.swing.JOptionPane;
// exercício 11 /////////////////////////
public class ComissaoDeVendasDeCarros {
    public static void main(String[] args) {
        int carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog(" Digite o números de carros vendidos :"));

        double valorVendas = Double.parseDouble(JOptionPane.showInputDialog(" Digite o valor total das vendas :"));

        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog(" Digite o salário fixo do vendedor :"));

        double valorPorCarro = Double.parseDouble(JOptionPane.showInputDialog(" Digite o valor que o vendedor recebe por carro vendido :"));

        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarro) + (valorVendas * 0.05);

        JOptionPane.showMessageDialog(null, " O salário final do vendedor é : " + salarioFinal); 
    }

}
