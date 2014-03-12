package Clases4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
	
	public static void main (String[] arg) throws IOException
	{
		String file_name = "C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/Clases4/data.txt"; 
		
		File file2 = new File("C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/Clases4/registro.txt");
		FileWriter fw = new FileWriter (file2.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		int longitud = 0;
		
		LeerArchivo file = new LeerArchivo(file_name);
		String[] aryLines = file.AbrirArchivo();
		String Caracteres = null ; 

		int i;
		for (i=0; i< aryLines.length ; i++)
		{
			System.out.println(aryLines[i]);
			Caracteres = aryLines[i];
			longitud = longitud + Caracteres.length();
			
		}
		System.out.println("la longitud es :"+ longitud);
		String longitud2 = Integer.toString(longitud);
		bw.write("La longitud es : " + longitud2 + " y la fecha es : " + date + "  del archivo Data.txt \n " );
		bw.close();
	}

}
