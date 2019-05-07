package etsisi.ems.trabajo3.banco;

import java.util.Date;
import java.util.Vector;
import java.time.LocalDate;
import java.time.ZoneId;

public class Credito extends CreditoC{

	public Credito(CreditoC parametros, double credito2) {
		super(parametros.Numero, parametros.Titular, parametros.FechaDeCaducidad, parametros.MarcaInternacional, parametros.NombreEntidad, parametros.CCV);
		credito=credito2;
	}
	public Credito(CreditoC parametros) {
		super(parametros.Numero, parametros.Titular, parametros.FechaDeCaducidad, parametros.MarcaInternacional, parametros.NombreEntidad, parametros.CCV);
	}
	
	public Credito(CreditoC parametros,int tipo) {
		super(parametros.Numero, parametros.Titular, parametros.FechaDeCaducidad, parametros.MarcaInternacional, parametros.NombreEntidad, parametros.CCV);
		Tipo = tipo;
	}

}