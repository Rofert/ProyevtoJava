package trabajoIntegrador;

import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pruebass {

	public static void main(String[] args) throws HeadlessException, IOException {
		// TODO Auto-generated method stub
	Partido a= new Partido();
	Equipo b= new Equipo();
	
	a.setEquipo1(b);
	b.setNombre("pedro");
	System.out.println(a.getGolesEquipo1());}
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