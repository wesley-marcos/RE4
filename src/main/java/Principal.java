import items.Gun;
import people.Merchant;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Merchant m = new Merchant();

        Gun g1 = new Gun();
        g1.idGun = 1;
        g1.fire_power = 5;
        g1.firing_speed = 1;
        g1.reload_speed = 1;
        g1.capacity = 15;
        g1.range = 5;
        g1.explosion = 1;
        g1.capacity_total = 100;
        g1.num_bulls_mag = 15;
        /*
        //Inserir
        if(m.buy(g1)){
            System.out.println("Livro Inserido!");
        }
        else{
            System.out.println("Deu ruim na inserção.");
        }

        //Alterar
        g1.fire_power = 6.0;
        if(m.upgrade(g1, 1)){
            System.out.println("Livro Alterado!");
        }
        else{
            System.out.println("Deu ruim na alteração.");
        }

        //Delete
        if(m.sell(1)){
            System.out.println("Livro Deletado!");
        }
        else{
            System.out.println("Deu ruim na deletação.");
        }

        */
        //Mostrarm.mostraInfo(g1);

    }
}
