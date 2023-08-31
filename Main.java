//Segue um exemplo de Main para adicionar produtos no carrinho de cliente, calcular o valor 
//total da compra e conferir se será aprovada através da verificação do saldo na conta do 
//cliente, mostrando também o valor total que ficou em caixa após a realização da compra: 

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> carrinho = new ArrayList<>();
 
        Produto arroz = new Produto("Arroz","Alimentos", "11/06/2024", "1122334455","Tio Lautério", 20.0, 10);
        Produto sabonete = new Produto("Sabonete", "Higiene", "09/09/2025","6677889910","Lux", 3.0, 20);
        Produto refrigerante = new Produto("Refrigerante","Bebidas","10/06/2025","0192837465","Coca cola", 10.0, 50);
 
        carrinho.add(arroz);
        carrinho.add(sabonete);
        carrinho.add(refrigerante);
        Cliente cliente = new Cliente("Maria" , "10112987104", "Débito", 50.0, 100, 0, carrinho, 0.0); 
        //Caso queira um teste com saldo do cliente menor que o valor da compra use:
        // Cliente cliente = new Cliente("Maria" , "10112987104", "Débito", 30.0, 100, 0, carrinho, 0.0);
        // Dessa forma o pagamento será recusado por saldo insuficiente
        
        double valorTotal = cliente.verificarValorTotal(cliente);
        System.out.println("O valor total da compra ficou: $" +valorTotal);
 
       if(valorTotal <= cliente.getDinheiroEmConta()){
            System.out.println("Pagamento aprovado!");
        } else {
            System.out.println("Compra recusada. Saldo insuficiente!");
        }
        
        FuncionarioCaixa caixa = new FuncionarioCaixa ("João", "09004402108", 1800.0, 2,  "05/03/2023", 100.0, 160, 50.0, 0.0, 100.0);
        boolean compra = caixa.RealizarCompra(cliente);
 
       if (compra) {
            System.out.println("Compra aceita pelo caixa.");
            System.out.println("Valor em caixa: $" +caixa.getValorEmCaixa());
        } else {
            System.out.println("Compra não aceita pelo caixa.");
        }
    }
}