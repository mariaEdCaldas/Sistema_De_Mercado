import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario{
    private double bonus;
    private double valorHrsTrab;
    private int hrsMensais;
    private List<FuncionarioCaixa> caixas;
    private List<FuncionarioRepositor> repositores;
    private double salarioReal;
  
  public Gerente(String nome, String cpf, double salarioBase,int tempoServico, String dataInicio, double vlrHrTrab, int horasMensais, double bonus, List<FuncionarioCaixa> funcC, List<FuncionarioRepositor> funcR){
      
        super(nome, cpf, salarioBase, tempoServico, dataInicio);
        this.bonus = bonus;
        this.caixas = funcC;
        this.repositores = funcR;
        calculaSalario(horasMensais, vlrHrTrab, this.bonus);
    }

  private double calculaBonus(){
      List<Funcionario> funcionarios = new ArrayList<>();
      funcionarios.addAll(caixas);
      funcionarios.addAll(repositores);

      for (Funcionario funcionario : funcionarios) {
          this.bonus += 50.0;
      }
      return this.bonus;
    }
  public void calculaSalario(int horasMensais, double valorHr, double bonus){
        this.salarioReal = (valorHr * horasMensais) + calculaBonus();
    }
    
  
  public String toString(){
        return "Gerente de nome "+ getNome() +", salario "+ getSalarioReal() +" e "+ getTempoServico() +" anos de serviço";
    }

  public void imprimirFuncionariosSubordinados() {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.addAll(caixas);
        funcionarios.addAll(repositores);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getCPF());
        }
  }
    //Adicionando Funcionario Caixa
    public void addFuncC(String nome, String cpf, double salarioBase, int tempoServico, String dataInicio, double bonus, int horasMensais,  double valorHr, double trocoEmCaixa, double nvalorEmCaixa){
    FuncionarioCaixa caixaNovo = new FuncionarioCaixa(nome, cpf, salarioBase, tempoServico, dataInicio, bonus, horasMensais, valorHr, trocoEmCaixa, nvalorEmCaixa);
    caixas.add(caixaNovo);
  }
    //Adicionando Funcionario Repositor
    public  void addFuncR(String nome, String CPF, double salarioBase, int tempoServico, String dataInicio, int horasMensais, double valorHr, double bonus, List<Produto> produtosN, int qtdDeProdutos, int qtdMaxPermitida){
    FuncionarioRepositor repositorNovo = new FuncionarioRepositor(nome,CPF,salarioBase,tempoServico,dataInicio,horasMensais, valorHr, bonus,produtosN,qtdDeProdutos,qtdMaxPermitida);
    repositores.add(repositorNovo);
  }
  
  //Getters
  public double getBonus(){
    return bonus;
  }
  public double getSalarioReal(){
    return salarioReal;
  }
  public List<FuncionarioCaixa> getFuncionariosCaixa() {
    return new ArrayList<>(caixas);
  }
  public List<FuncionarioRepositor> getFuncionariosRepositores() {
    return new ArrayList<>(repositores);
  }
}

