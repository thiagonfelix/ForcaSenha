import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Classe abstrata
 */
public abstract class Senha {
	
	public enum Forca {MuitoFraca, Fraca, Media, Forte,MuitoForte }
	

	
	private Forca forcaSenha;
	private Pattern patter = this.getPatter();
	private Matcher matcher;
	private int frequencia;
	private int tamanhoInicial;
	private int tamanhoFinal;
	private Double desvioPadrao;

	public int getTamanhoInicial() {
		return tamanhoInicial;
	}

	public void setTamanhoInicial(int tamanhoInicial) {
		this.tamanhoInicial = tamanhoInicial;
	}

	public int getTamanhoFinal() {
		return tamanhoFinal;
	}

	public void setTamanhoFinal(int tamanhoFinal) {
		this.tamanhoFinal = tamanhoFinal;
	}

	protected Forca testaSenha(String senha) {

		matcher = patter.matcher(senha);

		while (matcher.find()) {

			frequencia++;

		}

		if (senha.length() > tamanhoFinal || senha.length() < tamanhoInicial) {
			
			throw new Exception(this.getExceptionTamanho(tamanhoInicial, tamanhoFinal));

		} else if (senha.length() != frequencia) {

			throw new Exception (this.getExceptionNome() + this.getNome());

		} else {

			desvioPadrao = this.getDesvioPadrao(frequencia, senha);
		}

		if (desvioPadrao < this.getDesvioPadraoMuitoFraco()) {
			forcaSenha = Forca.MuitoFraca;
		} else if (desvioPadrao > this.getDesvioPadraoMuitoFraco()
				&& desvioPadrao <= this.getDesvioPadraoFraco()) {
			forcaSenha = Forca.Fraca;
		} else if (desvioPadrao > this.getDesvioPadraoFraco()
				&& desvioPadrao <= this.getDesvioPadraoMedio()) {
			forcaSenha = Forca.Media;
		} else if (desvioPadrao > this.getDesvioPadraoMedio()
				&& desvioPadrao <= this.getDesvioPadraoForte()) {
			forcaSenha = Forca.Forte;
		} else if (desvioPadrao > this.getDesvioPadraoForte()) {
			forcaSenha = Forca.MuitoForte;
		}

		return forcaSenha;
	}

	protected abstract String getExceptionNome();
	
	protected abstract String getExceptionTamanho(int tamanhoInicial2, int tamanhoFinal2);
	
	protected abstract double getDesvioPadrao(int frequencia2, String senha);

	protected abstract String getNome();

	protected abstract Pattern getPatter();

	protected abstract double getDesvioPadraoMuitoFraco();

	protected abstract double getDesvioPadraoFraco();

	protected abstract double getDesvioPadraoMedio();

	protected abstract double getDesvioPadraoForte();

	protected abstract void setDesvioPadraoMuitoFraco(double getDesvioPadraoMuitoFraco);

	protected abstract void setDesvioPadraoFraco(double getDesvioPadraoFraco);

	protected abstract void setDesvioPadraoMedio(double getDesvioPadraoMedio);

	protected abstract void setDesvioPadraoForte(double getDesvioPadraoForte);
	

}
