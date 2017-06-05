package Models;

import java.util.Calendar;

public class Contenedor {

	private static final Contenedor contenedor = new Contenedor();
	private Calendar horaEntrada, horaSalida, tiempoTotal;
	private ListaOrdenadaGenerica<Carrera> lista;

	private Contenedor(){};
	
	public Calendar getHoraEntrada() {
		return horaEntrada; 
		}
	
	public Calendar getHoraSalida() { 
		return horaSalida; 
		}

	public Calendar getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(Calendar tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}

	public void setHoraEntrada(Calendar horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	

	public void setHoraSalida(Calendar horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public ListaOrdenadaGenerica getLista(){
		if (lista == null)
			lista = new ListaOrdenadaGenerica<Carrera>(
					(Carrera c1, Carrera c2) -> c1.getHoraEntrada().compareTo(c2.getHoraEntrada()));
		return lista;
	}
	
	public static Contenedor getInstance() {
        return contenedor;
    }
}
