import java.util.List;

public class Equipo {
	
	private String nombre;
	private int puntos;
	private int victorias;
	private int derrotas;
	private int empates;
	private int golesFavor;
	private int golesContra;	
	
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		puntos = 0;
		victorias = 0;
		derrotas = 0;
		empates = 0;
		golesFavor = 0;
		golesContra = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
		
	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}

	public void calcularPuntaje(List<Resultado> resultados) {
		for(Resultado resultado: resultados) {
			if(resultado.getEquipoLocal().getNombre() == nombre) {
				if(resultado.getGolesLocal() > resultado.getGolesVisitante()) {
					puntos += 3;
					victorias++;
				} else if (resultado.getGolesLocal() == resultado.getGolesVisitante()) {
					puntos += 1;
					empates++;
				} else {
					derrotas++;
				}
				golesFavor += resultado.getGolesLocal();
				golesContra += resultado.getGolesVisitante();
			} else if(resultado.getEquipoVisitante().getNombre() == nombre) {
				if(resultado.getGolesLocal() < resultado.getGolesVisitante()) {
					puntos += 3;
					victorias++;
				} else if (resultado.getGolesLocal() == resultado.getGolesVisitante()) {
					puntos += 1;
					empates++;
				} else {
					derrotas++;
				}
				golesFavor += resultado.getGolesVisitante();
				golesContra += resultado.getGolesLocal();
			}
		}
	}
}
