import java.util.function.Function;

public class Main {



    public static void main(String[] args) {
        //primera parte
        int num1 = 5;
        int num2 = 2;
        int num3 = 10;

        int resultado = suma(num1,num2,num3);
        System.out.println(resultado);

        //segunda parte
        Coche miCoche = new Coche();
        miCoche.incrementaPuerta();
        System.out.println("cantidad de puertas: " + miCoche.numeroPuertas);


    }

    public static int suma (int a,int b,int c){
        int resultado = a + b + c;
        return resultado;

    }

}

class Coche {
    int numeroPuertas = 0;

    public void incrementaPuerta(){
        this.numeroPuertas ++;
    }
}
