
public class ConstruirBicicletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BicicletaCarrera BC = new BicicletaCarrera(new MarcoL() , new Suspension(), new  MonoPlato());
BC.tipoDeBicicleta();
System.out.println("");
BicicletaMTB BM= new BicicletaMTB(new MarcoM() , new Fijo(), new  Biplato()); 	
BM.tipoDeBicicleta();

	}

}
