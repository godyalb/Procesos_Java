
public class ImprimirArgumentos {

	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			System.out.println("No hay argumentos");
			System.exit(-1);
		}
		else
		{
			for (int i = 0; i < 5; i++)
				System.out.println(args[0]);
			
			System.exit(1);
		}

	}

}
