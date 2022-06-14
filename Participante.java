import java.util.Arrays;

public class Participante {
    private int codigo;
    private String email;
    private Imovel[] imoveis;
    public static final int MAX = 5;
    private int contI = 0;

    public Participante(int codigo, String email) {
        imoveis = new Imovel[MAX];
        this.codigo = codigo;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Imovel[] getImoveis() {
        return imoveis;
    }
    public String imoveisToString(Imovel[] imoveis){
        String texto = "";
        for(int i=0;i<contI;i++){
            Imovel aux = imoveis[i];
            texto+= aux.toString() + "\n";
        }
        return texto;
    }

    public boolean addImovel(Imovel imovel) {
        if (contI < MAX) {
            imoveis[contI] = imovel;
            contI++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "codigo=" + codigo +
                ", email='" + email + '\'' +
                ", imoveis=" + imoveisToString(imoveis)+
                '}';
    }
}

