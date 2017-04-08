

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MiTestNavegador.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MiTestNavegador
{
    private EntradaTexto entradaT1;
    private EntradaFoto entradaF1;
    private EntradaUnionAGrupo entradaU1;
    private Muro muro1;

    /**
     * Default constructor for test class MiTestNavegador
     */
    public MiTestNavegador()
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
       // entradaT1 = new EntradaTexto("oscar", "Pulverizando casi todos los pronósticos, la conocida como “película sobre Facebook” se convirtió en una de las mejor valoradas y más taquilleras del año pasado, se alzó con los Globos de Oro más importantes y logró tres Oscars, entre otros premios. Dicen ya que es un clásico instantáneo, pero habrá que esperar un poco para confirmarlo. Como sabréis, el octavo largometraje David Fincher, ‘La red social’ (‘The Social Network’, 2010), puede adquirirse en nuestro país, en los formatos DVD y Blu-ray, desde el pasado 15 de marzo, dando la oportunidad de verla en versión original a todos los que tuvieron que ir al cine a ver a Jesse Eisenberg (y compañía) doblado al castellano. Notaréis que es una interpretación mucho más auténtica, eléctrica, y que su nominación al Oscar fue merecida. No ya ganar la estatuilla, pues lo que hizo Colin Firth en ‘El discurso del rey’ (‘The King´s Speech’) creo que está un peldaño por encima. Donde no hubo justicia fue con el premio a la mejor dirección. Ya tengo y he vuelto a ver ‘La red social’, dos veces más desde aquel primer visionado en el cine; no creo que haga lo mismo con ‘El discurso del rey’, y eso que es una película estupenda, agradable, sencilla, elegante, muy bien interpretada. Pero no tiene el endiablado guion de Aaron Sorkin ni la apabullante puesta en escena de Fincher. Por eso no me cansaré de verla, aunque solo sea un rato, para disfrutar del trabajo de unos tipos tan seguros de sí mismos y plenos de talento, que consiguen que lo más difícil parezca muy fácil.");
        //entradaF1 = new EntradaFoto("oscar", "https://www.cleverfiles.com/howto/wp-content/uploads/2016/08/mini.jpg", "No me pongas mas pegas Miguel");
       // entradaU1 = new EntradaUnionAGrupo("Maria Tascon", "Tu no eres de Leon sino...");
        muro1 = new Muro();
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaU1);
        muro1.mostrarMuroEnNavegador();
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
