package clases;

public class infoTareas {

    private String nombre_tarea;
    private String fecha;
    private String encargado;
    private String Descrip;

    public infoTareas(String nombre_tarea, String fecha, String encargado, String Descrip) {
        this.nombre_tarea = nombre_tarea;
        this.fecha = fecha;
        this.encargado = encargado;
        this.Descrip = Descrip;
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

}
