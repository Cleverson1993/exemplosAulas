import javax.swing.JOptionPane;
//exercicio 2 //////////////////////
public class SomarQuadrados {
    public static void main(String[] args) {
        //ler os quatro números
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(" Digite o numero 1 :"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(" Digite o numero 2 :"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog(" Digite o numero 3 :"));
        double numero4 = Double.parseDouble(JOptionPane.showInputDialog(" Digite o numero 4 :"));

        //soma o quadrado dos 4 numeros
        //utilizando a função Math.pow(x,y), que retorna a potencia y da base x
        double somaQuadrados = Math.pow(numero1,2 ) + Math.pow( numero2, 2) + Math.pow(numero3, 2 ) + Math.pow(numero4, 2);

        /*utilizando o sinal de multiplicação
         * double somaQuadrados = numero1*numero1 + numero2*numero2 + numero3*numero3 + numero4*numero4;
         */

         //mostrar resultado
         JOptionPane.showMessageDialog(null, somaQuadrados);
    }

}
