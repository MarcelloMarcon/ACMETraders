import java.util.Scanner;

public class ACMETraders {
    private CadastroGeral cadastroGeral;
    private Scanner entrada;

    public ACMETraders() {
        cadastroGeral = new CadastroGeral();
        entrada = new Scanner(System.in);
    }

    public void preCadastrar(){
        Participante p1 = new Participante(1,"jorge@gmail.com");
        Participante p2 = new Participante(2,"marcos@gmail.com");
        Participante p3 = new Participante(3,"julia@gmail.com");
        Imovel i1 = new Imovel("Apartamento Leblon", 263, 2, p1);
        Imovel i2 = new Imovel("Casa Xangri-la", 300, 4, p1);
        Imovel i3 = new Imovel("Duplex Porto Alegre", 288, 2, p1);
        Imovel i4 = new Imovel("Casa Tramandaí", 250, 3, p2);
        Imovel i5 = new Imovel("Apartamento Balneário Camboriú", 290, 2, p3);

        cadastroGeral.cadastraParticipante(p1);
        cadastroGeral.cadastraParticipante(p2);
        cadastroGeral.cadastraParticipante(p3);
        cadastroGeral.cadastraImovel(i1);
        cadastroGeral.cadastraImovel(i2);
        cadastroGeral.cadastraImovel(i3);
        cadastroGeral.cadastraImovel(i4);
        cadastroGeral.cadastraImovel(i5);
    }

    public void executa(){
        int opcao;
        do {
            apresentaMenu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1: {
                    if(cadastroGeral.pesquisaTudo().equals(null)){
                        System.out.println("Nenhum participante cadastrado no sistema.");
                    } else {
                        System.out.println(cadastroGeral.pesquisaTudo());
                    }
                }
                    break;

                case 2: {
                    System.out.println("Informe o código do participante que deseja pesquisar:");
                    int codigo = entrada.nextInt();
                    if(cadastroGeral.pesquisa(codigo) == null){
                        System.out.println("Nenhum participante encontrado com esse código.");
                    } else {
                        System.out.println(cadastroGeral.pesquisa(codigo).toString());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Informe o nome do item de troca que deseja pesquisar:");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    if(cadastroGeral.pesquisa(nome) == null){
                        System.out.println("Nenhum ítem de troca encontrado com esse nome.");
                    } else {
                        System.out.println(cadastroGeral.pesquisa(nome).toString());
                    }
                    break;
                }
                case 4: {
                    System.out.println("Programa finalizado.");
                }
            }
        }while(opcao!=4);

    }

    public void apresentaMenu(){
        System.out.println("-----MENU DE OPÇÕES-----");
        System.out.println("[1] Mostrar todas as informações cadastradas.");
        System.out.println("[2] Pesquisar participante pelo código.");
        System.out.println("[3] Pesquisar item de troca pelo nome.");
        System.out.println("[4] Sair.");

    }
}
