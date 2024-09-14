package interfaces;

import entities.Funcionario;

public interface FuncionarioRepository {

	/*
	 * Métodos abstratos: são métodos que não possui corpo.
	 * são metodos que tem apenas assinaturas
	 * 
	 */
	
	void exportarDados(Funcionario funcionario);
}
