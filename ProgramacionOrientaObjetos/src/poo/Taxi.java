package poo;

public class Taxi extends Vehiculo {
	
	private boolean app;
	
	Taxi(boolean app)
	{
		super();
		this.app=app;
	}
	
	Taxi()
	{
		
	}
	

	
	
	public void asignarApp(String siOno)
	{
		if(siOno.equalsIgnoreCase("si"))
		{
			app=true;
			
		}
		else
		{
			app=false;
		}
		
	}
	
	public String Appmostrar()
	{
		if(app==true)
		{
			return "Aplicativo : SI";
		}else
		{
			return "Aplicativo : NO";
		}
	}
	
	
	

}
