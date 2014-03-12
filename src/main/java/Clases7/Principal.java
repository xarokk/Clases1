package Clases7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal 
{
	public static void main (String[] args )
	{
		Dato d = new Dato();
		d.atributo1 = 1;
		d.atributo2 = "Manolo";
		d.atributo3 = 'M';
		try
		{
			FileOutputStream guardar = new FileOutputStream("C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/Clases7/Serializable.ser ",true);
			ObjectOutputStream out = new ObjectOutputStream(guardar);
			out.writeObject(d);
			out.close();
			guardar.close();
			System.out.print("Se ha serializado el objeto \n   ....................\n ");
			
		}catch(Exception i)
		{
			i.printStackTrace();
		}
		
		Dato k= null;
		try
		{
			FileInputStream ArchivoaLeer = new FileInputStream ("C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/Clases7/Serializable.ser") ; 
			ObjectInputStream in = new ObjectInputStream(ArchivoaLeer);
			
			//preguntar esta notacion
			k = (Dato) in.readObject();
			in.close();
			ArchivoaLeer.close();
		}catch(Exception i)
		{
			i.printStackTrace();
		}
		
		System.out.print("Objeto deszerializado \n");
		System.out.print("el primer atributo es : " + k.atributo1 + "\n");
		System.out.print("el segundo atributo es : " + k.atributo2+ "\n");
		System.out.print("el tercer atributo es : " + k.atributo3+ "\n");
		
	}
	
	
	
}
