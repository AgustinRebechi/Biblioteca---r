public abstract class Usuario {

    private String nombre;
    private int dni;

    //constructor

    public Usuario (String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    //metodo

    public int getDni(){
        return dni;        
    }

    public abstract int getPrestamosDisponibles();

    // getter

    public String getNombre(){
        return nombre;
    }

    public int getdni(){
        return dni;
    }

    // Sobrescribir el método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Si son el mismo objeto, son iguales
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;  // Si el objeto es nulo o no es del mismo tipo
        }
        Usuario usuario = (Usuario) obj;
        return dni == usuario.dni;  // Compara solo por el DNI
    }

    // Sobrescribir el método hashCode
    @Override
    public int hashCode() {
        return Integer.hashCode(dni);  // Generar el hash code usando el DNI
    }
    
}
