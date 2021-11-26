package control;

import items.Heal;
import items.Item;

import java.util.Scanner;

public class Insert_Heal {

    public void insert(Heal heal){

        String typeHeal;
        String effect;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o tipo da erva: ");
        typeHeal = sc.nextLine();
        heal.typeHeal = typeHeal;
        System.out.println("Insira o efeito da erva: ");
        effect = sc.nextLine();
        heal.effect = effect;

        System.out.println("Tipo = " + heal.typeHeal + "\n" +
                            "Efeito = " + heal.effect);

    }
}
