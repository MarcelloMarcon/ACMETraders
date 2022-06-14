import static org.junit.jupiter.api.Assertions.*;

class ImovelTest {
    private Participante p = new Participante(2, "mateus@gmail.com");
    private Imovel i = new Imovel("Apartamento Lindoia", 230, 2, p);

    @org.junit.jupiter.api.Test
    void Imovel(){
        Imovel j = new Imovel();
    }

    @org.junit.jupiter.api.Test
    void getNome() {
        assertEquals("Apartamento Lindoia", i.getNome());
    }

    @org.junit.jupiter.api.Test
    void setNome() {
        i.setNome("Apartamento Caxias");
        assertEquals("Apartamento Caxias", i.getNome());
    }

    @org.junit.jupiter.api.Test
    void getMetrosQuadrados() {
        assertEquals(230, i.getMetrosQuadrados());}

    @org.junit.jupiter.api.Test
    void setMetrosQuadrados400() {
        i.setMetrosQuadrados(400);
        assertEquals(400, i.getMetrosQuadrados());
    }

    @org.junit.jupiter.api.Test
    void getVagasDeGaragemI() {
        assertEquals(2, i.getVagasDeGaragem());
    }

    @org.junit.jupiter.api.Test
    void setVagasDeGaragem5() {
        i.setVagasDeGaragem(5);
        assertEquals(5, i.getVagasDeGaragem());
    }

    @org.junit.jupiter.api.Test
    void getParticipanteI() {
        assertEquals(p,i.getParticipante());
    }

    @org.junit.jupiter.api.Test
    void setParticipanteP2(){
        Participante p2 = new Participante(10, "jose@gmail.com");
        i.setParticipante(p2);
        assertEquals(p2, i.getParticipante());
    }

    @org.junit.jupiter.api.Test
    void testToStringI() {
        String s = "Imovel{" +
                "nome='" + i.getNome() + '\'' +
                ", metrosQuadrados=" + i.getMetrosQuadrados() +
                ", vagasDeGaragem=" + i.getVagasDeGaragem() +
                ", proprietário=" + i.getParticipante().getEmail() +
                '}';
        assertEquals(s, i.toString());
    }
}