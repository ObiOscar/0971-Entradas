

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestMuro.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestMuro
{
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private EntradaUnionAGrupo entradaU1;
    private EntradaUnionAGrupo entradaU2;
    private Muro muro1;
    private EntradaFoto entradaF3;

    
    
    
    
    
    
    

    /**
     * Default constructor for test class TestMuro
     */
    public TestMuro()
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
       // entradaT1 = new EntradaTexto("Oscar", "Hola a todos OSCAR");
       // entradaT2 = new EntradaTexto("Juan", "Hola a todos Juan");
        //entradaF1 = new EntradaFoto("Oscar", "www.google.com", "perros");
      //  entradaF2 = new EntradaFoto("Juan", "www.google.com", "perros");
       // entradaU1 = new EntradaUnionAGrupo("Oscar", "Leoneses");
       // entradaU2 = new EntradaUnionAGrupo("juan", "programacion");
        muro1 = new Muro();
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaT2);
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaF2);
        muro1.mostrar();
        muro1.addEntrada(entradaU1);
        muro1.addEntrada(entradaU2);
      //  entradaF3 = new EntradaFoto("oscar", "https://www.cleverfiles.com/howto/wp-content/uploads/2016/08/mini.jpg", "No me pongas mas pegas Miguel");
        muro1.addEntrada(entradaF3);
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
}
