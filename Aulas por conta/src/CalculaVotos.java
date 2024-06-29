import javax.swing.JOptionPane;
//exercício 8 ////////////////////////////
public class CalculaVotos {
    public static void main(String[] args) {
        int totalEleitores = Integer.parseInt(JOptionPane.showInputDialog( " Digite o número total de eleitores :"));

        int votosBrancos = Integer.parseInt(JOptionPane.showInputDialog( " Digite o número de votos brancos :"));

        int votosNulos = Integer.parseInt(JOptionPane.showInputDialog( " Digite o número de votos nulos :"));

        int votosValidos = Integer.parseInt(JOptionPane.showInputDialog( " Digite o número de votos válidos :"));

        double percentualBrancos = votosBrancos / totalEleitores * 100;

        double percentualNulos = votosNulos / totalEleitores * 100;

        double percentualValidos = votosValidos / totalEleitores * 100;

        JOptionPane.showMessageDialog(null, "percentual de votos brancos :" + percentualBrancos + "%\n" + 
        "percentual de votos nulos :" + percentualNulos+ "%\n" + "percentual de votos válidos : " + percentualValidos + "%" );
        
    }

}
