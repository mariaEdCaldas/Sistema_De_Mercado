import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositor extends Funcionario{
  private List<Produto> produtos;
  private int qtdDeProdutos;
  private final int qtdMaxPermitida = 100;
  private double salarioReal;

  public FuncionarioRepositor(String nome, String cpf, double salarioBase, int tempoServico, String dataInicio, int horasMensais, double valorHr, double bonus, List<Produto> produtosN, int qtdDeProdutos, int qtdMaxPermitida){
    super(nome, cpf, salarioBase, tempoServico, dataInicio);
    this.qtdDeProdutos = qtdDeProdutos;
    this.produtos = produtosN;

    calculaSalario(horasMensais, valorHr, bonus);
    
  }

  public void calculaSalario(int hrsMensais, double valorHr, double bonus){
      this.salarioReal = (valorHr * hrsMensais) + bonus;
    }
  
  public boolean adicionaProduto(Produto P){
    if(qtdDeProdutos < qtdMaxPermitida){
      produtos.add(P);
      P.incrementaProduto();
      return true;
    } else {
      return false;
    }
  }

  public String toString(){
    return "Nome do repositor: "+getNome()+ ", quantidade de produtos na qual esse repositor é responsável: "+getQtdDeProdutos();
  }
  
  public String verificaEstoque(Produto P){
    if(P.temProduto()==true){
      return "O estoque possui: " +P.getQtdEmEstoque()+ " unidades.";
    } else{
      return "Não possui nenhum estoque desse produto.";
    }
  }

  //Getters
  
  public List<Produto> getProdutos() {
    return new ArrayList<>(produtos);
  }
  public int getQtdDeProdutos(){
    return qtdDeProdutos;
  }
  public int getQtdMaxPermitida(){
    return qtdMaxPermitida;
  }
}

