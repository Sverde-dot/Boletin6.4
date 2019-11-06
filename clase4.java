
package boletin.pkg6.pkg4;
import java.util.Scanner;

public class clase4 {
    Scanner sc=new Scanner(System.in);
    private int num1;
    private int num2;
    private int pes1;
    private int pes2;

    public clase4(){
    }

   public clase4(short edad){
        this.num1=num1;
        this.num2=num2;
        this.pes1=pes1;
        this.pes2=pes2;   
    }
    
    public void num1(){
        this.num1=num1;
    }
        public int getnum1(){
        return num1; 
    }
    public void num2(){
        this.num2=num2;
    }
        public int getnum2(){
        return num2; 
    }         
     
    public void pes1(){
        this.pes1=pes1;
    }
        public int getpes1(){
        return pes1; 
    }
        
    public void pes2(){
        this.pes2=pes2;
    }
        public int getpes2(){
        return pes2; 
    }
        
        
    public void convertir(int num1,int num2,int pes1,int pes2){
        if (num1>num2)
            System.out.println("El peso mayores "+pes1+" con "+num1);
            System.out.println("La diferencia es "+(num1-num2));
        
        else
            System.out.println("El peso mayores "+pes2+" con "+num2);
            System.out.println("La diferencia es "+(num2-num1));
    } 
    public int pedirShort(){
       //Scanner sc=new Scanner(System.in);
       System.out.println("El numero es: ");
       Short ed=sc.nextShort();
       return ed;
}
}