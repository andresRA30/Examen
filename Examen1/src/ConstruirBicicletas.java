
public class ConstruirBicicletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//polimorfismo
BicicletaCarrera BC = new BicicletaCarrera(new MarcoL() , new Suspension(), new  MonoPlato());
BC.tipoDeBicicleta();
System.out.println("");
BicicletaMTB BM= new BicicletaMTB(new MarcoM() , new Fijo(), new  Biplato()); 	
BM.tipoDeBicicleta();
System.out.println("");
BicicletaMTB BM1= new BicicletaMTB(new MarcoM() , new Suspension(), new  Biplato()); 	
BM1.tipoDeBicicleta();
System.out.println("");
BicicletaCarrera BC1 = new BicicletaCarrera(new MarcoL() , new Suspension(), new  Biplato());
BC1.tipoDeBicicleta();
System.out.println("");
BicicletaCarrera BC2 = new BicicletaCarrera(new MarcoL() , new Suspension(), new MonoPlato());
BC2.tipoDeBicicleta();
	}

}
