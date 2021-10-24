package estaticos.metodos2;

public class Programa {
	
	public static void main(String[] args) {
		Produto p = new Produto();
		
		System.out.println(Produto.resultado(10, 50));
		System.out.println(p.MudeNomeProduto("Arroz"));
		System.out.println(Produto.pegarCpf("   001.616.371.   08 "));
	}

}
