import javax.swing.JOptionPane;
// exercício 5 ////////////////////
public class CalcularAreaRetangulo {
    public static void main(String[] args) {
        // Ler a base e a altura
        double base = Double.parseDouble(JOptionPane.showInputDialog(" digite a base: "));

        double altura = Double.parseDouble(JOptionPane.showInputDialog(" Digite a altura: "));

        // Calcular a área (área = base + altura)
        double area = base * altura;

        // Imprimir o resultado
        JOptionPane.showMessageDialog(null, " A área do retangulo é " + area);
    }

}
