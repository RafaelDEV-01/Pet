package Encapsulamento;

public class Pet {
	private String nome;
	private String raca;
	private String padrinho;
	private String nomeDono;
	private String tipo;
	private int idade;
	private String cor;
	private boolean vacina;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPadrinho() {
		return padrinho;
	}
	public void setPadrinho(String padrinho) {
		this.padrinho = padrinho;
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	 public void vacinar() {
	        if (!vacina) {
	            vacina = true;
	            System.out.printf("%s foi vacinado!",getNome());
	        } else {
	            System.out.printf("%s já foi vacinado!",getNome());
	        }
	    }
	 public void status() {
	        if (vacina) {
	            System.out.printf("%s está vacinado!",getNome());
	        } else {
	            System.out.printf("%s não está vacinado!",getNome());
	        }
	    }
	}