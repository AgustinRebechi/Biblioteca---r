public class Libro {

    private String titulo;
    private String autor;
    private boolean esUnico;
    private boolean estado;

    //Constructor

    public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = true;
        this.esUnico = true;
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
        Libro libro = (Libro) obj;
        return titulo == libro.titulo;  // Compara solo por el DNI
    }

    //setter
    public void yaNoEsUnico(){
        this.esUnico = false;
    }

    public void estaPrestado(){
        this.estado = false;
    }

    public void estaDisponible(){
        this.estado = true;
    }

    // getter
    public boolean getEstado(){
        return estado;        
    }

    public boolean getEsUnico(){
        return esUnico;
    }

    public String getTitulo() {
        return titulo;
    }

}
