
package visao;
import modelo.ItemDeProduto;
import modelo.ItemDeVenda;
import modelo.Produto;
import modelo.Venda;
import repositorio.Catalogo;


public class Sistema {
    private Catalogo catalogo;
    private Venda vendaCorrente;

    public Sistema(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    public void iniciarNovaVenda() {
        // criação de instancia e associação
        this.vendaCorrente = new Venda();

    }

    //1.0
    public void entrarItem(String id, int quantidade) {
        //1.1
        ItemDeProduto itemDeProduto = this.catalogo.buscarItemDeProdutoPorId(id);
        //1.2
        ItemDeVenda itemDeVenda = new ItemDeVenda(itemDeProduto);
        //1.3
        this.vendaCorrente.adicionar(itemDeVenda);


    }

    public void finalizarVenda() {

    }


}