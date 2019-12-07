
public class LeerArgumentos {

	public static void main(String[] args) {
		
		boolean dec=false;
		if(args.length == 0)
			System.exit(1);
		else if(args.length == 1)
		{
			if(args[0].length()==1 && !Character.isDigit(args[0].charAt(0)))
				System.exit(0);
			
			for (int i = 0; i < args[0].length(); i++) 
			{
				if(!Character.isDigit(args[0].charAt(i)) && args[0].charAt(i) != '.')
					System.exit(2);
				else if(args[0].charAt(i) == '.' && !dec)
					dec = true;
				else if(args[0].charAt(i) == '.' && dec)
					System.exit(2);	
			}
			
			if(dec)
				System.exit(0);
			else
				System.exit(3);
		}
		else
			System.exit(0);

	}

}
