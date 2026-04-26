/** Exemplo simples de estrutura de repetição for, onde a variável de controle é declarada dentro do próprio comando for.
 * O comando for é composto por três partes: a inicialização da variável de controle (int cc=0), a condição de continuação (cc<=3) e a atualização da variável de controle (cc++).
 * O bloco de código dentro do for será executado enquanto a condição for verdadeira, ou seja, enquanto cc for menor ou igual a 3. A cada iteração, o valor de cc será incrementado em 1, e a mensagem "Cambalhota!" será impressa no console.
 * O segundo for é um exemplo de como podemos usar o comando for para contar de 0 a 100 em incrementos de 10, imprimindo cada valor no console.
 * @author Ranieri Mendes
 * @version 1.0
 */

public class RepeticaoFor {
    public static void main(String[] args) {
        for(int cc=0; cc<=3; cc++){
            System.out.println("Cambalhota!");
        }
        for(int n=0; n<=100; n+=10){
            System.out.println(n);
        }
    }
}
