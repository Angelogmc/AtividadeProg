package Atividade2;
import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) throws RuntimeException, AcimaDeCemException{
        Scanner s = new Scanner (System.in);
        int soma = 0, n, cont = 0, media = 0;
        do{
            System.out.println("Qual o número a ser somado?");
            n = s.nextInt();
            if(n < 0 || n > 100){
                throw new RuntimeException("Valor inválido.");
            }else{
            soma = soma + n;
            cont++;
            media = soma / cont;
            }
        }while(soma <= 100);
        if(soma <= 100){
            System.out.println("O valor da soma foi: " +soma);
            System.out.println("Foram somados " +cont + " números");
            System.out.println("A média foi: " +media);
        }
        else{
            AcimaDeCemException sie;
            sie = new AcimaDeCemException(n, soma);
            throw sie;
        }

    
    }

    
}
