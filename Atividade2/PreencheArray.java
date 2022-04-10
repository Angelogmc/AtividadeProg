package Atividade2;
import java.util.Scanner;

public class PreencheArray {

public static void main(String[] args) throws NumberFormatException {
    Scanner s = new Scanner (System.in);
    int tamanho = 10;
    String[] array = new String[tamanho];
    boolean verify = false;
    String valor;
    System.out.println("Informe o valor a ser inserido no vetor");
    valor = s.nextLine();
    isDigit(valor);
    if(verify == true){
        inserir(array, valor);
    }
    else{
        throw new NumberFormatException("Valor inválido");

    }
    exibirVetor(array);

   }

    public static void inserir(String[] vetor, String valor) throws ArrayIndexOutOfBoundsException{
        Scanner s = new Scanner (System.in);
        for(int i=0; i<vetor.length; i++){
            System.out.println("Em qual posição do vetor o número deve ser inserido(0-9)?");
            int posicao = s.nextInt();
            if (posicao >= 0 && posicao <= 9){;
            vetor[posicao] = valor;
            }else{
                throw new ArrayIndexOutOfBoundsException("Posição inválida");
            }
            
        }
    }

    public static void exibirVetor(String[] vetor){
        for(int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }

    public static boolean isDigit(String posicao){
        for(int i=0; i < posicao.length(); i++){
           if(Character.isDigit(posicao.charAt(i))){
               return true;
           }
        }
        return false;
    }

} 