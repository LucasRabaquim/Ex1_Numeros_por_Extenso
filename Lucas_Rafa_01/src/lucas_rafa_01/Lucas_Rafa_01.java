ppackage lucas_rafa_01;
import java.util.Scanner;

public class Lucas_Rafa_01 {

    public static void main(String[] args) {
        String centena[] = {"","Cento","Duzentos","Trezentos","Quatrocentos","Quinhentos","Seiscentos","Setecentos","Oitocententos","Novecentos"};
        String dezena[] = {"","Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
        String unidade[] = {"","um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String outros[] = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezesste", "dezoito", "dezenove","Cem"};
        System.out.print("Digite um número entre 1 e 999. Por favor, digitar '99' como 099: ");
        Scanner entrada = new Scanner(System.in);
        String numeroEntrada = entrada.nextLine();
        char c = numeroEntrada.charAt(0);
        char d = numeroEntrada.charAt(1);
        char u = numeroEntrada.charAt(2);
       String uni[0][2] = {
        //0   {"","Cento","Duzentos","Trezentos","Quatrocentos","Quinhentos","Seiscentos","Setecentos","Oitocententos","Novecentos"};
         //1  {"","Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
       }
        System.out.print(c+""+d+""+u);
      
        
        
        
        
        
        
     
        //numero[0] -> centena
        //numero[1][3][4] -> centena = Cento, Dezena = Trinta, unidade = quatro,
        
        
        
        
        
        

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