import cl.ufro.dci.ed.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.Object;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class GestionHospitalariaTest {

    private Hospital hospitalDeCarahue = new Hospital("Manuel mont 1010");
    private PersonalMedico doctorSaavedra = new PersonalMedico("7750034","Enrique","masculino",45,"Saavedra","Riffo","chilena","","Altos del maipo",1.85,90,"assaas@assas.com", situacionSentimental.CASADO,"doctor", grupoSanguineo.AP);
    private Paciente paciente1 = new Paciente("1221211", "luis", "masculino", 21, "silva", "quezada", "madre", "chilena", "mapuche", "urrutia 1050", 1.70, 70, "l.silva06@ufromail.cl", situacionSentimental.SOLTERO, "estudiante", grupoSanguineo.AP, Prevision.FONASAB);
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void prepare() throws ParseException {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        hospitalDeCarahue.agregarPersonalMedico(doctorSaavedra);
        paciente1.agregarTelefono(1111111111);
        paciente1.agregarAntecedente(new FichaMedica(doctorSaavedra,"Dentista","Extracciòn de muela", LocalDateTime.of(2020,7,7,9,0),"pendiente"));
        paciente1.agregarAntecedente(new FichaMedica(doctorSaavedra,"Dentista","Limpieza",LocalDateTime.of(2020,7,7,7,0),"pendiente"));
        paciente1.agregarAntecedente(new FichaMedica(doctorSaavedra,"Dentista","Observación de rutina",LocalDateTime.of(2020,7,7,11,0),"pendiente"));
        hospitalDeCarahue.agregarPaciente(paciente1);
    }

    @Test
    public void FichaMedicaDelMismoDiaTest() {
        FichaMedica fichaExpected = new FichaMedica(doctorSaavedra,"Dentista","Limpieza",LocalDateTime.of(2020,7,7,7,0),"pendiente");
        assertEquals(((Paciente) hospitalDeCarahue.getPacientes().get(0)).getAntecedentes().poll().getFecha(),fichaExpected.getFecha());
    }

    @Test
    public void AgregarFichaNula(){
        FichaMedica fichaVacia = null;
        paciente1.agregarAntecedente(fichaVacia);
        String expected = "No puedes agregar una ficha medica vacía";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void AgregarRutNulo(){
        Paciente pacienteSinRut = new Paciente(null,"","",0,"","","","","","",0,0,"",situacionSentimental.SOLTERO,"",grupoSanguineo.ABP,Prevision.FONASAA);
        hospitalDeCarahue.agregarPaciente(pacienteSinRut);
        String rutNoDefinido = "rut no definido";
        assertEquals(rutNoDefinido,pacienteSinRut.getRut());
    }

    @Test
    public void AgregarAntecedenteSinPersonalMedico(){
        Hospital hospitalSinPersonalMedico = new Hospital("");
        Paciente newPaciente = new Paciente(null,null,null,0,null,null,null,null,null,null,0,0,null,null,null,null,null);
        ArrayList<Persona> personalMedicoVacio = new ArrayList<>();
        hospitalSinPersonalMedico.setPersonalMedico(personalMedicoVacio);
        hospitalSinPersonalMedico.agregarPaciente(newPaciente);
        newPaciente.agregarAntecedente(null);
        String expected = "¡No puedes agregar una ficha medica si no hay medicos!";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void AgregarPacienteNulo(){
        Paciente pacienteNulo = null;
        hospitalDeCarahue.agregarPaciente(pacienteNulo);
        String expected = "No puedes agregar un paciente vacío";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void AgregarPersonalMedicoNulo(){
        PersonalMedico personalMedicoNulo = null;
        hospitalDeCarahue.agregarPersonalMedico(personalMedicoNulo);
        String expected = "No puedes agregar un personal medico vacío";
        assertEquals(expected, outContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

}
