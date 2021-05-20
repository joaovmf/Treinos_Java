
package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		File file = new File("C:\\ws-eclipse\\in.txt"); // se colocar um arquivo inexistente ele vai tratar a excess�o.
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally blocked executed");
		}
	}
}