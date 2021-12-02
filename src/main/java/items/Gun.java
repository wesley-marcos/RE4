package items;

public class Gun extends Item {

    // Atributos
    public int idGun;
    public double fire_power;
    public double firing_speed;
    public double reload_speed;
    public int capacity;
    public int range;
    public String explosion;
    public int capacity_total;
    public int num_bulls_mag;

    public Gun(int idItem) {
        super(idItem);
        idGun = idItem;
    }

    public void mostraInfo(){

        System.out.println(
              " \n ==================== CARACTERÍSTICAS DA ARMA " + idGun + " ===================="  +  "\n" +
              "Nome da Arma = " + nameItem + "\n" +
              "Valor Monetário da Arma = " + valueItem + "\n" +
              "ID = " + idGun + "\n" +
              "Poder de Fogo = " + fire_power + "\n" +
              "Velocidade de Disparo = " + fire_power + "\n" +
              "Tempo de Carregamento = " + reload_speed + "\n" +
              "Quantidade Máxima de Balas no Pente = " + capacity + "\n" +
              "Alcance = " + range + "\n" +
              "É uma arma explosiva? = " + explosion + "\n" +
              "Quantidade Total de Munição = " + capacity_total + "\n" +
              "Número Atual de Balas no Pente = " + num_bulls_mag
        );
    }
}
