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
		ArrayList<Partido> listaPartidos= new ArrayList<Partido>();
		
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
				unPartido.setGolesEquipo1(Integer.parseInt(linea1[1]));
				unPartido.setGolesEquipo2(Integer.parseInt(linea1[2]));
				listaPartidos.add(unPartido);
				//Partido posicion= listaPartidos.get(0);
				//JOptionPane.showMessageDialog(null,posicion);}/*devuelve nombre del espacio de memoria*/
				}
		Pronostico unPronostico;
		
		ArrayList<Pronostico> pronosticosMaria=new ArrayList<Pronostico>();
		String archivom = "archivos\\pronosticosMaria.txt";
			for(String linea : Files.readAllLines(Paths.get(archivom))){
				String[] linea1 = linea.split(" ");
				
				unPronostico= new Pronostico();
				unEquipo1= new Equipo();
				unEquipo2= new Equipo();
				
				unEquipo1.setNombre(linea1[0]);
				unEquipo2.setNombre(linea1[2]);
				unPronostico.setEquipo1(unEquipo1);
				unPronostico.setEquipo2(unEquipo2);
				unPronostico.setResumen(linea1[1]);
				/*unPronostico.setGana1(Integer.parseInt(linea1[1]));
				unPronostico.setEmpate(Integer.parseInt(linea1[2]));
				unPronostico.setGana2(Integer.parseInt(linea1[3]));*/
				pronosticosMaria.add(unPronostico);
				
				}
		
		ArrayList<String> partidosConvert=new ArrayList<String>();
		for(int i=0;i<listaPartidos.size();i++) {
			if (listaPartidos.get(i).getGolesEquipo1()> listaPartidos.get(i).getGolesEquipo2()) {
				partidosConvert.add(i, "100");}
			else if (listaPartidos.get(i).getGolesEquipo1()< listaPartidos.get(i).getGolesEquipo2()) {
				partidosConvert.add(i, "001");}
			else if(listaPartidos.get(i).getGolesEquipo1()== listaPartidos.get(i).getGolesEquipo2()) {
				partidosConvert.add(i, "010");}
			}
		int contador=0;
		for(int i=0; i<pronosticosMaria.size(); i++) {
			if(partidosConvert.get(i).equals(pronosticosMaria.get(i).getResumen())) 
			contador++;
	}
				JOptionPane.showMessageDialog(null,"Puntaje =  "+ contador);
		
		}
		
	}
	
		


