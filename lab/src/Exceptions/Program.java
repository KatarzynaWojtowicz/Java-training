package Exceptions;

public class Program implements Calculator {
	@Override
	public double add(double a, double b) {
		double result = a + b;
		return result;
	}

	@Override
	public double sub(double a, double b) {
		double result = a - b;
		return result;
	}

	@Override
	public double div(double a, double b) throws Exception {
		if (b == 0) {
			throw new DivideByZeroException();
		} else {
			double result = a / b;
			return result;
		}
	}
}