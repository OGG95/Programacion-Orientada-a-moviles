package proyecto;

public class Persona {
	String nombre;
	int edad;
	double estatura,peso;
	
	public Persona() {
		
	}
	public Persona (String nombre, int edad, double estatura, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
	}
	
	public double calcular(Persona persona) {
		double calculo = persona.peso/(Math.pow(persona.estatura,2));
		return calculo;
	}
	public String mostrarDatos(Persona persona,double imc, String t){
        String datos="El paciente: "+persona.nombre+"\n"
        		+"De edad "+persona.edad+"\n"
        		+"De peso"+persona.peso+"\n"
        		+"De estatura "+persona.estatura+"\n"
        		+ "Tiene un IMC de "+imc+"\n"
        		+ "estas en "+t;
        
        return datos;
}
}
