package etsisi.ems.trabajo3.banco;

import java.util.Date;
import java.util.Vector;
import java.time.LocalDate;
import java.time.ZoneId;

public class Credito extends CreditoC{

	public Credito(String numero, String titular, LocalDate fechacaducidad, double credito2, int marcainternacional, String nombreentidad, int ccv) {
		super(numero, titular, fechacaducidad,marcainternacional, nombreentidad, ccv);
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