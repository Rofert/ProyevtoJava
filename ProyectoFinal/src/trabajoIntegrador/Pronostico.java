package trabajoIntegrador;

public class Pronostico {
	private	Equipo equipo1;
	private Equipo equipo2;
  /*int		ganaEquipo1;
	int		empate;
	int		ganaEquipo2;*/
	private String resumen;

	public void setEquipo1(Equipo equipo1){
		this.equipo1=equipo1;}
	public void setEquipo2(Equipo equipo2){
		this.equipo2=equipo2;}
	/*int setGana1(int ganaEquipo1) {
		return this.ganaEquipo1= ganaEquipo1;}
	int setGana2(int ganaEquipo2) {
		return this.ganaEquipo2= ganaEquipo2;}
	int setEmpate(int empate) {
		return this.empate= empate;} no se que flashee acá pero
		no lo borro por las dudas*/
	public void setResumen(String pronost) {
		this.resumen=pronost;}
	public String getResumen() {
		return this.resumen;}
	}
