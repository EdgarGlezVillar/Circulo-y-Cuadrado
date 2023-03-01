package ObjectCreatorPckg;

public abstract class Persona {
	protected String nombre;
	protected boolean rapido;
	protected boolean fuerte;
	protected boolean alto;
	protected boolean agil;
	
	public Persona(String nombre, boolean rapido, boolean fuerte, boolean alto, boolean agil) 
	{
		this.nombre = nombre;
		this.rapido = rapido;
		this.fuerte = fuerte;
		this.alto = alto;
		this.agil = agil;
	}
	
	public abstract String getNombre();
	public abstract boolean getRapido();
	public abstract boolean getFuerte();
	public abstract boolean getAlto();
	public abstract boolean getAgil();

}
