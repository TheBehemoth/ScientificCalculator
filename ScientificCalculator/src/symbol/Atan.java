package symbol;

import java.math.BigDecimal;

import parser.Token;

/**
 * @author Santisco
 * @version 1.0
 * atan的种别码为29
 */
public class Atan extends Token {

	String value;

	public Atan() {
		type = 29;
		value = "arctan";
	}

	public int getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public double get_value() {
		double d = 0.0;
		return d;
	}

	public void set_value(double t) {
		t = t + 1;
	}
	public void set_value(BigDecimal t)
	{
		;
	}
}
