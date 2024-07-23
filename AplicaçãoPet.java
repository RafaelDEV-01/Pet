package Encapsulamento;

public class AplicacaoPet extends Pet {

	public static void main(String[] args) {
		Pet c1 = new Pet();
		c1.setTipo("Cacharro");
		System.out.printf("Espécie do Pet: %s",c1.getTipo());
		System.out.println();
		c1.setRaca("Rottweiler");
		System.out.printf("Raça do Pet: %s",c1.getRaca());
		System.out.println();
		c1.setCor("Preto/Marrom");
		System.out.printf("Cor do Pet: %s",c1.getCor());
		System.out.println();
		c1.setIdade(8);
		System.out.printf("Idade do Pet: %s",c1.getIdade());
		System.out.println();
		c1.setNome("Rex");
		System.out.printf("Nome do Pet: %s",c1.getNome());
		System.out.println();
		c1.setNomeDono("Roberto");
		System.out.printf("Dono do Pet: %s",c1.getNomeDono());
		System.out.println();
		c1.setPadrinho("Romero");
		System.out.printf("Padrinho do Pet: %s",c1.getPadrinho());
		System.out.println();

		c1.status();
		System.out.println();
		c1.vacinar();
		System.out.println();
		c1.status();
		System.out.println();
		c1.vacinar();
	}

}
