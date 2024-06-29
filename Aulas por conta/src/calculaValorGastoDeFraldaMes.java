public class calculaValorGastoDeFraldaMes {
    public static void main(String[] args) {
        int qtdFraldaDia = 4;
        double custoFraldaUnitaria = 1.10;
        double custoTotalMes;

        custoTotalMes = qtdFraldaDia * 30 * custoFraldaUnitaria;
        System.out.println("Total gasto por mês é : " + custoTotalMes);
    }

}
