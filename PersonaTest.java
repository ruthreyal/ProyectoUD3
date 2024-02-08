package es.iessoterohernandez.daw.endes.TestUnitarioUD3;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PersonaTest 
{
	
	@Test
	public void testPesoIdeal() {
		Persona p = new Persona("Juan",45,'H',80,1.80);
		int resultado = p.calcularIMC();
		assertEquals(Persona.PESO_IDEAL,resultado);
		
	}
	
	@Test
	public void testInfrapeso() {
		Persona p = new Persona("Juan",45,'H',20,1.80);
		int resultado = p.calcularIMC();
		assertEquals(Persona.INFRAPESO,resultado);
		
	}
	
	@Test
	public void testSobrePeso() {
		Persona p = new Persona("Juan",45,'H',150,1.80);
		int resultado = p.calcularIMC();
		assertEquals(Persona.SOBREPESO,resultado);
		
	}

	@Test 
	public void testMayorEdad() {
		Persona p= new Persona("Pepe", 45,'H');
		boolean resultado = p.esMayorDeEdad();
		assertTrue(resultado);
	}
	
	@Test
	public void testGenerarDni() {
		
	}


	
	
	
	

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        
        
    }
}
