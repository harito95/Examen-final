package Models;

import java.util.Calendar;

public class Carrera {
	
	private Calendar horaEntrada, horaBajada;
	private float precioTotal;
	
	public Carrera(Calendar horaEntrada, Calendar horaBajada, float precioTotal) {
		this.horaEntrada = horaEntrada;
		this.horaBajada = horaBajada;
		this.precioTotal = precioTotal;
	}
	
	public Calendar getHoraEntrada() {
		return horaEntrada;
	}
	
	public Calendar getHoraBajada() {
		return horaBajada;
	}
	
	public float getPrecioTotal() {
		return precioTotal;
	}

}
