package code.jugs.basica.aritmetica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import code.jugs.basica.aritmetica.*;

class aritmeticaTest {

	@Test
	void test() {
		boolean resultadoEsperado = true;
		boolean resultadoActual = Aritmetica.esMultiplo(15.0, 3.0);
	
		assertEquals(resultadoEsperado, resultadoActual, 
	            "15.0 debería ser múltiplo de 3.0");
	}

}
