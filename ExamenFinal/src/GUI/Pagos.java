package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Models.Carrera;
import Models.Contenedor;
import Models.Controlador;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pagos extends JFrame {

	private JPanel contentPane;
	private Controlador controlador;
	private JTextField txhorainicio;
	private JTextField txhorafin;
	private JTextField textField;
	private JTextField txtiempo;
	private JButton bparar;
	private JButton bpagar;
	private Calendar horaInicio, horaFin, tiempoTotal;
	private float preciototal;
	
	/**
	 * Create the frame.
	 */
	public Pagos(Controlador controlador) {
		this.controlador=controlador;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Entrada vehiculo");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(10, 33, 155, 68);
		contentPane.add(btnNewButton);
		
		bparar = new JButton("Pago y salida\r\n del vehiculo");
		
		bparar.setFont(new Font("Tahoma", Font.BOLD, 11));
		bparar.setBounds(175, 33, 177, 70);
		contentPane.add(bparar);
		
		JButton btnNewButton_2 = new JButton("Caja dia");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(374, 34, 144, 68);
		contentPane.add(btnNewButton_2);
		
		txhorainicio = new JTextField();
		txhorainicio.setBounds(22, 181, 141, 52);
		contentPane.add(txhorainicio);
		txhorainicio.setColumns(10);
		
		txhorafin = new JTextField();
		txhorafin.setBounds(199, 181, 141, 52);
		contentPane.add(txhorafin);
		txhorafin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hora inicio");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(51, 133, 85, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hora fin");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(232, 137, 73, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tiempo ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(412, 140, 94, 19);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(381, 181, 137, 52);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Importe");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(50, 279, 73, 19);
		contentPane.add(lblNewLabel_3);
		
		txtiempo = new JTextField();
		txtiempo.setBounds(22, 309, 114, 31);
		contentPane.add(txtiempo);
		txtiempo.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(199, 263, 141, 77);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(382, 263, 136, 77);
		contentPane.add(panel_1);
		
		bpagar = new JButton("Pagar y salir del parking");
		
		
		bpagar.setBounds(175, 390, 193, 52);
		contentPane.add(bpagar);
	}
	@Override
	public void setVisible(boolean b) {
		horaInicio =Calendar.getInstance();
		txhorainicio.setText(horaInicio.get(Calendar.HOUR_OF_DAY) + ":" + horaInicio.get(Calendar.MINUTE) + ":" + 
				horaInicio.get(Calendar.SECOND));
		super.setVisible(b);
	}
	
	public void adaptadores(){
		bparar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				horaFin = Calendar.getInstance();
				tiempoTotal = Calendar.getInstance();
				txhorafin.setText(horaFin.get(Calendar.HOUR_OF_DAY) + ":" + horaFin.get(Calendar.MINUTE) + ":" + 
						horaFin.get(Calendar.SECOND));
				
				Date d = new Date(horaFin.getTimeInMillis() - horaInicio.getTimeInMillis());
				
				tiempoTotal.setTime(d);
				
				textField.setText((tiempoTotal.get(Calendar.HOUR_OF_DAY)-1) + ":" + tiempoTotal.get(Calendar.MINUTE) + ":" + 
						tiempoTotal.get(Calendar.SECOND));
				bparar.setEnabled(true);
			}
		});
		
		bpagar.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unchecked")
			@Override
			public void mousePressed(MouseEvent e) {
				Carrera carrera = new Carrera(Contenedor.getInstance().getHoraEntrada(), 
						Contenedor.getInstance().getHoraSalida(), preciototal);
				Contenedor.getInstance().getLista().add(carrera);
				setVisible(false);
				controlador.mostrarinicio(true);
			}
		});
		
		
	}
	
}
