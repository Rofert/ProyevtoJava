package trabajoIntegrador;
import javax.swing.JOptionPane;

import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class ProgramaPrincipal {

	public static void main(String[] args) throws NumberFormatException, HeadlessException, IOException{
		ArrayList<Partido> listaPartidos=new ArrayList<Partido>();
		
		Partido unPartido;
		Equipo  unEquipo1;
		Equipo  unEquipo2;
		
		String archivo = "archivos\\resultados.txt";
				for (String linea : Files.readAllLines(Paths.get(archivo))){
					String[] linea1 = linea.split(" ");
					
				unPartido=new Partido();//hacer el getPartido y lo mismo en Equipo**
				unEquipo1=new Equipo();
				unEquipo2=new Equipo();
				
				unEquipo1.setNombre(linea1[0]);
				unEquipo2.setNombre(linea1[3]);
				
				unPartido.setEquipo1(unEquipo1);
				unPartido.setEquipo2(unEquipo2);
				unPartido.setgolesEquipo1(Integer.parseInt(linea1[1]));
				unPartido.setgolesEquipo2(Integer.parseInt(linea1[2]));
				listaPartidos.add(unPartido);
				JOptionPane.showMessageDialog(null,unPartido.equipo1);}/*aparece nombre del espacio de memoria*/
		
		Pronostico unPronostico;
		
		ArrayList<Pronostico> pronosticosMaria=new ArrayList<Pronostico>();
		String archivom = "archivos\\pronosticosMaria.txt";
			for(String linea : Files.readAllLines(Paths.get(archivom))){
				String[] linea1 = linea.split(" ");
				
				unPronostico= new Pronostico();
				unEquipo1= new Equipo();
				unEquipo2= new Equipo();
				
				unEquipo1.setNombre(linea1[0]);
				unEquipo2.setNombre(linea1[3]);
				unPronostico.setEquipo1(unEquipo1);
				unPronostico.setEquipo2(unEquipo2);
				unPronostico.setGana1(Integer.parseInt(linea1[1]));
				unPronostico.setEmpate(Integer.parseInt(linea1[2]));
				unPronostico.setGana2(Integer.parseInt(linea1[3]));
				pronosticosMaria.add(unPronostico);
				}
			ArrayList<Pronostico> pronosticosPedro=new ArrayList<Pronostico>();
			String archivop = "archivos\\pronosticosPedro.txt";
				for(String linea : Files.readAllLines(Paths.get(archivop))){
					String[] linea1 = linea.split(" ");
					
					unPronostico= new Pronostico();
					unEquipo1= new Equipo();
					unEquipo2= new Equipo();
					
					unEquipo1.setNombre(linea1[0]);
					unEquipo2.setNombre(linea1[3]);
					unPronostico.setEquipo1(unEquipo1);
					unPronostico.setEquipo2(unEquipo2);
					unPronostico.setGana1(Integer.parseInt(linea1[1]));
					unPronostico.setEmpate(Integer.parseInt(linea1[2]));
					unPronostico.setGana2(Integer.parseInt(linea1[3]));
					pronosticosMaria.add(unPronostico);
					}
		}
}

