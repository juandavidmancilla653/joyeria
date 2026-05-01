package com.joyeria.vista;

import javax.swing.*;
import java.awt.*;

public class VistaTercero extends JFrame {

    public JTextField txtNombre, txtDocumento, txtTelefono, txtDireccion;
    public JButton btnGuardar;

    public VistaTercero() {

        setTitle("Sistema de Joyería - Registro de Terceros");
        setSize(400, 300);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 2, 5, 5));


        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Documento:"));
        txtDocumento = new JTextField();
        add(txtDocumento);

        add(new JLabel("Teléfono:"));
        txtTelefono = new JTextField();
        add(txtTelefono);

        add(new JLabel("Dirección:"));
        txtDireccion = new JTextField();
        add(txtDireccion);

        btnGuardar = new JButton("Guardar");
        add(new JLabel()); // espacio vacío
        add(btnGuardar);

        setVisible(true);
    }
}