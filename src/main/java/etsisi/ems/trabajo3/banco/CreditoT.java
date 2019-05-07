package etsisi.ems.trabajo3.banco;

import java.util.Date;
import java.util.Vector;
import java.time.LocalDate;
import java.time.ZoneId;

public class CreditoT extends Credito{
	
	public CreditoT(String numero, String titular, LocalDate fechacaducidad, int tipo, int marcainternacional, String nombreentidad, int ccv) {
		super(numero,titular,fechacaducidad,0,marcainternacional,nombreentidad,ccv);
		mTipo = tipo;
	}

}
