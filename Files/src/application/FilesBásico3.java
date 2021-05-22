package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilesBásico3 {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning" , "Good afternoon" , "Good night"};
		
		String path = "c:\\ws-eclipse\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //o true significa que não quero recriar o arquivo e sim adicionar conteudo. Se eu retirar o true ele irá sobrescrever o arquivo cada vez que eu rodar o programa.
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
