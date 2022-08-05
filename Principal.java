import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {        
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        Contato[] Vetor = new Contato[5];
        int contador = 0;

    do{
        System.out.println("---Menu---");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Buscar contato");
        System.out.println("3 - Remover contato po numero");
        System.out.println("4 - Editar contato");
        System.out.println("0 = Sair");
        System.out.println("Escolha uma opçao");
        opcao = entrada.nextInt();
        int numero = 0;
        String nome = " ";
        String email = " ";
        String telefone = " ";

        switch (opcao) {
            case 0:
                System.out.println("Adeus!!");              
                break;       
            case 1:
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Digite seu nome: ");
            nome = entrada.nextLine();
            System.out.println("Digite um E-mail: ");
            email = entrada.nextLine();
            System.out.println("Digite um telefone: ");
            telefone = entrada.nextLine();
            Contato c = new Contato(numero, nome, email, telefone);
            Vetor[contador] = c;
            contador++;

                break;
            case 2:
            
                break;
            case 3:
            
                break;
            case 4:
            
                break;
            default:
                System.out.println("Opção invalida, tente outra vez");
                break;
        }


    }while(opcao !=0);

    entrada.close();

   }
   
    
}
