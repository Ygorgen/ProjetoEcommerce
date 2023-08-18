package controllersneakbkp;

import java.util.ArrayList;
import java.util.List;

import repositorysneakbkp.repooosneakbkp;
import tenis.modelbkp.tenismodelo;

public class controllerBKPP implements repooosneakbkp {

	private List<tenismodelo> carrinho = new ArrayList<>();

	@Override
	public void listarItens() {
		 int contador = 1;
		    for (tenismodelo tenis : carrinho) {
		        System.out.println(contador + "- " + "Marca: " + tenis.getMarca() + ", Modelo: " + tenis.getModelo() + " Tamanho: " + tenis.getTamanho());
		        contador++;
		    }
	}

	@Override
	public void removerItem(int itemIndex) {
	    if (itemIndex >= 0 && itemIndex < carrinho.size()) {
	        tenismodelo itemRemovido = carrinho.remove(itemIndex);
	        System.out.println("Item removido do carrinho: " + itemRemovido.getMarca() + " " + itemRemovido.getModelo()+"Tamanho: "+itemRemovido.getTamanho());
	    } else {
	        System.out.println("Índice de item inválido.");
	    }
	}

	@Override
	public void concluirCompras() {
	    System.out.println("Compra concluída. Obrigado por comprar conosco!");
	    carrinho.clear(); 
	}

	public void adicionarItem(tenismodelo tenis) {
        carrinho.add(tenis);
        System.out.println("Item adicionado ao carrinho: " + tenis.getMarca() + " " + tenis.getModelo());
    
}
}

