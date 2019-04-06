
public class BicicletaCarrera extends Bicicleta{
	//composicion
	Marcos marco;
	Horquillas horquilla;
	Transmisiones transmisiones;
	
	public BicicletaCarrera(Marcos marco, Horquillas horquilla, Transmisiones transmisiones) {
		//inyeccion de dependencia
		super();
		this.marco = marco;
		this.horquilla = horquilla;
		this.transmisiones = transmisiones;
		System.out.println("Bicicleta de Carrera");
	}

	@Override
	public void tipoDeBicicleta() {
		// TODO Auto-generated method stub
		marco.soyTipo();
		horquilla.soyTipo();
		transmisiones.soyTipo();
	}

}
