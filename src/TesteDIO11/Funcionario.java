package TesteDIO11;


public class Funcionario {
    private String nome;
    private String matricula;
    private Double salario= 1000.0;
    private String Cpf;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario += salario;
    }

    
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    

    public Funcionario(String nome, String matricula, Double salario, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.Cpf = cpf;
    }

  

    

    public void receberAumento(Double valor){
      
       setSalario(valor);
       
    }

    public Double calcularGanhoBrutoAnual(){
     
        return getSalario() * 12;
    }

    public Double calcularGanhoLiquidoMensal(){

        double salarioINNS = getSalario();

        salarioINNS = salarioINNS * 0.89;

        if(salarioINNS  > 2500){
            return salarioINNS  * 0.825;
        }
        return salarioINNS ;
    }

    public Double calcularGanhoLiquidoAnual(){
        Double totalLiquido = calcularGanhoLiquidoMensal() * 12;
        return totalLiquido;
    }

    public Double calcularImposto(){

        double pagarImposto = 0.0;

        if(getSalario()  > 2500){

            return getSalario() * 0.175;
        }
      
        return pagarImposto;
    }

}
