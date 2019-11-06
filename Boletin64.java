
package boletin.pkg6.pkg4;

import java.util.Scanner;

public class Boletin64 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Teclea primer nome: ");
        String nome1 = sc.next();
        System.out.print("Teclea o primer peso: ");
        float peso1 = sc.nextFloat();
        clase4 obxPeso1 = new clase4(nome1, peso1);
        System.out.print("Teclea o segundo nome: ");
        String nome2 = sc.next();
        System.out.print("Teclea o segundo peso: ");
        float peso2 = sc.nextFloat();
        clase4 obxPeso2 = new clase4(nome2, peso2);
        //Finalizar
        if (obxPeso1.getpeso()> obxPeso2.getpeso()) {
        System.out.println(obxPeso1.getnome()+" ten maior peso");
        System.out.println("Diferencia de peso: "+(obxPeso1.getpeso() - obxPeso2.getpeso()+" kg"));
        } 
        else {
        System.out.println(obxPeso2.getnome()+" ten maior peso");
        System.out.println("Diferencia de peso: "+(obxPeso2.getpeso() - obxPeso1.getpeso()+" kg"));
        }
    }
}
    

