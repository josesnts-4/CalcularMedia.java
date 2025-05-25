
import java.util.Scanner;
public class Exibir {

  public static double calcular_media(double a,double b, double c) {
return (a + b + c) / 3;
}


    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira a sua primeira nota: ");
        nota1 = leitor.nextDouble();
        
        System.out.println("Insira a sua segunda nota: ");
        nota2 = leitor.nextDouble();
        
        System.out.println("Insira a sua terceira nota: ");
        nota3 = leitor.nextDouble();
  
    media = calcular_media(nota1, nota2, nota3);

  if (media >= 7 && media <= 8) {
    System.out.println("Da pra passar, tua media é: " + media);
  }else if (media >= 9 && media <= 10) {
    System.out.println("Você foi aprovadoo!!, tua media é: " + media);
  }else{
    System.out.println("Se fu, tenta de novo, tua media é: " + media);
  }
        leitor.close();
}
}
