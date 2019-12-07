
public class LeerNombre {

	public static void main(String[] args) {
		
		if(args.length==1)
		{
			System.out.println("Hola "+args[0]);
			System.exit(1);
		}		
		else{
			System.out.println("No hay argumentos");
			System.exit(-1);
		}
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Saludos: "+entrada.next());*/

	}

}
