import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Boletin {
    public static void main(String[] args) {
        // Fecha actual
        System.out.println(fechaHoy());

        // Creación de Scanner
        Scanner entrada = new Scanner(System.in);

        // Obtención de datos del alumno
        System.out.println("Introduce los datos del alumno:");
        System.out.println("Nombre completo: ");
        String nombre = entrada.nextLine();
        System.out.println("Dirección: ");
        String direccion = entrada.nextLine();
        System.out.println("Contacto: ");
        String contacto = entrada.nextLine();
        System.out.println("Grupo: ");
        String grupo = entrada.nextLine();
        Alumno alumno = new Alumno(nombre,direccion,contacto,grupo);
        System.out.println(alumno.toString());

        // Asignar notas por asignatura
        System.out.println("Introduce la nota obtenida por el alumno en las siguientes asignaturas: ");
        System.out.println("Matemáticas: ");
        double notaMatematicas = entrada.nextDouble();
        System.out.println("Física: ");
        double notaFisica = entrada.nextDouble();
        System.out.println("Química: ");
        double notaQuimica = entrada.nextDouble();
        System.out.println("Filosofía: ");
        double notaFilosofia = entrada.nextDouble();
        System.out.println("Historia: ");
        double notaHistoria = entrada.nextDouble();

        // Calificación según nota
        System.out.println("Matemáticas: " + notaMatematicas + " " + notaCalificada(notaMatematicas));
        System.out.println("Física: " + notaFisica + " " + notaCalificada(notaFisica));
        System.out.println("Química: " + notaQuimica + " " + notaCalificada(notaQuimica));
        System.out.println("Filosofía: " + notaFilosofia + " " + notaCalificada(notaFilosofia));
        System.out.println("Historia: " + notaHistoria + " " + notaCalificada(notaHistoria));


        // Obtención de la nota media
        double notaMedia = (notaMatematicas + notaFisica + notaQuimica + notaFilosofia + notaHistoria)/5;

        System.out.println(".........................................");

        // Impresión del boletín

        System.out.println("\n");
        System.out.println("Centro de Enseñanzas Tecnológicas");
        System.out.println("Marqués de Cubas, 45 - 37001 Salamanca");
        System.out.println("Tel.923 22 55 66 - contacto@cet.es");
        System.out.println("\n");
        System.out.println("\t\t\t" + "Boletín de Calificaciones Trimestral");
        System.out.println("\n");
        System.out.println(alumno.toString());
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t" + "Salamanca, a " + fechaHoy());
        System.out.println("\n");
        System.out.println("\t\t\t" + "CALIFICACIONES");
        System.out.println("Cod" + '\t' + "Asignatura" + "\t\t" + "Nota" + '\t' + "Calificación");
        System.out.println(ListaDeMaterias.MATEMATICAS.toString() + "\t\t" + notaMatematicas + "\t\t" + notaCalificada(notaMatematicas));
        System.out.println(ListaDeMaterias.FISICA.toString() + "\t\t\t" + notaFisica + "\t\t" + notaCalificada(notaFisica));
        System.out.println(ListaDeMaterias.QUIMICA.toString() + "\t\t\t" + notaQuimica + "\t\t" + notaCalificada(notaQuimica));
        System.out.println(ListaDeMaterias.FILOSOFIA.toString() + "\t\t" + notaFilosofia + "\t\t" + notaCalificada(notaFilosofia));
        System.out.println(ListaDeMaterias.HISTORIA.toString() + "\t\t" + notaHistoria + "\t\t" + notaCalificada(notaHistoria));
        System.out.println("\t\t\t\t\t\t\t\t" + "Nota media: " + String.format("%.1f",notaMedia));
        System.out.println("\t\t\t\t\t\t\t\t" + "Calificación: " + notaCalificada(notaMedia));
    }

    public static String fechaHoy(){
        DateFormat formato = new SimpleDateFormat("dd MMMMMMMMMM yyyy");
        String fecha = formato.format(new Date());
        return fecha;
    }

    public static String notaCalificada(double nota){
        String calificacion;
        if (nota < 5){
            calificacion = ("Suspenso");
        } else if (nota < 7) {
            calificacion = ("Aprobado");
        } else if (nota < 9) {
            calificacion = "Notable";
        } else if (nota < 10) {
            calificacion = ("Sobresaliente");
        } else {
            calificacion = ("Matricula de honor");
        }
        return calificacion;
    }

}
