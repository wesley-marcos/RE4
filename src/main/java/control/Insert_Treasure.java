package control;

import items.Treasure;

import java.util.Scanner;

public class Insert_Treasure {

    public void insert(Treasure treasure){

        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do tesouro: ");
        name = sc.nextLine();
        treasure.nameTreasure = name;

        System.out.println("Nome = " + treasure.nameTreasure);

    }
}
