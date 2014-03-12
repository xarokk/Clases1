package Clases5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream in = null;
		//FileOutputStream out = null;
		
		
		try 
		{
			in = new FileInputStream("C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/Clases5/backflip1.jpg") ;
			
		File File2 = new File("C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/Clases5/Registro.txt");
		FileWriter fw = new FileWriter(File2.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		int NumeroBytes = in.available();
		bw.write("el numero de bytes es "+ NumeroBytes+  "\n");
		System.out.println("Se ha escrito correctamente el fichero ==> el numero de bytes es "+ NumeroBytes+  "\n");
		in.close();
		bw.close();
		
		
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
