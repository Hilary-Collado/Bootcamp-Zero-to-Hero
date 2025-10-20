package code.jugs.basica.tiempo;
import static code.jugs.basica.aritmetica.Aritmetica.esMultiplo;
public class AñoUtils {
	public static boolean esAñoBisiesto(int año) {
		return esMultiplo(año, 4) && (esMultiplo(año, 400) || !esMultiplo(año, 100));
	}

}
