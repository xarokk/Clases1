package upc.eetac.dsa.cartigas.Clases1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
	
	public String file_name;
	public LeerArchivo(String path)
	{
		 file_name = path;
	}
	
	BufferedReader br = null;
	int readLines() throws IOException
	{
		BufferedReader bf = null;
		//try {
		FileReader file_to_read = new FileReader(file_name);
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
	
	
	public String[] OpenFile() throws IOException
	{
		FileReader fr = new FileReader(file_name);
		br = new BufferedReader(fr);
		int NumberOfLines = readLines();
		String[] textdata = new String[NumberOfLines];
		int i;
		for(i=0;i<NumberOfLines; i++)
		{
			textdata[i] = br.readLine();
		}
		br.close();
		return textdata;
		
	}
}
