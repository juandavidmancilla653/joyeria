package com.joyeria.dao;

import java.sql.*;
import java.util.*;
import com.joyeria.modelo.Producto;
import com.joyeria.Conexion.Conexion;

public class ProductoDAO {

    public void guardar(Producto p) {

       String sql = "INSERT INTO producto(nombre, precio, stock) VALUES (?, ?, ?)";
        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getPrecio());
            ps.setInt(3, p.getStock());

            ps.executeUpdate();
            System.out.println("Producto guardado");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Producto> listar() {

        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto";

        try {
            Connection con = Conexion.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Producto p = new Producto();

                p.setId_producto(rs.getInt("id")); 
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));

                lista.add(p);
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return lista;
    }
}
