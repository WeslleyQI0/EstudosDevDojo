/**
 * Created by Weslley on 05/03/2017.
 */
public class Operedores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma;

        soma = numero1 + numero2;

        System.out.println("A soma eh "+numero1+numero2); // Se o usarmos o operado "+" na hora de imprimir concatenado ele ira concatenar todas as variavei q tiver esse operador
        System.out.println("A soma he "(+numero1+numero2));// Mais se quisermos fazer assim é melhor por as variaveis emtre parenteses
        System.out.println("A soma eh "+soma); // O melhor é criar uma varivel que guarde o valor da soma
    }
}
