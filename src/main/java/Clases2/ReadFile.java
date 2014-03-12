package Clases2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	private String path;
	public ReadFile(String file_path)
	{
		
		path = file_path;
		
	}
	//metodo para saber el numero de lineas
	
	//no entiendo esta declaracion
	
	int readLines() throws IOException
	{
		BufferedReader bf = null;
		//try {
		FileReader file_to_read = new FileReader(path);
		bf = new BufferedReader (file_to_read);
		String aLine;
		int numberOfLines = 0;
		while ((aLine = bf.readLine()) != null)
		{
			numberOfLines++;
		}
		try{
			bf.close();
		}catch(Exception e)

		{
			System.out.println("No se puede cerrar el archivo");
			
			    e.printStackTrace();

		}
		return numberOfLines;
		//}catch(Exception e){}finally{ bf.close();  return -1;}
	}
	//metodo para abrir el archivo y leer lo que hay dentro
	public String[] OpenFile() throws IOException
	{
		
	//en path esta la ruta del archivo
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		//antes de leer las lineas es necesario poner un array
		int numberOfLines = readLines();
		String[] textData = new String[numberOfLines];
		int i;
		for (i=0; i< numberOfLines ; i++)
		{
			textData[i] = textReader.readLine();
			String error = new String(textData[i]);
			
			try
			{
				Integer x = Integer.valueOf(error);
				if(x >= 1000)
				{ throw new BigNumberException() ;}
				
			}catch(Exception e)
			{
				e.getMessage();
			}	
		}
		
		
		textReader.close( );
		
		return textData;
		
		
		
		
		
	}
	
	
}
