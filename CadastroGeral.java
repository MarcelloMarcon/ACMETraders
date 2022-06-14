public class CadastroGeral {
    private Participante[] participantes;
    private Imovel[] imoveis;
    //Constante
    public static final int MAX = 100;
    private int contP;
    private int contI;

    public CadastroGeral() {
        participantes = new Participante[MAX];
        imoveis = new Imovel[MAX];
        contP = 0;
        contI = 0;
    }
    //Create
    public boolean cadastraParticipante(Participante participante){
        if(contP<MAX){
            participantes[contP] = participante;
            contP++;
            return true;
        }
        return false;
    }
    //Create
    public boolean cadastraImovel(Imovel imovel){
        if(contI<MAX) {
            imoveis[contI] = imovel;
            contI++;
            Participante p = imovel.getParticipante();
            p.addImovel(imovel);
            return true;
        }
        return false;
    }

    public String pesquisaTudo(){
        String texto = null;
        for(int i=0;i<contP;i++){
            Participante auxP = participantes[i];
            texto += auxP.toString() + "\n";
        }
        return texto;
    }

    public Participante pesquisa(int codigo){
        for(int i=0;i<contP;i++){
            if(participantes[i].getCodigo()==codigo){
                return participantes[i];
            }
        }
        return null;
    }

    public Imovel pesquisa(String nome){
        for(int i=0;i<contI;i++){
            if(imoveis[i].getNome().equals(nome)){
                return imoveis[i];
            }
        }
        return null;
    }
}
