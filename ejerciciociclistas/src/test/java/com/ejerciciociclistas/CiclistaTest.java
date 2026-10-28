import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CiclistaTest {

    @Test
    void velocistaDebeIdentificarSuTipo() {
        Velocista ciclista =
                new Velocista(1, "Daniel", 450.5, 65.2);

        assertEquals("Velocista", ciclista.imprimirTipo());
    }

    @Test
    void escaladorDebeIdentificarSuTipo() {
        Escalador ciclista =
                new Escalador(2, "Kevin", 4.5f, 35.0f);

        assertEquals("Escalador", ciclista.imprimirTipo());
    }

    @Test
    void contrarrelojistaDebeIdentificarSuTipo() {
        Contrarrelojista ciclista =
                new Contrarrelojista(3, "Juan", 70.5);

        assertEquals(
                "Contrarrelojista",
                ciclista.imprimirTipo()
        );
    }
}
