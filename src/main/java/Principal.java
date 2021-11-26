import buy.Buy_Granade;
import items.*;
import buy.*;
import people.Merchant;
import people.Player;
import sell.Sell_Granade;
import sell.Sell_Gun;
import sell.Sell_Heal;
import sell.Sell_Treasure;
import tune_up.Tune_up;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Item> itens = new ArrayList<>();

        Player p1 = new Player(6);
        p1.name = "Leon";
        p1.life = 50;
        p1.pasetas = 2000;
        p1.inventory = 6;

        System.out.println();
        System.out.println("Entre com uma opção: ");
        System.out.println("[1] Comprar um item.");
        System.out.println("[2] Vender um item.");
        System.out.println("[3] Melhorar um item.");
        System.out.println("[4] Mostrar os itens.");
        System.out.println("[0] Sair.");

        int escolha = sc.nextByte();
        int i = 0;

        while(escolha != 0){

            if(escolha == 1){


                try{

                    if(p1.inventory <= 6 && p1.inventory > 0){

                        sc.nextLine();
                        System.out.println("Entre com o tipo do item: ");


                    }



                } catch(Exception e){

                } finally {

                }




            }


        }

        /*
        System.out.println("Pasetas = " + p1.pasetas);

        Merchant m = new Merchant();
        Buy_Granade bg = new Buy_Granade();
        Buy_Gun bgun = new Buy_Gun();
        Buy_Heal bh = new Buy_Heal();
        Buy_Treasure bt = new Buy_Treasure();

        Sell_Granade sell_granade = new Sell_Granade();
        Sell_Gun sell_gun = new Sell_Gun();
        Sell_Heal sell_heal = new Sell_Heal();
        Sell_Treasure sell_treasure = new Sell_Treasure();

        Tune_up tune_up = new Tune_up();

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
        t1.idTreasures = 6;
        t1.nameTreasure = "Salazar's Family Insignia";

        Item it1 = new Item();
        it1.idItem = 6;
        it1.nameItem = "Salazar's Insignia";
        it1.typeItem = "Treasure";
        it1.valueItem = 48000;

        //Granade
        bg.buy_granade(igr1, gr1);
        sell_granade.sell_granade(igr1, gr1, p1);

        //Gun
        bgun.buy_gun(i1, g1);

        System.out.println("Fire Power = " + g1.fire_power);
        sell_gun.sell_gun(i1, g1, p1);

        //Heal
        bh.buy_heal(ih1, h1);
        sell_heal.sell_heal(ih1, h1, p1);

        //Treasure
        bt.buy_treasure(it1, t1);
        sell_treasure.sell_treasure(it1, t1, p1);

        g1.fire_power = 6;
        tune_up.upgrade(g1);
        */

    }
}
