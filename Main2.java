//A seguir está um outro exemplo de main onde será mostrado as informações de um 
//gerente e uma lista de funcionários e seus CPFs que são gerenciados pelo mesmo:

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
 
        // Criação de alguns produtos para os funcionários repositor
        List<Produto> produtos1 = new ArrayList<>(); 
        produtos1.add(new Produto("Produto 1", "Secao 1", "01/01/2024", "123456789", "Marca 1", 10.0, 50));
        produtos1.add(new Produto("Produto 2", "Secao 2", "01/02/2024", "987654321", "Marca 2", 15.0, 100));
 
        List<Produto> produtos2 = new ArrayList<>();
        produtos2.add(new Produto("Produto 3", "Secao 1", "01/03/2024", "456789123", "Marca 1", 20.0, 75));
        produtos2.add(new Produto("Produto 4", "Secao 3", "01/04/2024", "321987654", "Marca 3", 25.0, 120));
 
        List<Produto> produtos3 = new ArrayList<>();
        produtos3.add(new Produto("Produto 5", "Secao 2", "01/05/2024", "789123456", "Marca 2", 30.0, 80));
        produtos3.add(new Produto("Produto 6", "Secao 1", "01/06/2024", "654321987", "Marca 1", 35.0, 90));
 
        List<Produto> produtos4 = new ArrayList<>();
        produtos4.add(new Produto("Produto 7", "Secao 3", "01/07/2024", "321456987", "Marca 3", 40.0, 100));
        produtos4.add(new Produto("Produto 8", "Secao 2", "01/08/2024", "987654123", "Marca 2", 45.0, 110));
    
        //Criando os Gerentes
        List<FuncionarioCaixa> subordinadosCaixa1 = new ArrayList<>();
        List<FuncionarioRepositor> subordinadosRepositor1 = new ArrayList<>();
        
        Gerente gerente1 = new Gerente("Carlos", "789123456", 3000.0, 5, "01/01/2023", 20.0, 180, 60, subordinadosCaixa1, subordinadosRepositor1);
        
        List<FuncionarioCaixa> subordinadosCaixa2 = new ArrayList<>();
        List<FuncionarioRepositor> subordinadosRepositor2 = new ArrayList<>();
 
        Gerente gerente2 = new Gerente("Fernanda", "321987654", 3500.0, 4, "01/02/2023", 18.0, 160, 50, subordinadosCaixa2, subordinadosRepositor2);
 
        // Adicionando funcionários caixa aos gerentes
        gerente1.addFuncC("João", "123456789", 2000.0, 2, "01/01/2023", 10.0, 160, 100.0, 0.0, 500.0);
        gerente1.addFuncC("Maria", "987654321", 1800.0, 1, "01/05/2023", 9.0, 140, 50.0, 0.0, 300.0);
        gerente2.addFuncC("Carlos", "456789123", 1900.0, 2, "01/02/2023", 9.5, 150, 75.0, 0.0, 200.0);
        gerente2.addFuncC("Ana", "654789321", 2100.0, 3, "01/03/2023", 10.0, 170, 90.0, 0.0, 400.0);
 
 
        // Adicionando funcionários repositor aos gerentes
        gerente1.addFuncR("Pedro", "456789123", 2200.0, 3, "01/01/2023", 6, 12.0, 20.0, 
        produtos1, 160, 100);
        gerente1.addFuncR("Luiza", "654789321", 2300.0, 4, "01/02/2023", 5, 13.0, 30.0, 
        produtos2, 150, 90);
        gerente2.addFuncR("Mariana", "789123456", 2400.0, 5, "01/03/2023", 8, 14.0, 15.0, 
        produtos3, 140, 80);
        gerente2.addFuncR("Gustavo", "321456987", 2500.0, 6, "01/04/2023", 15, 15.0, 40.0, 
        produtos4, 130, 70);
 
 
        // Impressão das informações dos gerentes e seus funcionários subordinados
        System.out.println("Informações do Gerente 1:");
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("CPF: " + gerente1.getCPF());
        System.out.println("Salário Base: " + gerente1.getSalarioBase());
        System.out.println("Tempo de Serviço: " + gerente1.getTempoServico());
        System.out.println("Data de Início: " + gerente1.getDataInicio());
        System.out.println("Funcionários Subordinados:");
        gerente1.imprimirFuncionariosSubordinados();
        
        System.out.println();
        System.out.println("Informações do Gerente 2:");
        System.out.println("Nome: " + gerente2.getNome());
        System.out.println("CPF: " + gerente2.getCPF());
        System.out.println("Salário Base: " + gerente2.getSalarioBase());
        System.out.println("Tempo de Serviço: " + gerente2.getTempoServico());
        System.out.println("Data de Início: " + gerente2.getDataInicio());
        System.out.println("Funcionários Subordinados:");
        gerente2.imprimirFuncionariosSubordinados(); 
    }    
}
