package ETS;

import java.util.Scanner;

public class MenuContador {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String menu = "1� Incrementar \n";
		menu = menu + "2� Decrementar \n";
		menu = menu + "3� Reset \n";
		menu = menu + "4� Salir \n";
		Contador c = new Contador();
		boolean repetir = true;
		do{
			System.out.println(menu);
			c.printContador(); 
			System.out.print("Elige una opci�n: ");
			int opt = teclado.nextInt();
			
			if(opt==1){
				c.incrementar();
			}else
				if(opt==2){
					c.decrementar();	
				}else
					if(opt == 3)
						c.reset();
					else
						if (opt == 4)
							repetir = false;
					
		}while(repetir);
		
		teclado.close();
	}
}
