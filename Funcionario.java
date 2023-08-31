public abstract class Funcionario extends Pessoa{
  private double salarioBase;
  private int tempoServico;
  private String dataInicio;
  
  public Funcionario(String nome, String cpf, double salarioBase, int tempoServico, String dataInicio){
    super(nome,cpf);
    this.salarioBase = salarioBase;
    this.tempoServico = tempoServico;
    this.dataInicio = dataInicio;
  }
  
  public abstract void calculaSalario(int horasMensais, double valorHr, double bonus);

  public abstract String toString();

  //Setters
  public void setSalarioBase(double novoSalarioBase){
    this.salarioBase = novoSalarioBase;
  }
  public void setTempoServico(int novoTempo){
    this.tempoServico = novoTempo;
  }

  //Getters
  public String getDataInicio(){
    return this.dataInicio;
  }
  public double getSalarioBase(){
    return salarioBase;
  }
  public int getTempoServico(){
    return tempoServico;
  }

}
