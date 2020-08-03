package cl.ufro.dci.ed.model;

import java.util.*;

public class Paciente extends Persona{

    private static int id = 1;
    private int idPaciente;
    private PriorityQueue<FichaMedica> antecedentes;
    private grupoSanguineo grupoSanguineo;
    private Prevision prevision;

    /**
     *
     * Constructor principal de la clase Paciente.
     * @param rut - String con el rut del paciente.
     * @param nombre - String con el nombre del paciente.
     * @param sexo - String con el sexo del paciente.
     * @param edad - int con la edad del paciente.
     * @param apellidoPaterno - String con el apellido paterno del paciente.
     * @param apellidoMaterno - String con el apellido materno del paciente.
     * @param representanteLegal - String con el nombre del representante legal del paciente
     * @param nacionalidad - String con la nacionalidad del paciente
     * @param etnia - String con la etnia del paciente
     * @param direccion - String con la direccion del paciente
     * @param estatura - double con la estatura del paciente
     * @param peso - double con el peso del paciente
     * @param email - String con el email del paciente
     * @param situacionSentimental - Enum con la situacion sentimental del paciente
     * @param ocupacion - String con la ocupacion del paciente
     * @param grupoSanguineo - Enum con el grupo sanguineo del paciente
     * @param prevision - Objeto con la prevision de salud del paciente
     */
    public Paciente(String rut, String nombre, String sexo, int edad, String apellidoPaterno, String apellidoMaterno, String representanteLegal, String nacionalidad, String etnia, String direccion, double estatura, double peso, String email, situacionSentimental situacionSentimental, String ocupacion, grupoSanguineo grupoSanguineo, Prevision prevision) {
        super(Optional.of(Optional.ofNullable(rut).orElse("rut no definido")).get(), nombre, sexo, edad, apellidoPaterno, apellidoMaterno, representanteLegal, nacionalidad, etnia, direccion, estatura, peso, email, situacionSentimental, ocupacion);
        this.antecedentes = new PriorityQueue<>();
        this.grupoSanguineo = grupoSanguineo;
        this.prevision = prevision;
        this.idPaciente = Paciente.id++;
    }

    public void agregarAntecedente(FichaMedica fichaMedica){
        Optional<FichaMedica> ficha = Optional.ofNullable(fichaMedica);
        if(Hospital.personalMedico.isEmpty()){
            System.out.print("¡No puedes agregar una ficha medica si no hay medicos!");
        }else {
            if (ficha.isEmpty()) {
                System.out.print("No puedes agregar una ficha medica vacía");
            }else{
                this.antecedentes.add(fichaMedica);
            }
        }
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public String getSexo() {
        return super.getSexo();
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }

    @Override
    public String getApellidoPaterno() {
        return super.getApellidoPaterno();
    }

    @Override
    public void setApellidoPaterno(String apellidoPaterno) {
        super.setApellidoPaterno(apellidoPaterno);
    }

    @Override
    public String getApellidoMaterno() {
        return super.getApellidoMaterno();
    }

    @Override
    public void setApellidoMaterno(String apellidoMaterno) {
        super.setApellidoMaterno(apellidoMaterno);
    }

    @Override
    public String getRepresentanteLegal() {
        return super.getRepresentanteLegal();
    }

    @Override
    public void setRepresentanteLegal(String representanteLegal) {
        super.setRepresentanteLegal(representanteLegal);
    }

    @Override
    public String getNacionalidad() {
        return super.getNacionalidad();
    }

    @Override
    public void setNacionalidad(String nacionalidad) {
        super.setNacionalidad(nacionalidad);
    }

    @Override
    public String getEtnia() {
        return super.getEtnia();
    }

    @Override
    public void setEtnia(String etnia) {
        super.setEtnia(etnia);
    }

    @Override
    public void agregarTelefono(int telefono) {
        super.agregarTelefono(telefono);
    }

    @Override
    public ArrayList<Integer> getTelefonos() {
        return super.getTelefonos();
    }

    @Override
    public void setTelefonos(ArrayList<Integer> telefonos) {
        super.setTelefonos(telefonos);
    }

    @Override
    public String getOcupacion() {
        return super.getOcupacion();
    }

    @Override
    public void setOcupacion(String ocupacion) {
        super.setOcupacion(ocupacion);
    }

    public Prevision getPrevision() {
        return prevision;
    }

    public void setPrevision(Prevision prevision) {
        this.prevision = prevision;
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(double peso) {
        super.setPeso(peso);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public situacionSentimental getSituacionSentimental() {
        return super.getSituacionSentimental();
    }

    @Override
    public void setSituacionSentimental(situacionSentimental situacionSentimental) {
        super.setSituacionSentimental(situacionSentimental);
    }

    @Override
    public double getEstatura() {
        return super.getEstatura();
    }

    @Override
    public void setEstatura(double estatura) {
        super.setEstatura(estatura);
    }

    public grupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(grupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String getRut() {
        return super.getRut();
    }

    @Override
    public void setRut(String rut) {
        super.setRut(rut);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    public PriorityQueue<FichaMedica> getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(PriorityQueue<FichaMedica> antecedentes) {
        this.antecedentes = antecedentes;
    }

}