package Clases2;

import java.io.IOException;

public class FileData {

	
	
	public static void main(String[] arg) throws IOException
	{
		String file_name= "C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/upc/eetac/dsa/cartigas/Clases1/datos.txt";
	try
		{
			// Se crea un objeto de la clase ReadFIle y se le pasa el nombre del archivo ,
			//luego se crea un array y se le pasa el metodo openfile definido en la otra clkase
			//cuando se ha pasado el metodo readfile, sabremos las lineas que hay en el archivo
			//Despues sera necesario llamar al metodo OpenFile
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			int i;
			for ( i=0; i < aryLines.length; i++ )
			{
			String error = new String(aryLines[i]);
			Integer x = Integer.valueOf(error);
				
				if(x<= 1000){System.out.println( aryLines[ i ] ) ;}else
				{
					break;
				}
				
				
				
			
			}
		}
	catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	
	
	}
}
