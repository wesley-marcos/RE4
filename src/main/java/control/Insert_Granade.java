package control;

import items.Granade;
import items.Gun;
import items.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert_Granade {

    public void insert(Granade granade){

        String type;
        double range;
        double explosion;
        String color;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tipo da granada: ");
        type = sc.nextLine();
        granade.typeGranade = type;
        System.out.println("Insira o alcance de efeito: ");
        range = sc.nextDouble();
        granade.rangeGranade = range;
        System.out.println("Insira o poder de explosão: ");
        explosion = sc.nextDouble();
        granade.explosion_power = explosion;
        System.out.println("Insira a cor da granada: ");
        color = sc.next();
        granade.color = color;
    }
}
