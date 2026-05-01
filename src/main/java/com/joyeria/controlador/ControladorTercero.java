package com.joyeria.controlador;

import com.joyeria.vista.VistaTercero;
import com.joyeria.dao.TerceroDAO;
import com.joyeria.modelo.Tercero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorTercero implements ActionListener {

    private VistaTercero vista;
    private TerceroDAO dao;

    public ControladorTercero(VistaTercero vista, TerceroDAO dao) {
        this.vista = vista;
        this.dao = dao;

        this.vista.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Tercero t = new Tercero();

        t.setNombre(vista.txtNombre.getText());
        t.setDocumento(vista.txtDocumento.getText());
        t.setTelefono(vista.txtTelefono.getText());
        t.setDireccion(vista.txtDireccion.getText());
        t.setId_tipo_tercero(1);

        dao.guardar(t);

        System.out.println("Guardado desde MVC");
    }
}