public class Main {

	public static void main(String[] args) {
		
		String senha = "09";		
		
		
		Senha todos = new SenhaTodosCaracteres();
		Senha numeros = new SenhaNumeros();
		Senha minusculo = new SenhaCaracterMinusculo();
		Senha maiusculo = new SenhaCaracterMaiusculo();
		Senha caracter = new SenhaCaracter();
		Senha caracterEspecial = new SenhaCaracterEspecial();
		
		todos.setTamanhoInicial(2);
		todos.setTamanhoFinal(5);
		
		numeros.setTamanhoInicial(2);
		numeros.setTamanhoFinal(10);
		
		minusculo.setTamanhoInicial(10);
		minusculo.setTamanhoFinal(20);
		
		maiusculo.setTamanhoInicial(20);
		maiusculo.setTamanhoFinal(20);
		
		caracter.setTamanhoInicial(5);
		caracter.setTamanhoFinal(15);
		
		caracterEspecial.setTamanhoInicial(5);
		caracterEspecial.setTamanhoFinal(15);
		
		numeros.setDesvioPadraoMuitoFraco(1);
		numeros.setDesvioPadraoFraco(3);
		numeros.setDesvioPadraoMedio(5);
		numeros.setDesvioPadraoForte(8);
		
		
		if (numeros.testaSenha("sdsada").equals("")) {
			
		} else if (todos.testaSenha("sdsada").equals("média")) {
			
		}
		
		System.out.println(todos.testaSenha(senha));
		System.out.println(numeros.testaSenha(senha));
		System.out.println(minusculo.testaSenha(senha));
		System.out.println(maiusculo.testaSenha(senha));
		System.out.println(caracter.testaSenha(senha));
		System.out.println(caracterEspecial.testaSenha(senha));
				
		

	}

}
