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

                            Item item = new Item(k);

                            for (int j = 0; j < itens2.length; j++) {


                                if(itens2[j] == null){
                                    itens2[j] = insert_gun.insert(item, k);

                                    bgun.buy_gun(itens2[j], j);

                                    System.out.println("Inserção feita com sucesso!");



                                    break;
                                }

                                k += 1;
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

                }

            } else if (escolha == 2) {
                try {
                    System.out.println("Entre com uma opção de venda: ");
                    System.out.println("[1] Vender.");
                    System.out.println("[0] Sair.");
                    escolha_item = sc.nextInt();

                    if (escolha_item == 1) {

                        for (int j = 0; j < itens2.length; j++) {
                            Item i1 = new Item(j);
                            Item i1Aux = new Item(j);
                            Gun g = new Gun(j);
                            i1.valueItem = 1500;

                            System.out.println("Aqui entrou");


                            if(itens2[j] != null) {
                                sell_gun.sell_gun(itens2[j], p1);
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
    }
}