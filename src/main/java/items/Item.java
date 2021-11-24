package items;

public class Item {

    public int idItem;
    public double valueItem;
    public String typeItem;
    public String nameItem;
    public int idGun;

    //Método para mostrar os itens
    public void mostraInfo(){
        System.out.println("Id do item = " + idItem);
        System.out.println("Nome do item = " + nameItem);
        System.out.println("Tipo do item = " + typeItem);
        System.out.println("Valor do item = " + valueItem);
    }
}
