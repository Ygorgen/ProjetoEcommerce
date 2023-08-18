package menuecm;

import java.io.IOException;
import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tenis.modelbkp.tenismodelo;
import controllersneakbkp.controllerBKPP;
import cores.Bk.cor;

public class Menu {

	 public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);
	        int opcao, modelotenis, carrinhomenu , size;
	        List<String> carrinho = new ArrayList<>();
	        controllerBKPP controller = new controllerBKPP();

		
		do {
			System.out.println(
					"************************************************************************************************");
			System.out.println("                                                     ");
			System.out.println(
					"  ██████  ███▄    █ ▓█████ ▄▄▄       ██ ▄█▀▓█████  ██▀███    ██████ ▓█████▄ ▓█████ ██▒   █▓\r\n"
							+ "▒██    ▒  ██ ▀█   █ ▓█   ▀▒████▄     ██▄█▒ ▓█   ▀ ▓██ ▒ ██▒▒██    ▒ ▒██▀ ██▌▓█   ▀▓██░   █▒\r\n"
							+ "░ ▓██▄   ▓██  ▀█ ██▒▒███  ▒██  ▀█▄  ▓███▄░ ▒███   ▓██ ░▄█ ▒░ ▓██▄   ░██   █▌▒███   ▓██  █▒░\r\n"
							+ "  ▒   ██▒▓██▒  ▐▌██▒▒▓█  ▄░██▄▄▄▄██ ▓██ █▄ ▒▓█  ▄ ▒██▀▀█▄    ▒   ██▒░▓█▄   ▌▒▓█  ▄  ▒██ █░░\r\n"
							+ "▒██████▒▒▒██░   ▓██░░▒████▒▓█   ▓██▒▒██▒ █▄░▒████▒░██▓ ▒██▒▒██████▒▒░▒████▓ ░▒████▒  ▒▀█░  \r\n"
							+ "▒ ▒▓▒ ▒ ░░ ▒░   ▒ ▒ ░░ ▒░ ░▒▒   ▓▒█░▒ ▒▒ ▓▒░░ ▒░ ░░ ▒▓ ░▒▓░▒ ▒▓▒ ▒ ░ ▒▒▓  ▒ ░░ ▒░ ░  ░ ▐░  \r\n"
							+ "░ ░▒  ░ ░░ ░░   ░ ▒░ ░ ░  ░ ▒   ▒▒ ░░ ░▒ ▒░ ░ ░  ░  ░▒ ░ ▒░░ ░▒  ░ ░ ░ ▒  ▒  ░ ░  ░  ░ ░░  \r\n"
							+ "░  ░  ░     ░   ░ ░    ░    ░   ▒   ░ ░░ ░    ░     ░░   ░ ░  ░  ░   ░ ░  ░    ░       ░░  \r\n"
							+ "      ░           ░    ░  ░     ░  ░░  ░      ░  ░   ░           ░     ░       ░  ░     ░  \r\n"
							+ "                                                                     ░                 ░  ");
			System.out.println("                                                        ");
			System.out.println(
					"************************************************************************************************");
			System.out.println("\t\t                                                    ");
			System.out.println("                                                        ");
			System.out.println(
					"************************************************************************************************");
			System.out.println("                                                          ");
			System.out.println("\n\t\t           1 - Sneakers                             ");
			System.out.println("\n\t\t           2 - Seu carrinho                         ");
			System.out.println("\n\t\t           3-  Sobre Nós                            ");
			System.out.println("\n\t\t           0 - Sair                                 ");
			System.out.println("                                                          ");
			System.out.println(
					"************************************************************************************************");
			System.out.println("\t\t          Entre com a opção desejada:               ");
			System.out.println(
					"************************************************************************************************");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(" ");
				System.out.println("\n1- GEN AeroStep ");
				System.out.println(" ");
				System.out.println("\n2- GEN IgniteFlow ");
				System.out.println(" ");
				System.out.println("\n3- GEN FusionFlex");
				System.out.println(" ");
				System.out.println("\n4- GEN HyperFlex");
				System.out.println("\nSelecione um modelo: ");
				modelotenis=leia.nextInt();

				switch (modelotenis) {
	            case 1:
	                tenismodelo aeroStep = new tenismodelo("GEN", "AeroStep", 42, 120, 780);
	                System.out.print("Informe o tamanho do tênis: ");
	                size=leia.nextInt();
	                controller.adicionarItem(aeroStep);
	                keyPress();
	                break;
	            case 2:
	                tenismodelo igniteFlow = new tenismodelo("GEN", "IgniteFlow", 43, 130, 980);
	                System.out.print("Informe o tamanho do tênis: ");
	                size=leia.nextInt();
	                controller.adicionarItem(igniteFlow);
	                keyPress();
	                break;
	            case 3:
	                tenismodelo fusionFlex = new tenismodelo("GEN", "FusionFlex", 41, 110, 1100);
	                System.out.print("Informe o tamanho do tênis: "+"do tamanho: ");
	                size=leia.nextInt();
	                
	                controller.adicionarItem(fusionFlex);
	                keyPress();
	                break;
	            case 4:
	                tenismodelo hyperFlex = new tenismodelo("GEN", "HyperFlex", 45, 140, 1400);
	                System.out.print("Informe o tamanho do tênis: ");
	                size=leia.nextInt();
	                controller.adicionarItem(hyperFlex);
	                keyPress();
	                break;
	            default:
	                System.out.println("Opção inválida.");
	                keyPress();
	                break;
	        }
				break;
	        

			case 2:
                do {
                    System.out.println("\n1- Listar itens");
                    System.out.println("\n2- Remover itens");
                    System.out.println("\n3- Concluir compra");
                    System.out.println("\n0- Voltar ao menu principal");
                    carrinhomenu = leia.nextInt();
                    switch (carrinhomenu) {
                        case 1:
                        	System.out.println("\nLista de itens no carrinho:");
                        	controller.listarItens();
                        	keyPress();
                            break;

                        case 2:
                            System.out.println("Digite o número do item que deseja remover:");
                            int itemParaRemover = leia.nextInt();
                            controller.removerItem(itemParaRemover - 1); 
                            keyPress();
                            break;

                        case 3:
                            controller.concluirCompras();
                            keyPress();
                            break;
                        case 0:
                            break;
                    }
                    
                } while (carrinhomenu != 0);
                break;
					
					
			case 3:
				System.out.println("Bem-vindo à GENSNEAKERS ! Localizada no coração da cidade de Miami há 3 anos,");
				System.out.println("somos sua escolha confiável para tênis de alta qualidade.");
				System.out.println("Oferecemos uma ampla seleção de marcas premium e edições exclusivas,");
				System.out.println("garantindo estilo e autenticidade. Junte-se à nossa comunidade");
				System.out.println("de amantes de sneakers. Conecte-se conosco: www.gensneakers.com");
				System.out.println("| @Gensneakers | Local: Rua luis java, 123, Miami, FL.");
				System.out.println("Obrigado por escolher SNEAKERS Miami!");
				keyPress();
				break;
			case 0:
				System.out.println("\nObrigado pela preferência, GenSneakersdev agradece!");
				System.out.println("\nVolte sempre ❤️");
				break;
			}

		} while (opcao != 0);

	}

	public static void keyPress() {
		System.out.println("\n\nPressione Enter para Continuar...");
		try {
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
