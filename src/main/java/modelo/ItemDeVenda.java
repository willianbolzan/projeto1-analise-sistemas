
package modelo;

import java.util.ArrayList;


public class ItemDeVenda {
    private ArrayList<ItemDeProduto> itensDeProduto;
    
    public ItemDeVenda(ItemDeProduto itemDeProduto){
        this.itensDeProduto = new ArrayList<>();
        this.adicionar(itemDeProduto);
    }
    
    public void adicionar(ItemDeProduto itemDeProduto){
        this.itensDeProduto.add(itemDeProduto);
    }
    
}
