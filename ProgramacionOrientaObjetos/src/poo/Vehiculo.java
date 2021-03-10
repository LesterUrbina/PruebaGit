package poo;

public class Vehiculo {

	
	private String marca;
	private String modelo;
	private double precio;
	private boolean fullEquipo;
	
	
	public Vehiculo()
	{
		
	}
	
	public Vehiculo(String marca, String modelo, double precio, boolean fullEquipo)
	{
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
		this.fullEquipo=fullEquipo;
	}
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
	
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		
		if(fullEquipo==true)
		{
			this.precio = precio+1500;
		}
		else
		{
			this.precio=precio;
		}
		
	}

	public boolean isFullEquipo() {
		return fullEquipo;
	}

	public void setFullEquipo(boolean fullEquipo) {
		this.fullEquipo = fullEquipo;
	}
	
	
	
	
	}
