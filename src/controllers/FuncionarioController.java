package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Endereco;
import entities.Funcionario;
import interfaces.FuncionarioRepository;
import repositories.FuncionarioRepositoryTxt;
import repositories.FuncionarioRepositoryXml;

public class FuncionarioController {
	/*
	 * Método para capturarmos os dados do funcionario 
	 * e exportarmos para um determinado arquivo
	 */
	public void cadastrarFuncionario() {
		//CAPTURAR OS DADOS DO FUNCIONARIO
		var funcionario = obterDadosFuncionario();
		funcionario.setEndereco(obterDadosEndereco());
		
		FuncionarioRepository funcionarioRepotory = null;
		
		//escolher o tipo de arquivo desejado!
		var tipo = JOptionPane.showInputDialog("ESCOLHA (1)TXT ou (2) XML :");
		switch(tipo) {
		case "1":
			funcionarioRepotory = new FuncionarioRepositoryTxt();
			break;
		case "2":
			funcionarioRepotory = new FuncionarioRepositoryXml();
			break;
		}
		
		funcionarioRepotory.exportarDados(funcionario);
	}
	
	/*
	 * criando um metodo para fazer a captura dos dadosa do funcionario
	 */
	private Funcionario obterDadosFuncionario() {
		var funcionario = new Funcionario();
		
		funcionario.setId(UUID.randomUUID());
		funcionario.setNome(JOptionPane.showInputDialog("INFORME O NOME DO FUNCIONÁRIO: "));
		funcionario.setCpf(JOptionPane.showInputDialog("INFORME O CPF DO FUNCIONÁRIO: "));
		funcionario.setMatricula(JOptionPane.showInputDialog("INFORME A MATRICULA DO FUNCIONÁRIO: "));
		
		return funcionario;
	}
	
	private Endereco obterDadosEndereco() {
		var endereco = new Endereco();
		
		endereco.setId(UUID.randomUUID());
		endereco.setLogradouro(JOptionPane.showInputDialog("INFORME O SEU LOGRADOURO:"));
		endereco.setNumero(JOptionPane.showInputDialog("INFORME O NUMERO:"));
		endereco.setComplemento(JOptionPane.showInputDialog("INFORME O COMPLEMENTO:"));
		endereco.setBairro(JOptionPane.showInputDialog("INFORME O SEU BAIRRO:"));
		endereco.setCidade(JOptionPane.showInputDialog("INFORME A SUA CIDADE:"));
		endereco.setEstado(JOptionPane.showInputDialog("INFORME O SEU ESTADO:"));
		endereco.setCep(JOptionPane.showInputDialog("INFORME O SEU CEP:"));
		
		return endereco;
	}
}
