package Models;



import GUI.Login;
import GUI.Pagos;

public class Controlador {

	private Login ventanacarga;
	private Pagos ventanapagos;
	
	public Controlador(){
		ventanacarga=new Login(this);
		mostrarinicio(true);
	}
	
	public void mostrarinicio(boolean visible){
		if(ventanacarga==null)
			ventanacarga= new Login(this);
		ventanacarga.setVisible(visible);
		}
	
	public void mostrarpagos(boolean visible){
		if(ventanapagos==null)
			ventanapagos= new Pagos(this);
		ventanapagos.setVisible(visible);
	}
	
}
