import javax.swing.JOptionPane;
public class Comissao {
//exercicio 3     ///////////////////////////////////
    public static void main(String[] args) {
        //ler o preço unitário das peças e a quantidade de peças vendidas
        double precoUnit = Double.parseDouble(JOptionPane.showInputDialog(" Digite o preço unitário :"));
        double quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog(" Digite a quantidade vendida:"));

        //calcula a comissão, calculando 5% do total de vendas
        //Assim como na matemática, os calculos escritosentre parenteses serão realizados primeiro
        double comissao = (precoUnit*quantidadeVendida) * 0.05;

        //imprime a comissao do vendedor 
        JOptionPane.showMessageDialog(null," A comissão do vendedor foi de " + comissao);

    }


}
