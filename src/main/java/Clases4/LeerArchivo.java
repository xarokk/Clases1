package Clases4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class LeerArchivo {

	//indico que archivo leer
	private String path ;
	public LeerArchivo(String fpath)
	{
		path = fpath;
		
	}
	//asi se las lineas que hay en el texto
	int LeerLineas()  throws IOException
	{
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		int numberOfLines = 0 ;
		String aLine;
		while ((aLine = bf.readLine()) != null)
		{
			numberOfLines++;
		}
		bf.close();
		return numberOfLines;
		
	}

	public String[] AbrirArchivo() throws IOException
	{
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		//Asigno las lineas a partir de el metodo de arriba
		int numberOfLines = LeerLineas();
		String[] textData = new String[numberOfLines];
		int i;
		for (i=0; i< numberOfLines ; i++)
		{
			textData[i] = textReader.readLine();
			String error = new String(textData[i]);
			
		}
		textReader.close( );
		
		return textData;
		
	}
	/*
public  EscribirArchivo(OutputStream regis,int longitud)
{
	
}   */
}
