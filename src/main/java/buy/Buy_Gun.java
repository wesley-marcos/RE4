package buy;

import dao.ConnectionDAO;
import items.Gun;
import items.Item;

import java.sql.SQLException;

public class Buy_Gun extends ConnectionDAO {

    boolean sucesso = false;

    // Método para comprar uma arma
    public boolean buy_gun(Item item, int id) {

        connectToDB();


        Gun gun = new Gun(id);
        Item item2 = new Item(gun.idItem);

        for(int j =0; j < 1; j++){

            if(item instanceof Gun){
                Gun gunAux = (Gun) item;
                gun = gunAux;
            }

        }

        item2.idItem = id;

        String sql = "INSERT INTO Item (idItem, typeItem, nameItem, valueItem) values(?, ?, ?, ?)";
        String sql3 = "INSERT INTO Gun (fire_power, firing_speed, reload_speed, capacity, rangeGun, explosion, capacity_total, num_bulls_mag, idItem) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            pst = con.prepareStatement(sql);
            pst.setInt(1, item.idItem);
            pst.setString(2, item.typeItem);
            pst.setString(3, item.nameItem);
            pst.setDouble(4, item.valueItem);
            pst.execute();

            //String sql3 = "INSERT INTO Gun (fire_power, firing_speed, reload_speed, capacity, rangeGun, explosion, capacity_total, num_bulls_mag, idItem) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

            pst = con.prepareStatement(sql3);
            pst.setDouble(1, gun.fire_power);
            pst.setDouble(2, gun.firing_speed);
            pst.setDouble(3, gun.reload_speed);
            pst.setInt(4, gun.capacity);
            pst.setInt(5, gun.range);
            pst.setString(6, gun.explosion);
            pst.setInt(7, gun.capacity_total);
            pst.setInt(8, gun.num_bulls_mag);
            pst.setInt(9, item.idItem);
            pst.execute();
            sucesso = true;

        } catch (SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;

        } finally {
            try {
                con.close();
                pst.close();
            } catch (SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }
}
