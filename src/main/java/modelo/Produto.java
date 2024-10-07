
package modelo;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    
    private ArrayList<ItemDeProduto> itensDeProdutos;
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.itensDeProdutos = new ArrayList<ItemDeProduto>();
    }      
    
    
    public void adicionar(ItemDeProduto itemDeProduto){
        this.itensDeProdutos.add(itemDeProduto);
    }
    
    public void remover(ItemDeProduto itemDeProduto){
        this.itensDeProdutos.remove(itemDeProduto);
    }
    
    public int quantidade(){
        return this.itensDeProdutos.size();
    }
}
