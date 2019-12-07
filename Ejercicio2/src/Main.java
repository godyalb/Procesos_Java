import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Process p = null;
		
		//EJERCICIO 2
		File diretorio = new File("C:\\Users\\GODINOFERRO\\eclipse-workspace\\Procesos_Java\\LeerArgumentos\\bin");
		ProcessBuilder pb;
		
		try {
			pb = new ProcessBuilder("java", "LeerArgumentos", "pepe");
			pb.directory(diretorio);
			p = pb.start();
			System.out.println("Salida: " + p.waitFor());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
