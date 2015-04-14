
public class Triangulo {
	private int[] lados; 
	
	public Triangulo(int l1, int l2, int l3) throws Exception {
		if(verificarExistencia(l1, l2, l3) ==true){
			lados= new int[3];
			lados[0]= l1;
			lados[1]= l2;
			lados[2]= l3;	
		}
		else
			throw new Exception("Con los lados dados no se puede formar un triángulo.");
	}
	
	public Triangulo(int[] lados) throws Exception {
			this(lados[0],lados[1],lados[2]);
	}
	
	private boolean verificarExistencia(int l1, int l2, int l3){
		if((l1 + l2 > l3) && (l1+l3>l2) &&(l2+l3>l1)) //teorema de la desilgualdad del triangulo
			return true;
		else
			return false;
	}

	public String getType() { 
		if(lados[0]== lados[1] && lados[1]==lados[2]) //verifico si todos los lados son iguales (no hace falta lados[0]==lados[2], por regla del sandwich)  
			return "Equilátero";
		else if(lados[0]== lados[1] || lados[1]== lados[2] || lados[0]== lados[2]) //verifico que por lo menos dos lados sean iguales
			return "Isósceles";
		else 
			return "Escaleno";
	}
}
