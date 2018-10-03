package cifraDeCesar;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Criptografia {

	public static void main(String[] args) throws IOException {
		
//  File f = new File(D:Aluno//Henrique//Teste.txt)	
		
		System.out.println("Digite um testo");
		Scanner teclado = new Scanner(System.in);
		
		String textoUsuario = teclado.nextLine();
		String textoConvertido = textoUsuario.toUpperCase();
		
		char[] arrayChar = textoConvertido.toCharArray();
		String textoCriptografado = "";
		
		for(int i = 0; i<arrayChar.length; i++) {
			arrayChar[i] = (char) (arrayChar[i] -10);
			textoCriptografado += arrayChar[i];
		}
		
	
		File f = new File("D:\\Aluno\\Henrique\\Teste.txt");
		FileOutputStream fout = new FileOutputStream(f);
		DataOutputStream dout = new DataOutputStream(fout);
		
		dout.writeBytes(textoCriptografado);
	}

}

