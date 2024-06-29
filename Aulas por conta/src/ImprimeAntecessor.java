 import javax.swing.JOptionPane;
//exercício 4 /////////////////
public class ImprimeAntecessor {
    public static void main(String[] args) {
        // Ler o numero 
        int numero = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número: "));

        // Imprimir o antecessor 
        int antecessor = numero - 1;
        JOptionPane.showMessageDialog(null, " O antecessor é " + antecessor);
    }
}
