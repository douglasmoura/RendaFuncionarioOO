package TesteDIO11;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Douglas", "123123", 3000.0, "312312");

        funcionario.receberAumento(1000.0);
        System.out.println("Valor do aumento: " + funcionario.getSalario());
        System.out.printf("Imposto calculado: %.2f\n", funcionario.calcularImposto());
        System.out.println("Ganho Bruto Anual: " + funcionario.calcularGanhoBrutoAnual());
        System.out.println("Ganho Liquido Mensal: " + funcionario.calcularGanhoLiquidoMensal());
        System.out.println("Ganho Liquido Anual: " + funcionario.calcularGanhoLiquidoAnual());

    }
}
