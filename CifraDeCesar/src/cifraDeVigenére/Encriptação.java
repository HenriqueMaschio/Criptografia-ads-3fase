package cifraDeVigenére;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Encriptação {
	
	public static void main(String[] args) throws IOException {
			Scanner teclado = new Scanner(System.in);
	
			
			//  File f = new File(D:Aluno//Henrique//Teste.txt)	
			
			System.out.println("Digite um testo");
			String textoUsuario = teclado.nextLine();
			System.out.println("Digite uma senha");
			String senha = teclado.nextLine();
			
			String textoCriptografado = "";
			
			
			char[] arrayChartxt = textoUsuario.toCharArray();
			char[] arrayCharsen = senha.toCharArray();
			
			
			
			
			for(int i = 0, j = 0; i < arrayChartxt.length; i++) {
				
				textoCriptografado += (char) (arrayChartxt[i] + arrayCharsen[j]);
//	textoCriptografado += arrayChartxt[i];
			
			 if(j == arrayCharsen.length-1) {
				 j = -1;
			 }
			 j++;
	}	 
		
			File f = new File("D:\\Aluno\\Henrique\\Teste.txt");
			FileOutputStream fout = new FileOutputStream(f);
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.writeBytes(textoCriptografado);
		}

	


}
