import buy.Buy_Gun;
import control.Insert_Gun;
import delete.Delete_gun;
import items.Gun;
import items.Item;
import people.Merchant;
import people.Player;
import sell.Sell_Gun;
import tune_up.Tune_up;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Merchant m = new Merchant();
        Buy_Gun bgun = new Buy_Gun();

        Sell_Gun sell_gun = new Sell_Gun();

        Tune_up tune_up = new Tune_up();

        Delete_gun dGun = new Delete_gun();

        ArrayList<Item> itens = new ArrayList<>();

        Item [] itens2 = new Item[6];

        Insert_Gun insert_gun = new Insert_Gun();

        Player p1 = new Player(6);
        p1.name = "Leon";
        p1.life = 50;
        p1.pasetas = 2000;
        p1.inventory = 6;

        System.out.println("");
        System.out.println("Entre com uma opção: ");
        System.out.println("[1] Comprar uma arma.");
        System.out.println("[2] Vender uma arma.");
        System.out.println("[3] Melhorar uma arma.");
        System.out.println("[4] Mostrar as armas.");
        System.out.println("[0] Sair.");

        int escolha = sc.nextByte();
        int escolha_item;
        int i = 0;
        int k = 0;

        while (escolha != 0) {

            if (escolha == 1) {

                try {

                    if (p1.inventory > 0) {

                        System.out.println("Entre com o tipo do item: ");
                        System.out.println("    [1] Comprar");
                        System.out.println("    [0] Voltar");
                        escolha_item = sc.nextInt();

                        if (escolha_item == 1) {

                            for (int j = 0; j < 1; j++) {

                                Item item = new Gun(i);

                                item = insert_gun.insert(itens2[j], j);
                                item.typeItem = "Sla";

                                for(int t = 0; t < itens2.length; t++){

                                    if(itens2[t] == null){
                                        itens2[t] = item;
                                    }
                                }



                                bgun.buy_gun(itens2[j], j);


                            }
                        }

                        else if (escolha_item == 0) {
                            System.out.println();
                            System.out.println("Entre com uma opção: ");
                            System.out.println("[1] Comprar um item.");
                            System.out.println("[2] Vender um item.");
                            System.out.println("[3] Melhorar um item.");
                            System.out.println("[4] Mostrar os itens.");
                            System.out.println("[0] Sair.");

                            escolha = sc.nextInt();
                        }

                    }

                } catch (Exception e) {
                    System.out.println(e);

                } finally {
                    i += 1;

                }

            } else if (escolha == 2) {
                try {
                    System.out.println("Entre com uma opção de venda: ");
                    System.out.println("[1] Gun.");
                    System.out.println("[2] Heal.");
                    System.out.println("[3] Treasure.");
                    System.out.println("[4] Granade.");
                    System.out.println("[0] Sair.");
                    escolha_item = sc.nextInt();

                    if (escolha_item == 1) {
                        for (int j = 0; j < itens2.length; j++) {
                            Item i1 = new Item(j);
                            Item i1Aux = new Item(j);
                            Gun g = new Gun(j);
                            i1.valueItem = 1500;

                            System.out.println("Aqui entrou");

                            sell_gun.sell_gun(i1Aux, g, p1);

                            if(itens2[j] instanceof Gun){
                                System.out.println("Instanceof");
                                g = (Gun)itens.get(j);

                                i1Aux = dGun.buscar(itens2[j]);
                            }

                            System.out.println("Entrou na parte de venda");
                        }


                    }

                    else if (escolha_item == 0) {
                        System.out.println();
                        System.out.println("Entre com uma opção: ");
                        System.out.println("[1] Comprar um item.");
                        System.out.println("[2] Vender um item.");
                        System.out.println("[3] Melhorar um item.");
                        System.out.println("[4] Mostrar os itens.");
                        System.out.println("[0] Sair.");

                        escolha = sc.nextByte();
                    }

                } catch (Exception e) {
                    System.out.println(e);

                } finally {
                    i += 1;
                }
            }

            else if(escolha ==  3){

                System.out.println("Entre com uma opção de upgrade: ");
                System.out.println("[1] Fire Power.");
                System.out.println("[2] Firing Speed.");
                System.out.println("[3] Reload Speed.");
                System.out.println("[4] Capacity.");
                System.out.println("[0] Sair.");
                escolha_item = sc.nextInt();

                if(escolha_item == 1){

                }
            }

            i += 1;

        }
        // sc.close();*/
    }
}