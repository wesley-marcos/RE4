package search;

import dao.ConnectionDAO;
import items.Gun;
import items.Item;

import java.sql.SQLException;
import java.util.ArrayList;

public class List_guns extends ConnectionDAO {

    boolean sucesso = false;

    public ArrayList<Item> buscar_arma(int k){

        ArrayList<Item> listaDeitens = new ArrayList<>();
        ArrayList<Gun> listaDeGuns = new ArrayList<>();

        connectToDB();

        String sql = "Select * from gun";
        String sql2 = "Select * from item";

        try {

            st = con.createStatement();
            rs = st.executeQuery(sql2);

            while(rs.next()) {

                Item aux = new Item(0);

                aux.nameItem = rs.getString("nameItem");
                aux.valueItem = rs.getDouble("valueItem");

                System.out.println(" \n ==================== CARACTERÍSTICAS DA ARMA " + k + " ==================== \n");
                System.out.println(
                        "Nome da Arma = " + aux.nameItem + "\n" +
                        "Valor Monetário da Arma = " + aux.valueItem
                );

                //listaDeitens.add(aux);
            }

            st = con.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next()) {
                Gun gunAux = new Gun(0);
                //gunAux.nameItem = rs.getString("nameItem");
                //gunAux.valueItem = rs.getDouble("valueItem");
                gunAux.fire_power = rs.getDouble("fire_power");
                gunAux.firing_speed = rs.getDouble("firing_speed");
                gunAux.reload_speed = rs.getDouble("reload_speed");
                gunAux.capacity = rs.getInt("capacity");
                gunAux.range = rs.getInt("rangeGun");
                gunAux.capacity_total = rs.getInt("capacity_total");
                gunAux.num_bulls_mag = rs.getInt("num_bulls_mag");

                System.out.println(

                                "ID = " + gunAux.idGun + "\n" +
                                "Poder de Fogo = " + gunAux.fire_power + "\n" +
                                "Velocidade de Disparo = " + gunAux.fire_power + "\n" +
                                "Tempo de Carregamento = " + gunAux.reload_speed + "\n" +
                                "Quantidade Máxima de Balas no Pente = " + gunAux.capacity + "\n" +
                                "Alcance = " + gunAux.range + "\n" +
                                "É uma arma explosiva? = " + gunAux.explosion + "\n" +
                                "Quantidade Total de Munição = " + gunAux.capacity_total + "\n" +
                                "Número Atual de Balas no Pente = " + gunAux.num_bulls_mag
                );
            }

            for(int i = 0; i < listaDeGuns.size(); i++){

                if(listaDeitens.get(i) instanceof Gun){
                    Gun gunAux = (Gun) listaDeitens.get(i);
                    listaDeitens.add(gunAux);
                }
            }

            sucesso = true;

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return listaDeitens;
    }
}
