package entrega1;


import java.time.LocalDateTime;

import org.uqbar.geodds.Point;

public class ParadaDeColectivo extends StrategyPOI {

	//CONSTRUCTOR
	
	public ParadaDeColectivo(Point miUbicacion, Comuna comuna8) {
		super(miUbicacion, comuna8);
		this.instanciarRangoDeAtencionDeColectivo();
	}
	
	private RangoDeAtencion rangoDeAtencion;
	
	//METODOS
	
	@Override
	public double cercaniaRequerida(){
		return 100.0;
	}
	
	public boolean estaDisponible(LocalDateTime unTiempo){
		return true;
	}
	
	private void instanciarRangoDeAtencionDeColectivo(){
		double horaDeApertura 		= 0.0;
		double horaDeCierre			= 23.0;
		int diaDeInicioDeAtencion 	= 1;
		int diaDeFinDeAtencion		= 7;
		RangoDeAtencion rangoDeAtencionDeColectivos = new RangoDeAtencion(horaDeApertura,horaDeCierre,diaDeInicioDeAtencion,diaDeFinDeAtencion);
		this.setRangoDeAtencion(rangoDeAtencionDeColectivos);
	}
	

	public RangoDeAtencion getRangoDeAtencion() {
		return rangoDeAtencion;
	}

	public void setRangoDeAtencion(RangoDeAtencion rangoDeAtencion) {
		this.rangoDeAtencion = rangoDeAtencion;
	}
	

		
}
