package Exceptions;

public interface Calculator {
	double add(double a, double b);

	double sub(double a, double b);

	double div(double a, double b) throws Exception;
}
