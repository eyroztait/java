import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String autorizado;
		do {
			System.out.println("Bienvenidos al Sistema de Admisión Hospitalaria."
				+ " Antes de empezar, ¿Es usted una persona autorizada para realizar la gestión? Responda S/N");
		
			autorizado = scan.nextLine();
		}while (!(autorizado.equals("S")||autorizado.equals("s")||autorizado.equals("N")||autorizado.equals("n")));
		if (autorizado.equals("S")||autorizado.equals("s")) {
		Paciente interno = new Paciente();
		
		System.out.println("Nombre del paciente");
		Scanner scan3 = new Scanner(System.in);
		interno.nombre = scan3.nextLine();
		System.out.println("Apellido del paciente");
		Scanner scan4 = new Scanner(System.in);
		interno.apellido = scan4.nextLine();
		System.out.println("Edad del paciente");
		Scanner scan5 = new Scanner(System.in);
		interno.edad = scan5.nextInt();
		System.out.println("Dolencia del paciente");
		Scanner scan6 = new Scanner(System.in);
		interno.motivoHosp = scan6.nextLine();
		interno.datosPaciente(interno.nombre, interno.apellido, interno.edad, interno.motivoHosp);
		System.out.println();
		System.out.println("________________________________________________________________\n");
		
		Scanner scan2 = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Una vez introducido el paciente en el sistema, ¿Qué desea realizar?\n\n");
			System.out.println("***************OPCIONES*************");
			System.out.println("1. Ingresar paciente en Planta");
			System.out.println("2. Ingresar paciente en Urgencias");
			System.out.println("3. Alta del paciente");
			System.out.println("4. Salir");
		
			opcion = scan2.nextInt();
		}while(opcion<1||opcion>4);
		switch (opcion){
			case 1:{
				System.out.println("Fecha de ingreso");
				Scanner scan7 = new Scanner(System.in);
				try {
					interno.fechaIng = new SimpleDateFormat("dd/MM/yyyy").parse(scan7.nextLine());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Número de Habitación");
				Scanner scan8 = new Scanner(System.in);
				interno.habitacion = scan8.nextInt();
				interno.ingresar(interno.nombre, interno.apellido, interno.habitacion, interno.motivoHosp, interno.fechaIng);
				break;
		}
			case 2:{
				System.out.println("Fecha de ingreso");
				Scanner scan8 = new Scanner(System.in);
				try {
					interno.fechaIng = new SimpleDateFormat("dd/MM/yyyy").parse(scan8.nextLine());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Número de Box");
				Scanner scan9 = new Scanner(System.in);
				interno.box = scan9.nextInt();
				interno.ingresar(interno.nombre, interno.apellido, interno.motivoHosp, interno.fechaIng, interno.box);
				break;
	}
			case 3:{
				System.out.println("Fecha de alta");
				Scanner scan10 = new Scanner(System.in);
				try {
					interno.fechaAlta = new SimpleDateFormat("dd/MM/yyyy").parse(scan10.nextLine());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				interno.alta(interno.nombre, interno.apellido, interno.fechaAlta);
				break;
}
			case 4:{
				System.exit(0);
			}
				
}
} else {
	System.out.println("No estás autorizado. Por favor, contacta con una persona autorizada.");
}
		
}
}