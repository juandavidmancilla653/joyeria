package com.joyeria.dao;

import java.sql.*;
import com.joyeria.modelo.DetalleVenta;
import com.joyeria.Conexion.Conexion;

public class DetalleVentaDAO {

    public void guardar(DetalleVenta d) {

        String sql = "INSERT INTO detalle_venta(id_venta, id_producto, cantidad, precio, subtotal) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, d.getId_venta());
            ps.setInt(2, d.getId_producto());
            ps.setInt(3, d.getCantidad());
            ps.setDouble(4, d.getPrecio());
            ps.setDouble(5, d.getSubtotal());

            ps.executeUpdate();
            System.out.println("Detalle guardado");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}