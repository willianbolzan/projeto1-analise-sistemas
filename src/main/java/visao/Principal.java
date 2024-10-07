package visao;



import repositorio.Catalogo;



public class Principal {
    public static void main(String[] args) {
        //1.0
        Catalogo catalogo = new Catalogo();
        //2.0
        Sistema sistema = new Sistema(catalogo);



    }

}
