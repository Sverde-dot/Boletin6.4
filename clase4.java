package boletin.pkg6.pkg4;
import java.util.Scanner;

public class clase4 {
    Scanner sc=new Scanner(System.in);
    private String nome;
    private float peso; 

    public clase4(){
    }

   public clase4(String nome, float peso){
        this.nome=nome;
        this.peso=peso;
    }
    
      public void setnome(String nome){
        this.nome=nome;
    }
    public String getnome(){
        return nome;
    }
    public void setpeso(float peso){
        this.peso=peso;
    }
    public float getpeso(){
        return peso;
    }
        
}
