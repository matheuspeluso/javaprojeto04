package entities;

import java.util.UUID;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Setter //gera setters automatico
@Getter //gera getters automatico 
@NoArgsConstructor // gera o construtor sem argumento
@AllArgsConstructor // gera o construtor com todos argumentos

public class Funcionario {

	private UUID id;
	private String nome;
	private String cpf;
	private String matricula;
	private Endereco endereco;

}
