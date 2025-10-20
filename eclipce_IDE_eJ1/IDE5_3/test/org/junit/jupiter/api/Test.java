package org.junit.jupiter.api;
import org.junit.jupiter.api.Assertions.*;

import code.jugs.basica.aritmetica.Aritmetica;


public class Test {
	boolean resultadoEsperado = true;
	boolean resultadoActual = Aritmetica.esMultiplo(15.0, 3.0);
	
//	assertEquals("sh", Aritmetica.esMultiplo(15.0, 3.0));
	AssertEquals(resultadoEsperado, resultadoActual, 
            "15.0 debería ser múltiplo de 3.0");

}
