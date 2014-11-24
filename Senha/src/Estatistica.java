import java.util.Arrays;

public class Estatistica {

	private char array[];

	public double getPearson() {

		return (getDesvioPadrao() / getMediaAritmetica()) * 100;

	}

	public double getMediaAritmetica() {

		double total = 0;

		for (int counter = 0; counter < array.length; counter++)

			total += array[counter];

		return total / array.length;

	}

	public double getSomaDosElementos() {

		double total = 0;

		for (int counter = 0; counter < array.length; counter++)

			total += array[counter];

		return total;

	}

	public double getSomaDosElementosAoQuadrado() {

		double total = 0;

		for (int counter = 0; counter < array.length; counter++)

			total += Math.pow(array[counter], 2);

		return total;

	}

	public double getMediaAritmetica(double array[]) {

		double total = 0;

		for (int counter = 0; counter < array.length; counter++)

			total += array[counter];

		return total / array.length;

	}

	public double getSomaDosElementos(double array[]) {

		double total = 0;

		for (int counter = 0; counter < array.length; counter++)

			total += array[counter];

		return total;

	}

	public void ordenar() {

		Arrays.sort(array);

	}

	public void imprimeArray() {

		System.out.print("\nElementos do Array: ");

		for (int count = 0; count < array.length; count++)

			System.out.print(array[count] + " ");

	}

	public double getVariancia() {

		double p1 = 1 / Double.valueOf(array.length - 1);

		double p2 = getSomaDosElementosAoQuadrado()

		- (Math.pow(getSomaDosElementos(), 2) / Double

		.valueOf(array.length));

		return p1 * p2;

	}

	public double getDesvioPadrao() {

		return Math.sqrt(getVariancia());

	}

	public double getMediana() {

		this.ordenar();

		int tipo = array.length % 2;

		if (tipo == 1) {

			return array[((array.length + 1) / 2) - 1];

		} else {

			int m = array.length / 2;

			return (array[m - 1] + array[m]) / 2;

		}

	}

	public void setArray(char[] array) {

		this.array = array;

	}

}