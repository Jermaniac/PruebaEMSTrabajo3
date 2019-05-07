package etsisi.ems.trabajo3.banco;

import java.util.Date;
import java.util.Vector;
import java.time.LocalDate;
import java.time.ZoneId;

public class CreditoC extends Credito{

	public CreditoC(Credito parametros, double credito2) {
		super(parametros.Numero, parametros.Titular, parametros.FechaDeCaducidad,0, parametros.MarcaInternacional, parametros.NombreEntidad, parametros.CCV);
		credito=credito2;
	}
	public CreditoC(Credito parametros) {
		super(parametros.Numero, parametros.Titular, parametros.FechaDeCaducidad,0, parametros.MarcaInternacional, parametros.NombreEntidad, parametros.CCV);
	}
	
	public CreditoC(Credito parametros,int tipo) {
		super(parametros.Numero, parametros.Titular, parametros.FechaDeCaducidad,0, parametros.MarcaInternacional, parametros.NombreEntidad, parametros.CCV);
		Tipo = tipo;
	}

}