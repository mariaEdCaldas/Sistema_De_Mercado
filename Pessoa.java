public abstract class Pessoa{
  private String nome;
  private String CPF;

  public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.CPF = cpf;
  }

  //Getters
  public String getNome(){
    return nome;
  }
  public String getCPF(){
    return CPF;
  }
}