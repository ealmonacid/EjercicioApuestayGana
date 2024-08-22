import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Elkin Yamith Almonacid López
        //El siguiente codigo simula un juego de apuesta, en donde el usuario ingresa una cantidad de dinero y el sistema le arroja un numero aleatorio de 1 a 3
        //Con 1 gana el doble, con 2 pierde la mitad y con 3 pierde todo
        //22-08-2024
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int dinero;
        int op=1;
        int num;
        int x;
        System.out.println("APUESTA Y GANA");
        System.out.println("INTRODUCE UNA CANTIDAD DE DINERO");
        dinero=teclado.nextInt();
        while(op==1){
            num=aleatorio.nextInt(1,4);
            System.out.println("NUMERO ALEATORIO: "+num);
            switch (num){
                case 1:
                    dinero=dinero*2;
                    System.out.println("Su dinero es $"+dinero);
                    System.out.println("¿Quiere seguir jugando?");
                    System.out.println("1. SI\n2. NO");
                    op=teclado.nextInt();
                    break;
                case 2:
                    dinero=dinero/2;
                    System.out.println("Su dinero es $"+dinero);
                    System.out.println("¿Quiere seguir jugando?");
                    System.out.println("1. SI\n2. NO");
                    op=teclado.nextInt();
                    break;
                case 3:
                    dinero=0;
                    System.out.println("Su dinero es $"+dinero);
                    System.out.println("PERDIO TODO SU DINERO");
                    System.out.println("TERMINO EL JUEGO");
                    op=2;
                    break;
            }
        }
    }
}
