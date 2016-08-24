package Exec_11_08;


public class Cliente {
	
	private int idade;
	private String nome;
	
	public Cliente ( int idade, String nome) {
		this.idade = idade;
		this.nome=nome;	
	}
	
	public int getIdade(){
		return idade;
	}
	
	public String getNome(){
		return nome;
	}

}
