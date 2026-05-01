package com.joyeria.dao;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import com.joyeria.modelo.Tercero;
import com.joyeria.Conexion.Conexion;

public class TerceroDAO {

    public void guardar(Tercero t) {

        String sql = "INSERT INTO tercero(nombre, documento, telefono, direccion, id_tipo_tercero) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, t.getNombre());
            ps.setString(2, t.getDocumento());
            ps.setString(3, t.getTelefono());
            ps.setString(4, t.getDireccion());
            ps.setInt(5, t.getId_tipo_tercero());

            ps.executeUpdate();
            System.out.println("Tercero guardado");

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Tercero> listar() {

        List<Tercero> lista = new ArrayList<>();
        String sql = "SELECT * FROM tercero";

        try {
            Connection con = Conexion.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Tercero t = new Tercero();

                t.setId_tercero(rs.getInt("id"));
                t.setNombre(rs.getString("nombre"));
                t.setDocumento(rs.getString("documento"));
                t.setTelefono(rs.getString("telefono"));
                t.setDireccion(rs.getString("direccion"));
                t.setId_tipo_tercero(rs.getInt("id_tipo_tercero"));

                lista.add(t);
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return lista;
    }
}
