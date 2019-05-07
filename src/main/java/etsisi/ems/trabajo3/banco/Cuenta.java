package etsisi.ems.trabajo3.banco;

import com.sun.istack.internal.Nullable;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;

public class Cuenta {
	protected String mNumero;
	protected String mTitular;
	protected Vector<Movimiento> mMovimientos;

	public Cuenta(String numero, String titular) {
		mNumero = numero;
		mTitular = titular;
		mMovimientos = new Vector<Movimiento>();
	}
	public void ingresar(double x) throws Exception {
		if (x <= 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		modificarDinero(x, "Ingreso en efectivo", false);
	}
	public void ingresar(String concepto, double x) throws Exception {
		if (x <= 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		modificarDinero(x, concepto, false);
	}
	public void retirar(double x) throws Exception {
		if (x <= 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		if (getSaldo() < x)
			throw new Exception("Saldo insuficiente");
		modificarDinero(x, "Retirada de efectivo", true);
	}
	public void retirar(String concepto, double x) throws Exception {
		if (x <= 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		if (getSaldo() < x)
			throw new Exception("Saldo insuficiente");
		modificarDinero(x, concepto, true);
	}

	public void modificarDinero(double x, String concepto, boolean retOIng){
		Movimiento m = new Movimiento();
		m.setConcepto(concepto);
		if (retOIng){
			m.setImporte(-x);
		}
		else{
			m.setImporte(x);
		}
		efectuarMovimiento(m);
	}
	public void efectuarMovimiento(Movimiento m){
		Date date = new Date();
		LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		m.setFecha(fecha);
		this.mMovimientos.addElement(m);
	}

	public double getSaldo() {
		double r = 0.0;
		for (int i = 0; i < this.mMovimientos.size(); i++) {
			Movimiento m = (Movimiento) mMovimientos.elementAt(i);
			r += m.getImporte();			
		}
		return r;
	}

	public void addMovimiento(Movimiento m) {
		mMovimientos.addElement(m);
	}
}