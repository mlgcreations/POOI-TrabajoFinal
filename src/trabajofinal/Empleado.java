public class Empleado {
    private String nombre;
    private String apellido;
    private long id;
    private String cargo;

  
    public Empleado(String nombre, String apellido, long id, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cargo = cargo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

  
    public void aceptarRegistro() {
        
        System.out.println("Registro de empleado aceptado.");
    }

    
    public void negarRegistro() {
        
        System.out.println("Registro de empleado negado.");
    }

   
}
