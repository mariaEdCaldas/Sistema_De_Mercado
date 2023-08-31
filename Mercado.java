import java.util.ArrayList;
import java.util.List;

public class Mercado{
  private String nome;
  private String endereco;
  private int maxFuncPType;
  private int maxCliente;
  private List<FuncionarioCaixa> funcC;
  private List<FuncionarioRepositor> funcR;
  private List<Gerente> funcG;
  private List<Cliente> clientes;


  public Mercado(String nome, String endereco, int maxFuncPType, int maxCliente,List<FuncionarioCaixa> novofuncC, List<FuncionarioRepositor> novofuncR, List<Gerente> novofuncG, List<Cliente> novosclientes){

    this.nome = nome;
    this.endereco = endereco;
    this.maxFuncPType = maxFuncPType;
    this.maxCliente = maxCliente;
    this.funcC = novofuncC;
    this.funcR = novofuncR;
    this.funcG = novofuncG;
    this.clientes = novosclientes;
    
  }

  //Adicionando Funcionario Gerente
  public void addFuncG(String nome, String cpf, double salarioBase,int tempoServico, String dataInicio, double vlrHrTrab, int horasMensais, double bonus, List<FuncionarioCaixa> funcC, List<FuncionarioRepositor> funcR){
    Gerente novoGerente = new Gerente(nome, cpf, salarioBase, tempoServico, dataInicio, vlrHrTrab, horasMensais, bonus, funcC, funcR);
    funcG.add(novoGerente);  
  }

  public String toString(){
    return "Mercado "+this.nome+", Endereço: "+this.endereco;
  }
  
  //Imprime Todos os Funcionários
  public void imprimirFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.addAll(funcC);
        funcionarios.addAll(funcR);
        funcionarios.addAll(funcG);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
  //Setters

  public void setMaxFuncPType(int novoMax){
    this.maxFuncPType = novoMax;
  }
  public void setMaxClientes(int novoMaxClientes){
    this.maxCliente = novoMaxClientes;
  }
  
  //Getters
  
  public String getNome(){
    return nome;
  }
  public String getEndereco(){
    return endereco;
  }
  public int getMaxFuncPType(){
    return maxFuncPType;
  }
  public int getMaxClientes(){
    return maxCliente;
  }
  public List<FuncionarioCaixa> getFuncionariosCaixa() {
    return new ArrayList<>(funcC);
  }
  public List<FuncionarioRepositor> getFuncionariosRepositores() {
    return new ArrayList<>(funcR);
  }
  public List<Gerente> getGerentes() {
    return new ArrayList<>(funcG);
  }
  public List<Cliente> getClientes() {
    return new ArrayList<>(clientes);
  }
}