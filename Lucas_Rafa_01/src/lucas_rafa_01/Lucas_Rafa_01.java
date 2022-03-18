package lucas_rafa_01;
import java.util.Scanner;

public class Lucas_Rafa_01 {

    public static void main(String[] args) {
        String numero[][] = {
            {"","Cento","Duzentos","Trezentos","Quatrocentos","Quinhentos","Seiscentos","Setecentos","Oitocententos","Novecentos"},
            {"","","Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"},
            {"","um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"}
        };
        String outros[] = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezesste", "dezoito", "dezenove","Cem"};
        System.out.print("Digite um número entre 1 e 999. Por favor, digitar '99' como 099: ");
        Scanner entrada = new Scanner(System.in);
        String numeroEntrada = entrada.nextLine();
        
        int c = (int)(numeroEntrada.charAt(0));
        int d = (int)(numeroEntrada.charAt(1));
        int u = (int)(numeroEntrada.charAt(2));
        

        System.out.print(numero[0][c] + " e " + numero[1][d] + " e " + numero[2][u]);
      
        
        
        
        
        
        
     
       
        /*
        
        String c,d,u;
        System.out.print("Digite um número entre 1 e 999. Por favor, digitar '99' como 099: ");
        Scanner entrada = new Scanner(System.in);
        String numero = entrada.nextLine();
        switch(numero.charAt(2)){
            case("1"):
                u = unidade[0];
                break;
            case("1"):
                u = unidade[0];
                break;
            case("1"):
                u = unidade[0];
                break;
            case("1"):
                u = unidade[0];
                break;
            case("1"):
                u = unidade[0];
                break;
        }*/
    }
    
}
