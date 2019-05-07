package etsisi.ems.trabajo3.banco;

import java.util.Date;
import java.util.Vector;
import java.time.LocalDate;
import java.time.ZoneId;

public class CreditoC extends Credito{
	
	
	public CreditoC(String numero, String titular, LocalDate fechacaducidad, double credito, int marcainternacional, String nombreentidad, int ccv) {
		super(numero,titular,fechacaducidad,marcainternacional,nombreentidad,ccv);
		mCredito = credito;
	}
	
}


