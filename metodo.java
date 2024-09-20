import java.util.Scanner;

public class metodo {
    public static void main(String[] args) {
        principal p = new principal();
        Scanner sc = new Scanner(System.in);
        
        // Menu de opções
        System.out.println("Escolha a operação:");
        System.out.println("a) Calcular a parte inteira do quociente");
        System.out.println("b) Calcular o resto da divisão");
        System.out.println("c) Calcular a divisão normal");
        System.out.print("Digite a opção desejada (a, b, c): ");
        char opcao = sc.next().charAt(0);

        // Chama o método correspondente à opção escolhida
        switch (opcao) {
            case 'a':
                p.inteiraQuociente();
                break;
            case 'b':
                p.restoDivisao();
                break;
            case 'c':
                p.divisaoNormal();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}