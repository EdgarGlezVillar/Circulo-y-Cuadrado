package ObjectCreatorPckg;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Menu 
{
    private String fileName;
    private String nombre;
    private File file;
    
    
	public Menu(String nombre)
	{
		this.nombre = nombre;
		fileName = nombre+".txt";
		file = new File("C:\\Users\\Dell\\eclipse-workspace\\ObjectCreator\\src\\ObjectCreatorPckg\\Jugadores", fileName);
	
		
		if(file.exists())
		{
			System.out.println("File selected to open: " + file.getName());
			try
			{
				FileInputStream inStreamFile = new FileInputStream(file);
				DataInputStream inStreamData = new DataInputStream(inStreamFile);
				
				int juegos = inStreamData.readInt();
				int juegosGanados = inStreamData.readInt();
				
				System.out.println("Numero de veces que has jugado: "+juegos);
				System.out.println("Numero de veces que has ganado: "+juegosGanados);
				
				inStreamData.close();
				inStreamFile.close();
				
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			try 
			{
				file.createNewFile();
				System.out.println("File created and open: " + file.getName());
				FileOutputStream outStreamFile = new FileOutputStream(file);
				DataOutputStream outStreamData = new DataOutputStream(outStreamFile);
				
				int juegos = 0;
				int juegosGanados = 0;
				
				outStreamData.writeInt(juegos);
				outStreamData.writeInt(juegosGanados);
				
				outStreamData.close();
				outStreamFile.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void sumarEstadisticas(boolean ganar)
	{
		try
		{
			FileInputStream inStreamFile = new FileInputStream(file);
			DataInputStream inStreamData = new DataInputStream(inStreamFile);
			
			int juegos = inStreamData.readInt();
			int juegosGanados = inStreamData.readInt();
			
			juegos = juegos+1;
			if (ganar)
			{
				juegosGanados = juegosGanados+1;
			}
			
			inStreamData.close();
			inStreamFile.close();
			
			FileOutputStream outStreamFile = new FileOutputStream(file);
			DataOutputStream outStreamData = new DataOutputStream(outStreamFile);
			
			outStreamData.writeInt(juegos);
			outStreamData.writeInt(juegosGanados);
			
			outStreamData.close();
			outStreamFile.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
}
