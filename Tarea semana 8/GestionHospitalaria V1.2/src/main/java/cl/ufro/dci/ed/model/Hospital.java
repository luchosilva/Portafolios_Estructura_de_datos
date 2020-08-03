package cl.ufro.dci.ed.model;

import java.util.ArrayList;
import java.util.Optional;

public class Hospital {

    private String direccion;
    public static ArrayList<Persona> pacientes = new ArrayList<>();
    public static ArrayList<Persona> personalMedico = new ArrayList<>();

    public Hospital(String direccion) {
        this.direccion = direccion;
    }

    public void agregarPaciente (Paciente paciente){
        Optional<Paciente> pacienteOpt = Optional.ofNullable(paciente);
        if (pacienteOpt.isEmpty()) {
            System.out.print("No puedes agregar un paciente vacío");
        }else{
            pacientes.add(paciente);
        }
    }

    public void agregarPersonalMedico (PersonalMedico personalMedico){
        Optional<PersonalMedico> personalMedicoOpt = Optional.ofNullable(personalMedico);
        if (personalMedicoOpt.isEmpty()) {
            System.out.print("No puedes agregar un personal medico vacío");
        }else {
            Hospital.personalMedico.add(personalMedico);
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Persona> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Persona> pacientes) {
        Hospital.pacientes = pacientes;
    }

    public ArrayList<Persona> getPersonalMedico() {
        return personalMedico;
    }

    public void setPersonalMedico(ArrayList<Persona> personalMedico) {
        Hospital.personalMedico = personalMedico;
    }
}