package contador;

public class Contador {
    private static int contador = 0;
    
    private int id;
    
    // Constructor
    public Contador() {
        contador++;  // Incrementa el contador cada vez que se crea un objeto
        this.id = contador;  // Asigna un ID único basado en el contador
        System.out.println("✓ Objeto Contador #" + id + " creado. Total objetos: " + contador);
    }
    
    // Método estático para obtener el número total de objetos creados
    public static int getContador() {
        return contador;
    }
    
    public int getId() {
        return id;
    }
    
    public static void mostrarTotalObjetos() {
        System.out.println(" TOTAL DE OBJETOS CREADOS: " + contador);
    }
}