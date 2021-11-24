import buy.Buy_Granade;
import items.*;
import buy.*;
import people.Merchant;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Merchant m = new Merchant();
        Buy_Granade bg = new Buy_Granade();
        Buy_Gun bgun = new Buy_Gun();
        Buy_Heal bh = new Buy_Heal();
        Buy_Treasure bt = new Buy_Treasure();

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

        Item i1 = new Item();
        i1.idItem = 1;
        i1.nameItem = "Pistola Blacktail";
        i1.typeItem = "Pistola";
        i1.valueItem = 24000;

        Granade gr1 = new Granade();
        gr1.idGranade = 2;
        gr1.typeGranade = "Explosive";
        gr1.rangeGranade = 5.3;
        gr1.explosion_power = 6;
        gr1.color = "Black";

        Item igr1 = new Item();
        igr1.idItem = 2;
        igr1.nameItem = "Explosion Granade";
        igr1.typeItem = "Granade";
        igr1.valueItem = 3500;

        Heal h1 = new Heal();
        h1.idHeal = 4;
        h1.typeHeal = "Healling";
        h1.effect = "Healling";

        Item ih1 = new Item();
        ih1.idItem = 4;
        ih1.nameItem = "Healling Herb";
        ih1.typeItem = "Plant";
        ih1.valueItem = 500;

        Treasure t1 = new Treasure();
        t1.idTreasure = 6;
        t1.nameTreasure = "Salazar's Family Insignia";

        Item it1 = new Item();
        it1.idItem = 6;
        it1.nameItem = "Salazar's Insignia";
        it1.typeItem = "Treasure";
        it1.valueItem = 48000;


        bg.buy_granade(igr1, gr1);
        //bgun.buy_gun(i1, g1);
        //bh.buy_heal(ih1, h1);
        //bt.buy_treasure(it1, t1);








        /*

        //Inserir
        if(m.buy(g1, i1)){
            System.out.println("Arma e item Inseridos!");
        }
        else{
            System.out.println("Deu ruim na inserção.");
        }

        //Inserir
        if(m.buy(g2, i2)){
            System.out.println("Arma e item Inseridos!");
        }
        else{
            System.out.println("Deu ruim na inserção.");
        }

        //Inserir
        if(m.buy(g1, i1)){
            System.out.println("Arma e item Inseridos!");
        }
        else{
            System.out.println("Deu ruim na inserção.");
        }

        //Inserir
        if(m.buy(g1, i1)){
            System.out.println("Arma e item Inseridos!");
        }
        else{
            System.out.println("Deu ruim na inserção.");
        }

        //Inserir
        if(m.buy(g1, i1)){
            System.out.println("Arma e item Inseridos!");
        }
        else{
            System.out.println("Deu ruim na inserção.");
        }


        */

        /*

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


        //Mostrarm.mostraInfo(g1);*/

    }
}
