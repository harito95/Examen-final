package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import Models.Controlador;
import Models.Vehiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends JFrame {

	private JFrame frame;
	private JTextField txMatricula;
	private JButton bentrada;
	private JButton bpago;
	private JButton bcaja;
	private JButton bregistrar;
	private Controlador controlador;


	public Login(Controlador controlador) {
		this.controlador = controlador;
		getContentPane().setLayout(null);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bentrada = new JButton("Entrada del vehiculo");
		
		bentrada.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bentrada.setBounds(22, 12, 165, 102);
		getContentPane().add(bentrada);
		
		bpago = new JButton("Pago y salida del vehiculo");
		bpago.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bpago.setBounds(208, 12, 174, 102);
		getContentPane().add(bpago);
		
		bcaja = new JButton("Caja del dia");
		bcaja.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bcaja.setBounds(414, 12, 182, 102);
		getContentPane().add(bcaja);
		
		txMatricula = new JTextField();
		txMatricula.setBounds(197, 182, 250, 117);
		getContentPane().add(txMatricula);
		txMatricula.setColumns(10);
		
		JLabel lmatricula = new JLabel("Matricula:");
		lmatricula.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lmatricula.setBounds(34, 208, 120, 61);
		getContentPane().add(lmatricula);
		
		bregistrar = new JButton("Registrar");
		
		bregistrar.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bregistrar.setBounds(197, 325, 250, 102);
		getContentPane().add(bregistrar);
		
		adaptadores();
	}
	
	

	public void adaptadores(){
	
	
	bregistrar.addMouseListener(new MouseAdapter() {
		@Override
		public void mousePressed(MouseEvent e) {
				setVisible(false);
				controlador.mostrarpagos(true);
			}
	});
		
}
}
