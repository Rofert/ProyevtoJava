package trabajoIntegrador;

class Partido {
	Equipo equipo1;
	private Equipo equipo2;
	protected int golesEquipo1;
	protected int golesEquipo2;
	
	/*public void () { 
		equipo1 =Equipo.getNombre(null);
		equipo2 =Equipo.getNombre(null);
				}*/
	

	public void setEquipo1(Equipo equipo1) {
		this.equipo1=equipo1 ;}
	public void setEquipo2(Equipo equipo2) {
		this.equipo2=equipo2;}
	public void setgolesEquipo1(int goles1) {
		this.golesEquipo1=goles1;}
	public void setgolesEquipo2(int goles2) {
		this.golesEquipo2=goles2;}
	public Equipo getEquipo1() {
		return this.equipo1;}
	public Equipo getEquipo2(){
		return this.equipo2;}
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
		
	