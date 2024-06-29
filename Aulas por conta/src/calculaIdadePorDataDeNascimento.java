import javax.swing.JOptionPane;
public class calculaIdadePorDataDeNascimento {
    public static void main(String[] args) {
        int dataNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de nascimento :"));
        int anoAtual = 2024;
        int idade;
        idade = anoAtual - dataNascimento;
        JOptionPane.showMessageDialog(null, "A idade é : " + idade);
    }

}
