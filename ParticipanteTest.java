import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticipanteTest {
    Participante p = new Participante(3, "manoel@gmail.com");

    @Test
    void getCodigoP() {
        assertEquals(3, p.getCodigo());
    }

    @Test
    void setCodigo5() {
        p.setCodigo(5);
        assertEquals(5, p.getCodigo());
    }

    @Test
    void getEmailP() {
        assertEquals("manoel@gmail.com", p.getEmail());
    }

    @Test
    void setEmailDeP() {
        p.setEmail("manuuel@gmail.com");
        assertEquals("manuuel@gmail.com", p.getEmail());
    }

    @Test
    void getImoveisP() {
        assertEquals( p.getImoveis(), p.getImoveis());
    }

    @Test
    void imoveisToStringP() {
        Imovel imo = new Imovel("Apartamento Jaguari", 200, 2, p);
        p.addImovel(imo);
        Imovel imoveis[] = p.getImoveis();
        int contI =1;
        String s = "";
        for(int i=0;i<contI;i++){
            Imovel aux = imoveis[i];
            s+= aux.toString() + "\n";
        }
        assertEquals(s, p.imoveisToString(imoveis));
    }

    @Test
    void addImovelEmP() {
        Imovel imo = new Imovel("Apartamento Jaguari", 200, 2, p);
        Imovel imo2 = new Imovel("Apartamento Doroteia", 200, 2, p);
        Imovel imo3 = new Imovel("Apartamento perui", 200, 2, p);
        Imovel imo4 = new Imovel("Apartamento Klein", 200, 2, p);
        Imovel imo5 = new Imovel("Apartamento Jaguarizinho", 200, 2, p);
        Imovel imo6 = new Imovel("Apartamento Jaguarizito", 200, 2, p);
        assertTrue(p.addImovel(imo));
        assertTrue(p.addImovel(imo2));
        assertTrue(p.addImovel(imo3));
        assertTrue(p.addImovel(imo4));
        assertTrue(p.addImovel(imo5));
        assertFalse(p.addImovel(imo6));
    }

    @Test
    void testToStringP() {
        String s = "Participante{" +
                "codigo=" + p.getCodigo() +
                ", email='" + p.getEmail() + '\'' +
                ", imoveis=" + p.imoveisToString(p.getImoveis())+
                '}';
        assertEquals(s, p.toString());
    }
}