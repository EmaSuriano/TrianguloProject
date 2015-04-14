import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	public static String PATH_IN= "src/data.in";
	
	public static void main(String[] args) {
		Triangulo triangulo= leerArch(PATH_IN);
		System.out.println("prueba de comentario");
		System.out.println(triangulo.getType());
	}

	private static Triangulo leerArch(String path){
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			archivo = new File(path);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			int[] ladosArch= new int[3];
			for (int i = 0; i < 3; i++) 
				ladosArch[i]= Integer.valueOf(br.readLine());
			return new Triangulo(ladosArch);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
}
