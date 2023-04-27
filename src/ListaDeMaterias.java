public enum ListaDeMaterias {
    MATEMATICAS("025","Matemáticas"),
    FISICA("043","Física"),
    QUIMICA("044","Química"),
    FILOSOFIA("067","Filosofía"),
    HISTORIA("088","Historia");

    private String cod;
    private String asignatura;

    ListaDeMaterias(String cod, String asignatura) {
        this.cod = cod;
        this.asignatura = asignatura;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return cod + '\t' + asignatura;
    }
}
