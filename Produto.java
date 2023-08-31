public class Produto{
  private String nome;
  private String secao;
  private String dataValidade;
  private String codBarras;
  private String marca;
  private double preco;
  private int qtdEmEstoque;

  public Produto(String nome, String secao, String dataValidade, String codBarras, String marca, double preco, int qtdEmEstoque){
    this.nome = nome;
    this.secao = secao;
    this.dataValidade = dataValidade;
    this.codBarras = codBarras;
    this.marca = marca;
    this.preco = preco;
    this.qtdEmEstoque = qtdEmEstoque;
  }

  public String InfoProduto() {
        return "Produto de nome: " + this.nome + ", da seção: " + this.secao + " e marca: "+ this.marca +", Preço: R$" + this.preco + ", Estoque: " + this.qtdEmEstoque;
    }

  public boolean temProduto(){
   return qtdEmEstoque > 0;
  }
  
  public void removeProduto(){
    qtdEmEstoque--;
  }
  public void incrementaProduto(){
    qtdEmEstoque++;
  }

  //Getters
  public String getNome(){
    return nome;
  }
  public String getSecao(){
    return secao;
  }
  public String getDataValidade(){
    return dataValidade;
  }
  public String getCodBarras(){
    return codBarras;
  }
  public String getMarca(){
    return marca;
  }
  public double getPreco(){
    return preco;
  }
  public int getQtdEmEstoque(){
    return qtdEmEstoque;
  }
  
  //Setter
  public void setPreco(double preco){
    this.preco = preco;
  }
}