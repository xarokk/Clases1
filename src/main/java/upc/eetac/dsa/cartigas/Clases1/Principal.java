package upc.eetac.dsa.cartigas.Clases1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal 
{
	
	
	
	static String file_name= "C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/upc/eetac/dsa/cartigas/Clases1/datos.txt";
	
	
	
	
	public static void main(String[] arg) throws IOException
	{
		try
		{	LeerArchivo fleer = new LeerArchivo (file_name) ;  
			
			
			String[] aryLines = fleer.OpenFile() ;
			int i = 0;
			for (i=0; i < aryLines.length ; i++)
			{
				System.out.println( aryLines[ i ]);
			}
			
			
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
}
	
	
	

