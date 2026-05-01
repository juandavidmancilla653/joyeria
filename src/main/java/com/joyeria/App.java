package com.joyeria;

import com.joyeria.dao.VentaDAO;
import com.joyeria.modelo.Venta;

public class App {
    public static void main(String[] args) {

        VentaDAO dao = new VentaDAO();

        Venta v = new Venta();
        v.setFecha("2026-04-24");
        v.setId_tercero(2); // 👈 ESTE ID debe existir en tu BD

        dao.guardar(v);
    }
}
