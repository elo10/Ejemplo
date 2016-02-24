package ETS;

import java.util.Scanner;

public class MenuContador {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String menu = "10º Incrementar \n";
		menu = menu + "20º Decrementar \n";
		menu = menu + "30º Reset \n";
		menu = menu + "40º Salir \n";
		Contador c = new Contador();
		boolean repetir = true;
		do{
			System.out.print(menu);
			c.printContador(); 
			System.out.print("Elige una opción: ");
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
