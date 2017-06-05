package Models;

import java.util.Calendar;

public class Vehiculo {
	
	private String Matricula;
	private Calendar horaEntrada, horaBajada;

	public Vehiculo(Calendar horaEntrada, Calendar horaBajada, String matricula) {
		super();
		this.horaEntrada = horaEntrada;
		this.horaBajada = horaBajada;
		Matricula = matricula;
	}
	
	public Calendar getHoraEntrada() {
		return horaEntrada;
	}
	
	public Calendar getHoraBajada() {
		return horaBajada;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	

}
