package people;

import dao.ConnectionDAO;
import items.Gun;
import items.Item;

import java.sql.SQLException;

public class Merchant extends ConnectionDAO {

    Item itens = new Item();

    boolean sucesso = false;

    //Método para vender um item
    public boolean sell(int idGun){

        connectToDB();
        String sql = "DELETE FROM Gun WHERE idGun = ?";

        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, idGun);
            pst.execute();
            sucesso = true;

        } catch(SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;

        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    //Método para comprar um item
    public boolean buy(Gun gun){

        connectToDB();
        String sql = "INSERT INTO Gun (idGun, fire_power, firing_speed, reload_speed, capacity, rangeGun, explosion, capacity_total, num_bulls_mag) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, gun.idGun);
            pst.setDouble(2, gun.fire_power);
            pst.setDouble(3, gun.firing_speed);
            pst.setDouble(4, gun.reload_speed);
            pst.setInt(5, gun.capacity);
            pst.setInt(6, gun.range);
            pst.setInt(7, gun.explosion);
            pst.setInt(8, gun.capacity_total);
            pst.setInt(9, gun.num_bulls_mag);
            pst.execute();
            sucesso = true;

        } catch(SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;

        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;
    }

    //Método para upar um item
    public boolean upgrade(Gun gun, int id){

        connectToDB();
        String sql = "UPDATE Gun SET fire_power = ?, firing_speed = ?, reload_speed = ?, capacity = ? WHERE idGun = ?";

        try{
            pst = con.prepareStatement(sql);
            pst.setDouble(1, gun.fire_power);
            pst.setDouble(2, gun.firing_speed);
            pst.setDouble(3, gun.reload_speed);
            pst.setInt(4, gun.capacity);
            pst.setInt(5, gun.idGun);
            pst.execute();
            sucesso = true;

        } catch(SQLException exc){
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;

        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }

        return sucesso;

    }

    //Método para mostrar os itens
    public void mostraInfo(Gun g){
        System.out.println("ID = " + g.idGun + "\n" +
                "Fire Power = " + g.fire_power + "\n" +
                "Firing Speed = " + g.firing_speed + "\n" +
                "Reload Speed = " + g.reload_speed + "\n" +
                "Capacity = " + g.capacity + "\n" +
                "Range = " + g.range + "\n" +
                "Explosion = " + g.explosion + "\n" +
                "Capacity = " +g.capacity_total + "\n" +
                "Balas no Pente = " + g.num_bulls_mag);
    }
}
