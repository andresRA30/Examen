
public class BicicletaMTB extends Bicicleta{
//inyeccion de dependencia
	Marcos marco;
Horquillas horquilla;
Transmisiones transmisiones;

	public BicicletaMTB(Marcos marco, Horquillas horquilla, Transmisiones transmisiones) {
	super();
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
