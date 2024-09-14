package principal;

import controllers.FuncionarioController;

public class Main {

	public static void main(String[] args) {
		// criar uma variavel de instancia pro controlador
		
		var funcionarioController = new FuncionarioController();
		funcionarioController.cadastrarFuncionario();

	}

}
