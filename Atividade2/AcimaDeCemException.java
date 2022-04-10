package Atividade2;


public class AcimaDeCemException extends Exception {
    private int n;
    private int soma;

public AcimaDeCemException (int n, int soma){
    super("Soma acima de cem");
    this.n = n;
    this.soma = soma;
}
public int getSoma(){
    return soma;
}

    
}