package com.joyeria.dao;

import java.sql.*;
import com.joyeria.modelo.Venta;
import com.joyeria.Conexion.Conexion;

public class VentaDAO {

    public void guardar(Venta v) {

    String sql = "INSERT INTO venta(fecha, id_cliente, total) VALUES (?, ?, ?)";

    try {
        Connection con = Conexion.conectar();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, v.getFecha());
        ps.setInt(2, v.getId_tercero()); // este es el id del cliente
        ps.setDouble(3, 0); // total por ahora

        ps.executeUpdate();
        System.out.println("Venta guardada");

        con.close();

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}