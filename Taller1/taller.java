package proyecto;

import javax.swing.JOptionPane;
import proyecto.Persona;

public class taller {
	public static void main (String[]args) {
		String result="";
		String name = JOptionPane.showInputDialog("Digite su nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
		double estatura = Double.parseDouble(JOptionPane.showInputDialog("Digite su estatura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite su peso"));
		Persona persona=new Persona(name,edad,estatura,peso);
		double imc = persona.calcular(persona);
		if (imc<18.5){
			result="Bajo de peso";
		}else if(imc>=18.5 && imc <24.9){
			result="Peso Normal";
		}else if(imc>=25 && imc <29.9) {
			result="Sobrepeso";
		}else {
			result="Obesidad";
		}
		JOptionPane.showMessageDialog(null, persona.mostrarDatos(persona, imc, result));
	}
}