package cl.ufro.dci.ed;

import cl.ufro.dci.ed.model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Hospital hospitalDeCarahue = new Hospital("Manuel mont 1010");

        PersonalMedico doctorSaavedra = new PersonalMedico("7750034","Enrique","masculino",45,"Saavedra","Riffo","chilena","","Altos del maipo",1.85,90,"assaas@assas.com",situacionSentimental.CASADO,"doctor",grupoSanguineo.AP);

        hospitalDeCarahue.agregarPersonalMedico(doctorSaavedra);

        Paciente paciente1 = new Paciente("1221211", "luis", "masculino", 21, "silva", "quezada", "madre", "chilena", "mapuche", "urrutia 1050", 1.70, 70, "l.silva06@ufromail.cl", situacionSentimental.SOLTERO, "estudiante", grupoSanguineo.AP, Prevision.FONASAB);

        paciente1.agregarTelefono(1111111111);
        paciente1.agregarAntecedente(new FichaMedica(doctorSaavedra,"Dentista","Extracciòn de muela", LocalDateTime.of(2020,7,7,9,0),"pendiente"));
        paciente1.agregarAntecedente(new FichaMedica(doctorSaavedra,"Dentista","Limpieza",LocalDateTime.of(2020,7,7,7,0),"pendiente"));
        paciente1.agregarAntecedente(new FichaMedica(doctorSaavedra,"Dentista","Observación de rutina",LocalDateTime.of(2020,7,7,11,0),"pendiente"));
        hospitalDeCarahue.agregarPaciente(paciente1);

        Paciente paciente2 = new Paciente("1221211","luis","masculino",30,"silva","quezada","madre","chilena","mapuche","urrutia 1050",1.70,70,"l.silva06@ufromail.cl", situacionSentimental.SOLTERO, "estudiante",grupoSanguineo.ABN,Prevision.FONASAC);

        paciente2.agregarTelefono(1111111111);
        paciente2.agregarAntecedente(new FichaMedica(doctorSaavedra,"Hospital de carahue","Dentista",LocalDateTime.of(2020,7,17,8,30),"realizada"));
        paciente2.agregarAntecedente(new FichaMedica(doctorSaavedra,"Hospital de carahue","Dentista",LocalDateTime.of(2020,8,10,8,30),"pendiente"));
        hospitalDeCarahue.agregarPaciente(paciente2);

        Paciente paciente3 = new Paciente(null,"luis","masculino",3,"silva","quezada","madre","chilena","mapuche","urrutia 1050",1.70,70,"l.silva06@ufromail.cl", situacionSentimental.SOLTERO, "estudiante",grupoSanguineo.BP,Prevision.ISAPRE);

        paciente3.agregarTelefono(1111111111);
        paciente3.agregarAntecedente(new FichaMedica(doctorSaavedra,"Hospital de carahue","Dentista",LocalDateTime.of(2020,2,17,9,0),"realizada"));
        paciente3.agregarAntecedente(new FichaMedica(doctorSaavedra,"Hospital de carahue","Dentista",LocalDateTime.of(2020,12,2,8,30),"pendiente"));
        hospitalDeCarahue.agregarPaciente(paciente3);

        //System.out.println(((Paciente) paciente1).getAntecedentes().poll().getFecha().getDayOfMonth());
        //System.out.println(((Paciente) paciente1).getAntecedentes().poll().getFecha().getDayOfMonth());
        //System.out.println(((Paciente) paciente1).getAntecedentes().poll().getFecha().getDayOfMonth());
        System.out.println(paciente3.getRut());
        System.out.println(paciente1.getRut());
        System.out.println(((Paciente) Hospital.pacientes.get(0)).getAntecedentes().poll().getFecha());
        System.out.println(((Paciente) Hospital.pacientes.get(0)).getAntecedentes().poll().getFecha());
        System.out.println(((Paciente) Hospital.pacientes.get(0)).getAntecedentes().poll().getFecha());

        System.out.println(((Paciente) Hospital.pacientes.get(1)).getAntecedentes().poll().getFecha());

        System.out.println(((Paciente) Hospital.pacientes.get(2)).getAntecedentes().poll().getFecha());
    }
}
