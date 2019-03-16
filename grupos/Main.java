import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]) {
		Equipo barcelona = new Equipo("Barcelona");
		Equipo sporting = new Equipo("Sporting CP");
		Equipo olympiacos = new Equipo("Olympiacos");
		Equipo juventus = new Equipo("Juventus");

		List<Resultado> resultados = new ArrayList<Resultado>();
		
		
		Resultado resultado1 = new Resultado(olympiacos, sporting, 2, 3);
		resultados.add(resultado1);
		Resultado resultado2 = new Resultado(barcelona, juventus, 3, 0);
		resultados.add(resultado2);
		Resultado resultado3 = new Resultado(juventus, olympiacos, 2, 0);
		resultados.add(resultado3);
		Resultado resultado4 = new Resultado(sporting, barcelona, 0, 1);
		resultados.add(resultado4);
		Resultado resultado5 = new Resultado(barcelona, olympiacos, 3, 1);
		resultados.add(resultado5);
		Resultado resultado6 = new Resultado(juventus, sporting, 2, 1);
		resultados.add(resultado6);
		Resultado resultado7 = new Resultado(olympiacos, barcelona, 0, 0);
		resultados.add(resultado7);
		Resultado resultado8 = new Resultado(sporting, juventus, 1, 1);
		resultados.add(resultado8);
		Resultado resultado9 = new Resultado(sporting, olympiacos, 3, 1);
		resultados.add(resultado9);
		Resultado resultado10 = new Resultado(juventus, barcelona, 0, 0);
		resultados.add(resultado10);
		Resultado resultado11 = new Resultado(olympiacos, juventus, 0, 2);
		resultados.add(resultado11);
		Resultado resultado12 = new Resultado(barcelona, sporting, 2, 0);
		resultados.add(resultado12);
		
		barcelona.calcularPuntaje(resultados);
		System.out.format("Equipo  Pts  GF  GC V E D%n %s  %d  %d  %d %d %d %d %n", 
				barcelona.getNombre(), barcelona.getPuntos(), barcelona.getGolesFavor(), barcelona.getGolesContra(),
				barcelona.getVictorias(), barcelona.getEmpates(), barcelona.getDerrotas());

		sporting.calcularPuntaje(resultados);
		System.out.format("Equipo  Pts  GF  GC V E D%n %s  %d  %d  %d %d %d %d %n", 
				sporting.getNombre(), sporting.getPuntos(), sporting.getGolesFavor(), sporting.getGolesContra(),
				sporting.getVictorias(), sporting.getEmpates(), sporting.getDerrotas());

		juventus.calcularPuntaje(resultados);
		System.out.format("Equipo  Pts  GF  GC V E D%n %s  %d  %d  %d %d %d %d %n", 
				juventus.getNombre(), juventus.getPuntos(), juventus.getGolesFavor(), juventus.getGolesContra(),
				juventus.getVictorias(), juventus.getEmpates(), juventus.getDerrotas());

		olympiacos.calcularPuntaje(resultados);
		System.out.format("Equipo  Pts  GF  GC V E D%n %s  %d  %d  %d %d %d %d %n", 
				olympiacos.getNombre(), olympiacos.getPuntos(), olympiacos.getGolesFavor(), olympiacos.getGolesContra(),
				olympiacos.getVictorias(), olympiacos.getEmpates(), olympiacos.getDerrotas());
		
	}
}
