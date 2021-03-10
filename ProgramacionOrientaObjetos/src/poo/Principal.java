package poo;

public class Principal {

	public static void main(String[] args) {


		Taxi t001= new Taxi();
		t001.setMarca("Nissa");
		t001.setModelo("Sentra");
		
		System.out.println("Marca  :"+t001.getMarca());
		System.out.println("Modelo  :"+t001.getModelo());
		t001.asignarApp("sI");
		
		t001.setFullEquipo(true);
		t001.setPrecio(18000);
		System.out.println("Aplicativo"+t001.Appmostrar());
		System.out.println("Precio :"+t001.getPrecio());
		
		
		

	}

}
