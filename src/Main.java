
import java.util.Date;



import negocio.Medico;
import negocio.Paciente;
import negocio.Director;
public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Director d = new Director();
		//Paciente p = new Paciente();
		Medico m = new Medico();
		//System.out.print(p.buscarHoraAps(1, new Date("01/01/1987 00:00:00"), new Date("01/01/2016 00:00:00")));
		//System.out.print(d.obtenerPacientesMasAtendidos(new Date("1987/01/01 00:00:00"), new Date("2016/01/31 23:00:00")));
		//System.out.print(m.buscarSuDisponibilidadHora(1, new Date("1987/01/01 00:00:00"), new Date("2016/01/31 23:00:00")));
		System.out.print(m.buscarSuDisponibilidadHora(1, new Date("1987/01/01 00:00:00"), new Date("2016/01/31 23:00:00")));
	}
}
