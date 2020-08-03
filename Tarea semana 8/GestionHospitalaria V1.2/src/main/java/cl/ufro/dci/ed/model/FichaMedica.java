package cl.ufro.dci.ed.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FichaMedica implements Comparable<FichaMedica>{

    private PersonalMedico profesionalAtendiendo;
    private String area;
    private String detalles;
    private LocalDateTime fecha;
    private String estado;

    public FichaMedica(PersonalMedico profesionalAtendiendo, String area, String detalles , LocalDateTime fecha, String estado) {
        this.profesionalAtendiendo = profesionalAtendiendo;
        this.area = area;
        this.detalles = detalles;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = fecha;
        this.estado = estado;
    }

    public PersonalMedico getProfesionalAtendiendo() {
        return profesionalAtendiendo;
    }

    public void setProfesionalAtendiendo(PersonalMedico profesionalAtendiendo) {
        this.profesionalAtendiendo = profesionalAtendiendo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(FichaMedica otraFichaMedica) {
        if(this.getFecha().compareTo(otraFichaMedica.getFecha())<0){
            return -1;
        }else if(this.getFecha().compareTo(otraFichaMedica.getFecha())>0){
            return 1;
        }
        return 0;
    }
}
