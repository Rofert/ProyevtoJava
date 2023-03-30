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
		ArrayList<Pronostico> pronosticosMariana=new ArrayList<Pronostico>();
		String archivop = "archivos\\pronosticosMaria";
			for(String linea : Files.readAllLines(Paths.get(archivop))){
				String[] linea1 = linea.split(" ");
				JOptionPane.showMessageDialog(null, linea1[0]);
	}

}}
