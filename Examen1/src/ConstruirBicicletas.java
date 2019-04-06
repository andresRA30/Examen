
public class ConstruirBicicletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BicicletaCarrera BC = new BicicletaCarrera(new MarcoL() , new Suspension(), new  MonoPlato());
BicicletaMTB BM= new BicicletaMTB(new MarcoL() , new Suspension(), new  MonoPlato()); 	
BC.tipoDeBicicleta();
BM.tipoDeBicicleta();

	}

}
