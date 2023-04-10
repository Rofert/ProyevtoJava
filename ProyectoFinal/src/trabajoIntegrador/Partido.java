package trabajoIntegrador;

class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	//private String nombre= equipo1.getNombre();;//SE HICIERON CAMBIOS ACA Y DA ERROR
	


	public void setEquipo1(Equipo equipo1) {
		this.equipo1=equipo1 ;}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2=equipo2;}
	public void setGolesEquipo1(int goles1) {
		this.golesEquipo1=goles1;}
	public void setGolesEquipo2(int goles2) {
		this.golesEquipo2=goles2;}
	public Equipo getEquipo1(){
		return this.equipo1;}
	public Equipo getEquipo2(){
		return this.equipo2;}
	public int getGolesEquipo1() {
			return  this.golesEquipo1;}
	public int getGolesEquipo2() {
		return  this.golesEquipo2;}
	//public String getNombre(){ //Y ACA
		//return this.nombre;}
}
	/*public void setEquipo1(Equipo equipo1,int goles1) {
	this.equipo1=equipo1 ;
	this.golesEquipo1=goles1;}
	public void setEquipo2(Equipo equipo2, int goles2) {
	this.equipo2=equipo2;
	this.golesEquipo2=goles2;}	
		public void resultado(Partido nroPartido){
		if(golesEquipo1<golesEquipo2) {
		return 10;*/
		
	