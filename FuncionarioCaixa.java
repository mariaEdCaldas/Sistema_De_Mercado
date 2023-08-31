import java.util.ArrayList;
import java.util.List;

public class FuncionarioCaixa extends Funcionario{
  private double valorEmCaixa = 0;
  private double trocoEmCaixa;
  private double salarioReal;
  
  public FuncionarioCaixa(String nome, String cpf, double salarioBase, int tempoServico, String dataInicio, double bonus, int horasMensais,  double valorHr, double trocoEmCaixa, double nvalorEmCaixa){
    
    super(nome, cpf, salarioBase, tempoServico, dataInicio);
    calculaSalario(horasMensais, valorHr, bonus);
    
    this.trocoEmCaixa = trocoEmCaixa;
    this.valorEmCaixa = nvalorEmCaixa;

    
  }
  public void calculaSalario(int horasMensais, double valorHr, double bonus){
    this.salarioReal = (horasMensais*valorHr) + bonus;
  }
  
  
  public boolean RealizarCompra(Cliente P) {
    double somaCaixa = 0;
    if(P.getValorTotal() <= P.getDinheiroEmConta()){
      somaCaixa = P.getValorTotal();
      P.setDinheiroEmConta(P.getDinheiroEmConta() - P.getValorTotal());
      this.valorEmCaixa = this.valorEmCaixa + somaCaixa;
      return true;
    }
    else{
      return false;
    }
  } 
    
  public double calcularFechamento(){
      return valorEmCaixa;
    }

  public String toString(){
    return "Funcionario de nome"+ getNome() +", salario "+ getSalarioReal() +"e"+ getTempoServico() +" anos de serviço";
    }

  //Getters
  public double getTrocoEmCaixa(){
    return trocoEmCaixa;
  }
  public double getValorEmCaixa(){
    return valorEmCaixa;
  }
  public double getSalarioReal(){
    return salarioReal;
  }

}