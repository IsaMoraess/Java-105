/*Uma classe com um método principal que pergunta se o usuário quer: a) calcular a parte inteira do quociente entre dois valores; b) Calcular a divisão normal; c) Calcular oresto da divisão entre dois valores inteiros. De acordo com a resposta, o método main
deverá chamar o respectivo método. Cada um desses 3 métodos deve estar em uma classe pública distinta.
- Uma classe com um método que lê dois valores e calcula a parte inteira do quociente
dos valores lidos.
- Uma classe com um método que lê dois valores e calcula o resto da divisão dos valores
lidos.
-  Uma classe com um método que lê dois valores e calcula a divisão normal dos valores
lidos */

import java.util.Scanner;

public class principal {
    // Método para calcular a parte inteira do quociente
    public void inteiraQuociente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular a parte inteira do quociente entre dois valores");
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("A parte inteira do quociente entre " + num1 + " e " + num2 + " é: " + (num1 / num2));
    }

    // Método para calcular o resto da divisão
    public void restoDivisao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular o resto da divisão de dois valores");
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("O resto da divisão entre " + num1 + " e " + num2 + " é: " + (num1 % num2));
    }

    // Método para calcular a divisão normal
    public void divisaoNormal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular a divisão normal entre dois valores");
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("A divisão normal entre " + num1 + " e " + num2 + " é: " + ((double) num1 / num2));
    }
}