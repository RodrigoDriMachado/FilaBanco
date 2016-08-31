package Exec_11_08;


public class Cliente implements Comparable<Cliente>{
	
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
	
	@Override
	 public int compareTo(Cliente o) {
	  int comparisonOutcome = ((String)o.getNome()).compareTo((String)this.getNome());
	     if(comparisonOutcome == 1 || comparisonOutcome == -1){
	         return comparisonOutcome;
	     }else{ 
	         return 0; 
	     }
	 }

}


