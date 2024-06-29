import javax.swing.JOptionPane;
// exer´cicio 6 ///////////////////////
public class ConverteAnosEmDias {
    public static void main(String[] args) {
        int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog(" Digite a idade em anos : "));

        //Calcula os anos e transforma em dias 
        int idadeDias = idadeAnos * 365;
        
        //saída
        JOptionPane.showMessageDialog(null, " A idade em dias é :" + idadeDias);
    }

}
