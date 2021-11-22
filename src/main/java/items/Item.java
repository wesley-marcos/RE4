package items;

public class Item {

    int idItem;
    double valueItem;
    String typeItem;
    String nameItem;

    //Método para mostrar os itens
    public void mostraInfo(){
        System.out.println("Id do item = " + idItem);
        System.out.println("Nome do item = " + nameItem);
        System.out.println("Tipo do item = " + typeItem);
        System.out.println("Valor do item = " + valueItem);
    }
}
