
public class ProdutoEletronico extends Produto {
	
	private String marca;
	
	public ProdutoEletronico(int codigo, String nome, float preco) {
		super(codigo, nome, preco);
		setMarca(marca);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getTipo() {
		return "Eletrônico";
	}

}
