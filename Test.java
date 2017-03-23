

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * The test class Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test
{
    /**
     * Default constructor for test class Test
     */
    public Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void prueba()
    {
        Muro muro1 = new Muro();
        EntradaTexto entradaT1 = new EntradaTexto("oscar", "probando esto");
        muro1.addEntrada(entradaT1);
        EntradaFoto entradaF1 = new EntradaFoto("oscar", "www.google.com", "esto es una prueba");
        EntradaUnionAGrupo entradaU1 = new EntradaUnionAGrupo("oscar", "Tu no eres de leon sino...");
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaU1);
        EntradaTexto entradaT2 = new EntradaTexto("juan", "este texto mola");
        EntradaFoto entradaF2 = new EntradaFoto("juan", "www.google.com", "juan pasa un enlace");
        EntradaUnionAGrupo entradaU2 = new EntradaUnionAGrupo("Juan", "cuchillos y navajas");
        muro1.addEntrada(entradaT2);
        muro1.addEntrada(entradaF2);
        muro1.addEntrada(entradaU2);
    }
}

