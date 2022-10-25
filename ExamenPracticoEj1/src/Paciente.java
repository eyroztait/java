import java.util.Date;

public class Paciente {

	String nombre;
	String apellido;
	int edad;
	int habitacion;
	int box;
	String motivoHosp;
	Date fechaIng;
	Date fechaAlta;
	
public void datosPaciente(String nombre, String apellido, int edad, String motivoHosp) {
		
		System.out.println("El paciente "+ nombre+" "+apellido+" con edad "+edad+ " años ha sido registrado en nuestro sistema con la siguiente dolencia: "+motivoHosp);
}
	
	public void ingresar(String nombre, String apellido, int habitacion, String motivoHosp, Date fechaIng) {
		
		System.out.println("El paciente "+ nombre+" "+apellido+" ha ingresado el día "+fechaIng.getDate()+"/"+(fechaIng.getMonth()+1)+"/"+(fechaIng.getYear()+1900)+" en la habitación "+habitacion+" por el motivo "+motivoHosp);
	}
	
	public void ingresar(String nombre, String apellido, String motivoHosp, Date fechaIng, int box) {
		
		System.out.println("El paciente "+ nombre+" "+apellido+" ha ingresado en Urgencias el día "+fechaIng.getDate()+"/"+(fechaIng.getMonth()+1)+"/"+(fechaIng.getYear()+1900)+" en el box "+box+" por el motivo "+motivoHosp);
	}
	
	public void alta (String nombre, String apellido, Date fechaAlta) {
		
		System.out.println("El paciente "+ nombre+" "+apellido+" ha sido dado de alta en fecha "+fechaAlta.getDate()+"/"+(fechaAlta.getMonth()+1)+"/"+(fechaAlta.getYear()+1900)+".");
		}
}
