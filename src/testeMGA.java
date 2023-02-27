import java.util.Scanner;

public class testeMGA {

	public static void main(String[] args) {
		
		String condicaocontinuacao = null;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Pense em um animal");
			System.out.println("O animal que você pensou vivw na agua?");
			String simnao = sc.nextLine();
			if(simnao == "sim") {
				System.out.println("O animal que você é uma baleia?");
				
				
			}
			System.out.println("n");
			
		} while(condicaocontinuacao != "nao");

	}

}
