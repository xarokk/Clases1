package Clases6;

import java.io.FileInputStream;
import java.io.IOException;

public class Principal {
	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream in = null , in2 = null; 
		
		try
		{
			in = new FileInputStream("C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/Clases4/registro.txt");
			in2 = new FileInputStream("C:/Users/2b/Desktop/Dsa/Dsa.projects/Clases1/src/main/java/Clases5/Registro.txt");
			
			int NumeroBytes = in.available();
			int NumeroBytes2 = in2.available();
			if (NumeroBytes < NumeroBytes2)
			{
				System.out.print("El fichero mas grande es el del ejercicio5");
			}
			if(NumeroBytes > NumeroBytes2) 
			{
				System.out.print("El fichero mas grande es el del ejercicio4");
			}
			
		}finally
		{
			if(in != null)
			{
				in.close();
			}
			if(in2 != null)
			{
				in2.close();
			}
			
			
		}
		
	}

}
