
import Estoque.Estoque;
import Vestuario.Vestuario;


void main() {

    Scanner sc = new Scanner(System.in);
    int opcao = 0;
    ArrayList<Estoque> estoques = new ArrayList<>();
    Estoque estoque;
    int ID;

    IO.println("#####ESTOQUE DE VESTUARIO XYZ########");
    do {

        IO.println("########MENU#########\n");
        IO.println("ESCOLHA UMA OPÇÃO:");
        IO.println("1. ADICIONAR VESTUARIO");
        IO.println("2. REMOVER VESTUARIO (verifique o Id do produto antes!)");
        IO.println("3. VER ESTOQUE");
        IO.println("4. SAIR");

        IO.print("Escolha uma opcao:");
        opcao = sc.nextInt();


        switch (opcao) {

            case 1:
                int Continuar;
                do {

                    sc.nextLine();
                    IO.print("digite o tipo de Vestuario: (ex calça, blusa ect):");
                    String tipoVestuario = sc.nextLine();
                    IO.print("digite a marca do vestuario (ex Adidas, nike etc): ");
                    String marcaVestuario = sc.nextLine();
                    IO.print("digite o tamanho do vestuario (ex 10, G,p etc): ");
                    String tamanhoVestuario = sc.nextLine();
                    IO.print("valor do vestuario (ex 12,99, 70,89): ");
                    double valorVestuario = sc.nextDouble();


                    IO.print("quantidade em estoque: ");
                    int quantidadeEstoque = sc.nextInt();
                    sc.nextLine();
                    Vestuario vestuario = new Vestuario(tipoVestuario, marcaVestuario, tamanhoVestuario, valorVestuario);
                    estoque = new Estoque(quantidadeEstoque, vestuario);

                    estoques.add(estoque);
                    IO.println("vestuario adicionado com sucesso!\n");

                    IO.println("deseja continuar adicionando ?");
                    IO.println("1. SIM");
                    IO.println("2. NAO");

                    Continuar = sc.nextInt();
                }while (Continuar == 1);
                break;
            case 2:
                int continuar;
                do {
                    IO.println("Qual produto deseja remover ? digite seu ID");
                    ID = sc.nextInt();
                    estoques.remove(ID);
                    IO.println("vestuario removido com sucesso!\n");

                    IO.println("deseja continuar removendo ?");
                    IO.println("1. SIM");
                    IO.println("2. NAO");
                    continuar = sc.nextInt();
                }while (continuar == 1);
                break;
            case 3:
                IO.println("Estoque atual de vestuarios: ");
                for (int i = 0; i < estoques.size(); i++) {
                    Estoque estoqueAtual = estoques.get(i);//vestuario no index i do estoque

                    IO.println("ID " + (i +1) + "\n " + estoqueAtual.toString() + "\n");
                }
                break;
            case 4:
                IO.println("Ate mas!!!");
                break;
            default:
                IO.println("opcao invalida, tente novamente");
                break;
        }

    }while (opcao != 4);
}
