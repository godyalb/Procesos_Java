import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Process p = null;

		//EJERCICIO 3
		File diretorio = new File("C:\\Users\\GODINOFERRO\\eclipse-workspace\\Procesos_Java\\ImprimirArgumentos\\bin");
		ProcessBuilder pb;
		
		System.out.println("Introduzca una cadena: ");
		try {
			pb = new ProcessBuilder("java", "ImprimirArgumentos", entrada.nextLine());
			pb.directory(diretorio);
			p = pb.start();
			InputStream is = p.getInputStream();
			int car;
			while ((car = is.read()) != -1)
				System.out.print((char) car);
			is.close();
			System.out.println("Salida: " + p.waitFor());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
