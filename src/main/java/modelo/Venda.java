
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class Venda {
    private LocalDate data;
    private ArrayList<ItemDeVenda> itensDeVenda;

    public Venda(){
        this.itensDeVenda = new ArrayList<>();
        this.data = LocalDate.now();
    }

    public void adicionar(ItemDeVenda itemDeVenda){
        this.itensDeVenda.add(itemDeVenda);

    }


}
