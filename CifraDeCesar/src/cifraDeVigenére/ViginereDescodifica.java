package cifraDeVigenére;

import java.util.Scanner;

public class ViginereDescodifica {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um texto:");
		String txtoUsuario = teclado.nextLine();
		
		System.out.println("Digite uma senha:");
		String senha = teclado.nextLine();
		
		String textoCriptografado = "";
		
		//transforma os textos digitados em charArray
		char[] arrayChartxtUsuario = txtoUsuario.toCharArray();
		char[] arrayChartSenha = senha.toCharArray();
					
		
		for (int i = 0, j= 0; i < arrayChartxtUsuario.length; i++) {
			
	
			textoCriptografado += (char) (arrayChartxtUsuario[i] + arrayChartSenha[j]);
//					textoCriptografado += arrayChartxtUsuario[i];
			
			if (j == arrayChartSenha.length-1) {
				j = -1;
			}
			j++;
		}
		
		System.out.println(textoCriptografado + "");

	}

}


