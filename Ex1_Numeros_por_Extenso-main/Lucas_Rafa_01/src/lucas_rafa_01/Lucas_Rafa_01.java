package lucas_rafa_01;
import java.util.Scanner;

public class Lucas_Rafa_01 {

    public static void main(String[] args) {
        String numero[][] = {
            {"","Cento","Duzentos","Trezentos","Quatrocentos","Quinhentos","Seiscentos","Setecentos","Oitocententos","Novecentos"},
            {"","","Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"},
            {"","um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"}
        };
        String outros[] = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezesste", "dezoito", "dezenove"};
        System.out.print("Digite um número entre 1 e 999. Por favor, digitar '99' como 099: ");
        Scanner entrada = new Scanner(System.in);
        String numeroEntrada = entrada.nextLine();
        int c = Integer.parseInt(String.valueOf(numeroEntrada.charAt(0)));
        int d = Integer.parseInt(String.valueOf(numeroEntrada.charAt(1)));
        int u = Integer.parseInt(String.valueOf(numeroEntrada.charAt(2)));
        
        if((c == 0)&&(d == 1)){
            System.out.print(outros[u]);
        }
        else if("100".equals(numeroEntrada)){
            System.out.print("Cem");
        }
        else{
        System.out.print(numero[0][c] + " e " + numero[1][d] + " e " + numero[2][u]);
        }
    }
}