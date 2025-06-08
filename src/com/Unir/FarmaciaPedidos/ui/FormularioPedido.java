package com.Unir.FarmaciaPedidos.ui;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JFrame;

public class FormularioPedido extends JFrame{

	private JTextField txtNombre, txtCantidad;
    private JComboBox<String> comboTipo;
    private JRadioButton rbtnCofarma, rbtnEmpsephar, rbtnCemefar;
    private JCheckBox chkPrincipal, chkSecundaria;
    private JButton btnBorrar, btnConfirmar;
    private ButtonGroup grupoDistribuidores;
    
    public FormularioPedido() {
        setTitle("Pedido de Medicamentos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 3, 10, 10));
        
        
        setVisible(true);
    }
    
}
