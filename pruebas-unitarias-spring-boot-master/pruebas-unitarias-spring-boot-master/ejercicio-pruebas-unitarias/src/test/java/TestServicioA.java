import static org.junit.Assert.assertEquals;
import org.junit.Test;
import services.ServicioA;
import services.impl.ServicioAImpl;

public class TestServicioA {

    @Test
    public void testSumar(){
        int a = 4;
        int b = 4;
        ServicioA servicioA = new ServicioAImpl();
        assertEquals(servicioA.sumar(a,b),8);
    }
}
