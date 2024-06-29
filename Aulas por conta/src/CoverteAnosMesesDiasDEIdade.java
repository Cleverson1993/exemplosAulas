import javax.swing.JOptionPane;
// exercicio 7 ///////////////////////////
public class CoverteAnosMesesDiasDEIdade {
    public static void main(String[] args) {
        int anos = Integer.parseInt(JOptionPane.showInputDialog(" Digite a idade em anos :"));

        int meses = Integer.parseInt(JOptionPane.showInputDialog(" Digite a idade em meses :"));

        int dias = Integer.parseInt(JOptionPane.showInputDialog(" Digite a idade em dias :"));

        int idadeTotalDias = anos * 365 + meses * 30 + dias;

        JOptionPane.showMessageDialog(null, " A idade total em dias é :" + idadeTotalDias);
    }



}
