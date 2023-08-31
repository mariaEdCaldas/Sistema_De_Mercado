import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
  private String formaPagamento;
  private double dinheiroEmConta;
  private int qtdMaxProduto = 100; 
  private int qtdTotalProdutos = 0;
  private double valorTotal;
  private List<Produto> carrinho;
  
  public Cliente(String nome, String cpf, String formaPagamento, double dinheiroEmConta, int qtdMaxProduto, int qtdTotalProdutos, List<Produto> carrinhoN, double valorTotal){
    super(nome,cpf);
    this.formaPagamento = formaPagamento;
    this.dinheiroEmConta = dinheiroEmConta;
    this.qtdMaxProduto = qtdMaxProduto;
    this.qtdTotalProdutos = qtdTotalProdutos;
    this.valorTotal = valorTotal;
    this.carrinho = carrinhoN;
  }

  public boolean RealizarCompra() {
    if(this.valorTotal < dinheiroEmConta){
      dinheiroEmConta -= this.valorTotal;
      return true;
    }
    else{
      return false;
    }
  } 

  public double verificarValorTotal(Cliente p){
    for (Produto produt : carrinho) {
      this.valorTotal += produt.getPreco();
    }
    return this.valorTotal;
  }

  public void abastecerCarrinho(Produto P){
    if(P.temProduto() == true){
      if(this.qtdTotalProdutos < qtdMaxProduto){
        this.carrinho.add(P);
        this.qtdTotalProdutos++;
        P.removeProduto();
      }
    }
  }

  public double sobrouEmConta(){
    if(RealizarCompra() == true){
      return this.dinheiroEmConta = (valorTotal - dinheiroEmConta);
    }
    else{
      return this.dinheiroEmConta;
    }
  }

  public String toString(){ 
    return "Um total de "+this.qtdTotalProdutos +" produtos, valor total de "+this.valorTotal+" e o pagamento sera feito em "+this.formaPagamento;
  }

  //Setters
  public void setDinheiroEmConta(double p){
    this.dinheiroEmConta = p;
  }

  //Getters
  public double getDinheiroEmConta(){
    return dinheiroEmConta;
  }
  public String getFormaPagamento(){
    return this.formaPagamento;
  }
  public int getQtdMax(){
    return this.qtdMaxProduto;
  }
  public int getQtdTotal(){
    return this.qtdTotalProdutos;
  } 
  public List<Produto> getCarrinho() {
    return new ArrayList<>(carrinho);
  }
  public double getValorTotal(){
    return valorTotal;
  }
}