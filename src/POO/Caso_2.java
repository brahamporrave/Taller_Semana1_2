package POO;

//caso 2: Persona

public class Persona {
	
	 private String nombre, apellido;
	 private int dni,edad;
	 
	 public Persona(String nombre,String apellido,int dni, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.apellido = apellido;
	        this.dni = dni;
	    }
	 
	 public void mostrarDatos() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Apellido: " + apellido);
	        System.out.println("DNI: " + dni);
	        System.out.println("Edad: " + edad);
	        System.out.println("----------------------");
	 }
	 public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    
	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public int getDni() {
	        return dni;
	    }

	    public void setDni(int dni) {
	        this.dni = dni;
	    }

}
