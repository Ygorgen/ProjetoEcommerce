package tenis.modelbkp;

public class tenismodelo {
	private String marca;
	private String modelo;
	private int tamanho;
	private float preço;
	private float valortotal;

	public tenismodelo(String marca, String modelo, int tamanho, float preço, float valortotal) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.preço = preço;
		this.valortotal=valortotal;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public float getValortotal() {
		return valortotal;
	}

	public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}

	public void visualizar() {
		System.out.println("Detalhes do Tênis:");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Preço: $" + preço);
	}

}
