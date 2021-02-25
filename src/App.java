public class App {
	public static void main(String[] args) {
		System.out.println("Persona numero 1: ");
		Pearson p1=new Pearson("Cristina Rivera","0801-2001-03042",1.78f,20);
		p1.Datos();
		System.out.println();
		System.out.println("Persona numero 2: ");
		Pearson p2=new Pearson("Juan Alberto","0601-2000-00542",1.75f,20);
		p2.Datos();
		System.out.println();
		System.out.println("Persona numero 3: ");
		Pearson p3=new Pearson("Kimberly Raudales","0101-1999-13642",1.58f,21);
		p3.Datos();
	}
}

class Pearson{
	//Atributo
	String nombre;
	String id;
	float estatura;
	int edad;
	
	//Metodos
	public Pearson(String _nombre,String _id,float _estatura, int _edad) {
		nombre=_nombre;
		id=_id;
		estatura=_estatura;
		edad=_edad;
		
	}
	
	public void Datos() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("El numero de identidad es: "+id);
		System.out.println("La estatura es: "+estatura+"m");
		System.out.println("La edad es: "+edad);
	}
}
