/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad26;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class Actividad26 extends JFrame{

    private Dimension dmVentana = new Dimension(540, 640);
    
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");
    private JLabel lblNombre = new JLabel("Nombre Completo");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo = new JLabel("Correo electrónico");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblTelefono = new JLabel("Teléfono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion = new JLabel("Dirección");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblWeb= new JLabel("Sitio Web");
    private JTextField txtWeb = new JTextField();
    
    private JButton btnEnviar = new JButton("Guardar Cambios");
    private JButton btnCancelar = new JButton("Cancelar");
    
    
    private JPanel pnlDatos = new JPanel(new GridLayout(10,1,0,10));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private final Color COLOR_FONDO = new Color(0, 166, 255);
    private final Color COLOR_TEXTO = new Color(255,255,255);
    private final Font FUENTE = new Font("Calibri", Font.PLAIN,16);
    
    public Actividad26(){
        this.setSize(dmVentana);
        this.setTitle("Ventana Principal");
        lblTitulo.setFont(new Font("Calibri",Font.BOLD,32));
        lblTitulo.setForeground(COLOR_TEXTO);
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(COLOR_FONDO);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        this.add(lblTitulo, BorderLayout.NORTH);
        
        
        txtNombre.setBorder(BorderFactory.createMatteBorder(0,0,3,0,COLOR_FONDO));
        txtCorreo.setBorder(BorderFactory.createMatteBorder(0,0,3,0,COLOR_FONDO));
        txtTelefono.setBorder(BorderFactory.createMatteBorder(0,0,3,0,COLOR_FONDO));
        txtDireccion.setBorder(BorderFactory.createMatteBorder(0,0,3,0,COLOR_FONDO));
        txtWeb.setBorder(BorderFactory.createMatteBorder(0,0,3,0,COLOR_FONDO));
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblWeb);
        pnlDatos.add(txtWeb);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
      
        for (int i = 0; i < pnlDatos.getComponentCount(); i++) {
            Component cmp = pnlDatos.getComponent(i);
            //if (i % 2 == 0){
            if (cmp instanceof JLabel) {
                cmp.setFont(FUENTE.deriveFont(Font.BOLD));
            } else {
                cmp.setFont(FUENTE);
            }
        }
        

        this.add(pnlDatos, BorderLayout.CENTER);
        
        
        btnCancelar.setFont(FUENTE.deriveFont(Font.BOLD));
        btnCancelar.setForeground(COLOR_TEXTO);
        btnCancelar.setBackground(new Color(138, 138, 138));
        btnEnviar.setFont(FUENTE.deriveFont(Font.BOLD));
        btnEnviar.setForeground(COLOR_TEXTO);
        btnEnviar.setBackground(COLOR_FONDO);
        pnlBotones.add(btnCancelar);
        pnlBotones.add(btnEnviar);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(20, 30, 30, 30));
        this.add(pnlBotones, BorderLayout.SOUTH);        

        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
     }
    
    
    
    public static void main(String[] args) {
        Actividad26 v = new Actividad26();
        v.setVisible(true);
    }
}
