public class Alumno {
    private String nombre;
    private String direccion;
    private String contacto;
    private String grupo;

    public Alumno(String nombre, String direccion, String contacto, String grupo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "ALUMNO: " + '\n' +
                "Nombre: " + nombre + '\n' +
                "Dirección: " + direccion + '\n' +
                "Contacto: " + contacto + '\n' +
                "Grupo: " + grupo + '\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}
