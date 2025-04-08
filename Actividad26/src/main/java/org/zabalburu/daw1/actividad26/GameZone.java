/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class GameZone extends JFrame {
    private Dimension dmVentana = new Dimension(600, 640);
    
    private JLabel lblTitulo = new JLabel("GAME ZONE");
    private JLabel lblNombre = new JLabel("GAMERTAG");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo = new JLabel("EMAIL");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblPassword = new JLabel("PASSWORD");
    private JPasswordField pwdPassword = new JPasswordField();
   
    
    private JButton btnEnviar = new JButton("REGISTRARSE");
    private JButton btnCancelar = new JButton("CANCELAR");
    
    
    private JPanel pnlDatos = new JPanel(new GridLayout(6,1,0,10));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
    private final Color COLOR_VERDE = new Color(7, 250, 108);
    private final Color COLOR_GRIS = new Color(89, 89, 89);
    private final Color COLOR_GRIS_OSCURO = new Color(28, 28, 28);
    private final Font FUENTE = new Font("Calibri", Font.PLAIN,24);
    private final Font FUENTE_BOTONES = new Font("Calibri", Font.PLAIN,20);

    
    public GameZone(){
        this.setSize(dmVentana);
        this.setTitle("GAME ZONE - Registro");
        lblTitulo.setFont(new Font("Impact",Font.BOLD,38));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setForeground(COLOR_VERDE);
        lblTitulo.setOpaque(true);
        lblTitulo.setBackground(COLOR_GRIS);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
        lblTitulo.setBorder(BorderFactory.createMatteBorder(0,0,2,0,COLOR_VERDE));
        this.add(lblTitulo, BorderLayout.NORTH);
        
        
        txtNombre.setBorder(BorderFactory.createMatteBorder(2,2,2,2,COLOR_VERDE));
        txtNombre.setBackground(COLOR_GRIS);
        txtCorreo.setBorder(BorderFactory.createMatteBorder(2,2,2,2,COLOR_VERDE));
        txtCorreo.setBackground(COLOR_GRIS);
        pwdPassword.setBorder(BorderFactory.createMatteBorder(2,2,2,2,COLOR_VERDE));
        pwdPassword.setBackground(COLOR_GRIS);
       
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblPassword);
        pnlDatos.add(pwdPassword);
        pnlDatos.setBackground(COLOR_GRIS_OSCURO);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
      
        for (int i = 0; i < pnlDatos.getComponentCount(); i++) {
            Component cmp = pnlDatos.getComponent(i);
            //if (i % 2 == 0){
            if (cmp instanceof JLabel) {
                cmp.setFont(FUENTE.deriveFont(Font.BOLD));
                cmp.setForeground(COLOR_VERDE);
            } else {
                cmp.setFont(FUENTE);
            }
        }
        

        this.add(pnlDatos, BorderLayout.CENTER);
        
        btnEnviar.setFont(FUENTE_BOTONES.deriveFont(Font.BOLD));
        btnEnviar.setForeground(new Color(0,0,0));
        btnEnviar.setBackground(COLOR_VERDE);
        btnCancelar.setFont(FUENTE_BOTONES.deriveFont(Font.BOLD));
        btnCancelar.setForeground(new Color(0,0,0));
        btnCancelar.setBackground(new Color(255, 0, 0));
        pnlBotones.setBackground(COLOR_GRIS_OSCURO);
        pnlBotones.add(btnEnviar);
        pnlBotones.add(btnCancelar);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(20, 30, 30, 30));
        this.add(pnlBotones, BorderLayout.SOUTH);        

        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
     }
    
    
    
    public static void main(String[] args) {
        GameZone v = new GameZone();
        v.setVisible(true);
    }
}
