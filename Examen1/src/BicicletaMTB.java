
public class BicicletaMTB extends Bicicleta{
//composicion
	Marcos marco;
Horquillas horquilla;
Transmisiones transmisiones;

	public BicicletaMTB(Marcos marco, Horquillas horquilla, Transmisiones transmisiones) {
	super();
	//inyeccion de dependencia
	this.marco = marco;
	this.horquilla = horquilla;
	this.transmisiones = transmisiones;
	System.out.println("Bicicleta de MTB");

}

	@Override
	public void tipoDeBicicleta() {
		// TODO Auto-generated method stub
		marco.soyTipo();
		horquilla.soyTipo();
		transmisiones.soyTipo();
	}

}
