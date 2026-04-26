/** Exemplo simples de estrutura de repetição com laços aninhados, onde temos um loop externo (for) que itera de 1 a 3 e um loop interno (for) que itera de 0 a 2 em incrementos de 2.
 * @author Ranieri Mendes
 * @version 1.0
 */

public class RepeticaoLacosAninhados {
    public static void main(String[] args) {
        for(int i=1; i<=3;i++){
            for(int j=0; j<=2; j+=2){
                System.out.println(i + "||" + j);
            }
        }
    }
}
