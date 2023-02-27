import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomeA[] = new String[10];
		String falaA[] = new String[10];
		String simnao = "x";
		int condicao = 0;
		int contador = 0;
		
		do {
			System.out.println("Pense em um animal");
			System.out.println("O animal vive no mar?");
			simnao = sc.nextLine();

			if(simnao.equals("sim")) {
				System.out.println("Acertei!");
			}
			
			
			if(simnao.equals("nao")) {
				System.out.println("Qual animal você pensou ?");
				nomeA[contador] = sc.nextLine();
				System.out.println("Um %s______ mas um(a) baleia".formatted(nomeA[contador]));
				falaA[contador] = sc.nextLine();
				
			}
			
			System.out.println("Quer continuar jogando ?");
			simnao = sc.nextLine();
			if(simnao.equals("sim")) {
				do {
					System.out.println("Pense em um animal");
					System.out.println("O animal que você pensou %s?".formatted(falaA[contador]));
					simnao = sc.nextLine();
					if(simnao.equals("sim")) {
						System.out.println("O animal é um %s?".formatted(nomeA[contador]));
						simnao = sc.nextLine();
						if(simnao.equals("sim"))
							System.out.println("Acertei!!");
						if(simnao.equals("nao"));

					}
					if(simnao.equals("nao")) {
						contador++;
						System.out.println("Qual animal você pensou ?");
						nomeA[contador] = sc.nextLine();
						System.out.println("Um(a) %s _____ mas uma baleia".formatted(nomeA[contador]));
						falaA[contador] = sc.nextLine();
						
					}
					
					System.out.println("Quer continuar jogando?");
					simnao = sc.nextLine();
					if(simnao.equals("sim"));
					if(simnao.equals("nao")) {
						condicao = 1;
					}
					
				} while(condicao == 0);
			}
				
			
			
			
			
		
		}while(condicao == 0);
		


	}

}
