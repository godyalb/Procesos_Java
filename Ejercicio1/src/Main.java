import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Process p = null;
		
		//EJERCICIO 1
		File diretorio = new File("C:\\Users\\GODINOFERRO\\eclipse-workspace\\Procesos_Java\\LeerNombre\\bin");
		ProcessBuilder pb;
		try 
		{
			pb = new ProcessBuilder("java","LeerNombre");
			pb.directory(diretorio);
			p = pb.start();
			InputStream is = p.getInputStream();
			int car;
			while((car = is.read())!=-1)
				System.out.print((char) car);
			is.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		try 
		{
			int salida = p.waitFor();
			System.out.println("Salida: "+salida);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
