package ObjectCreatorPckg;

public class Atleta extends Persona{
	
	public Atleta(String nombre, boolean rapido, boolean fuerte, boolean alto, boolean agil)
	{
		super(nombre, rapido, fuerte, alto, agil);
	}
	
	public String getNombre() 
	{
		return super.nombre;
	}
	
	public boolean getRapido() 
	{
		return super.rapido;
	}
	
	public boolean getFuerte() 
	{
		return super.fuerte;
	}
	
	public boolean getAlto() 
	{
		return super.alto;
	}
	
	public boolean getAgil() 
	{

		return super.agil;
	}
	

}
