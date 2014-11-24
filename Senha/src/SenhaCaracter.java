import java.util.regex.Pattern;

public class SenhaCaracter extends Senha {

	private double desvioPadrao;
	private double desvioPadraoForte;
	private double desvioPadraoMedio;
	private double desvioPadraoFraco;
	private double desvioPadraoMuitoFraco;

	@Override
	protected Pattern getPatter() {
		return Pattern.compile(".??[a-z]" + ".??[A-Z]");
	}

	@Override
	protected String getNome() {
		return "caracteres minusculos e maiusculos";
	}

	@Override
	protected double getDesvioPadrao(int frequencia, String senha) {

		Estatistica estatistica = new Estatistica();
		
		char[] chars = senha.toCharArray();
		
		estatistica.setArray(chars);		
		desvioPadrao = estatistica.getDesvioPadrao();
		System.out.println(desvioPadrao);
		
		senha = new String(chars);
		
		return desvioPadrao;
	}

	@Override
	protected double getDesvioPadraoMuitoFraco() {
		return desvioPadraoMuitoFraco;
	}

	protected void setDesvioPadraoMuitoFraco(double desvioPadraoMuitoFraco) {
		this.desvioPadraoMuitoFraco = desvioPadraoMuitoFraco;
	}

	@Override
	protected double getDesvioPadraoFraco() {
		return desvioPadraoFraco;
	}

	protected void setDesvioPadraoFraco(double desvioPadraoFraco) {
		this.desvioPadraoFraco = desvioPadraoFraco;
	}

	@Override
	protected double getDesvioPadraoMedio() {
		return desvioPadraoMedio;
	}

	protected void setDesvioPadraoMedio(double desvioPadraoMedio) {
		this.desvioPadraoMedio = desvioPadraoMedio;	
	}

	@Override
	protected double getDesvioPadraoForte() {
		return desvioPadraoForte;
	}

	protected void setDesvioPadraoForte(double desvioPadraoForte) {
		this.desvioPadraoForte = desvioPadraoForte;		
	}

	@Override
	protected String getExceptionNome() {
		return ("A senha deve conter apenas caracteres: ");
	}

	@Override
	protected String getExceptionTamanho(int tamanhoInicial, int tamanhoFinal) {
		return ("A senha deve conter no minimo " + tamanhoInicial
				+ " e no maximo " + tamanhoFinal + " caracteres!");
	}
	

	

	
}
