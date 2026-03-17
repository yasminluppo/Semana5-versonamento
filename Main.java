import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        nota01 = sc.nextFloat();
 
        System.out.println(x: "Digite a segunda nota: ");
        nota02 = sc.nextFloat();
 
        media = (nota01 + nota02) / 2;
 
        if(media >= 0 && media <= 10){
            if(media >= 6){
                System.out.println("Sua média é: " + media + " - Aprovado");
            } else {
                System.out.println("Sua média é: " + media + " - Reprovado");
            }
        }
        else{
                System.out.println(x: "Média inválida!");
            }
    }  
}
 