package br.senai.dev.detalhes_ip.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class telaIp {

	private JLabel lblTitle;
    private JTextField txtOctate1;
    private JTextField txtOctate2;
    private JTextField txtOctate3;
    private JTextField txtOctate4;
    private JTextField txtOctate5;
    private JLabel lblPonto1;
    private JLabel lblPonto2;
    private JLabel lblPonto3;
    private JLabel lblTraco;
    private JButton btnDetalhes;
    

    public void criarCalculoIp() {
        JFrame tela = new JFrame("Detalhes IP");
        tela.setSize(400, 300);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null); 

        JLabel lblTitle = new JLabel();
        lblTitle.setText("Endereço IP");
        lblTitle.setBounds(160, 0, 100, 60);
        tela.getContentPane().add(lblTitle); 
		
        txtOctate1 = new JTextField();
        	txtOctate1.setBounds(15, 70, 55, 35);
        	txtOctate1.setHorizontalAlignment(JTextField.CENTER);
        tela.getContentPane().add(txtOctate1); 
        
        JLabel lblPonto1 = new JLabel();
        lblPonto1.setText(".");
        lblPonto1.setBounds(80, 70, 100, 40);
        tela.getContentPane().add(lblPonto1); 
                
	    txtOctate2 = new JTextField();
	    	txtOctate2.setBounds(95, 70, 55, 35);
	    	txtOctate2.setHorizontalAlignment(JTextField.CENTER);
	    tela.getContentPane().add(txtOctate2);   
	    
	    JLabel lblPonto2 = new JLabel();
	    lblPonto2.setText(".");
	    lblPonto2.setBounds(160, 70, 100, 40);
	    tela.getContentPane().add(lblPonto2); 
        
	    txtOctate3 = new JTextField();
		txtOctate3.setBounds(175, 70, 55, 35);
		txtOctate3.setHorizontalAlignment(JTextField.CENTER);
		tela.getContentPane().add(txtOctate3);   
		
	    JLabel lblPonto3 = new JLabel();
	    lblPonto3.setText(".");
	    lblPonto3.setBounds(240, 70, 100, 40);
	    tela.getContentPane().add(lblPonto3); 
	        
		txtOctate4 = new JTextField();
		txtOctate4.setBounds(255, 70, 55, 35);
		txtOctate4.setHorizontalAlignment(JTextField.CENTER);
		tela.getContentPane().add(txtOctate4);   
		
	    JLabel lblTraco = new JLabel();
	    lblTraco.setText("/");
	    lblTraco.setBounds(320, 70, 100, 40);
	    tela.getContentPane().add(lblTraco); 
	        
		txtOctate5 = new JTextField();
		txtOctate5.setBounds(335, 70, 35, 35);
		txtOctate5.setHorizontalAlignment(JTextField.CENTER);
		tela.getContentPane().add(txtOctate5);   
		
		JButton btnDetalhes = new JButton();
		btnDetalhes.setText("Mostrar detalhes do IP");
		btnDetalhes.setBounds(80, 130, 220, 30);
		tela.getContentPane().add(btnDetalhes);   
		
        
        tela.setVisible(true);
 
    }
}

