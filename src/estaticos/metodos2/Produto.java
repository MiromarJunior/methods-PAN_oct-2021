package estaticos.metodos2;

public class Produto {
	
	
	// nao precisa inicializar, vantagem não precisa instaciar quando usar
	public static int resultado(int arroz, int feijao) {
		return (arroz + feijao);
	}
	
	//tem que tornar statico para nao instanciar
	public String MudeNomeProduto(String nomeProd) {
		return (nomeProd);
	}
	
	
	//tratado
	public static String pegarCpf(String cpf) {
		String tratei = cpf.strip();
		return tratei;
	}

}
