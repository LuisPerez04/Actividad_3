
package actividad_3;
import java.util.Scanner;

public class Actividad_3 {

//Unidades y variables
    public static int pm;
    public static int selections;
    public static double sumando;
    public static int factorial_num= 1;
    public static double la_media;
    public static char[][] mi_gato= new char[3][3];
   
   //Presentacion de la actividad 3
    
    public static void Interfaz(){ 
        System.out.println("    FACULTAD DE INGENIERÍA UAC    ");
        System.out.println("------------------------------------");
        System.out.println("    LUIS PEREZ ISC PROGRAMACION   "); 
        System.out.println("------------------------------------");
        }
    // 1) Suma consecutiva del 0 al 10
    
    public static void Mi_suma(){
        System.out.println(" M I S U M A "); 
        System.out.println("Obtener la suma del 0 al 10 :"); 
        for (int i = 0; i <= 10; ++i) {
        pm += i;
        System.out.println(pm);
        }
    }
    // 2) Factorial del numero 10
    
    public static void Factorial() {
        System.out.println(" M I F A C T O R I A L "); 
        System.out.println("Prueba de factorial del 1 al 10: ");   
        for (int i = 1; i <= 10; ++i) {
        factorial_num *= i;
        System.out.println(factorial_num);       
        }
}
    // 3) Calcular el factorial de un número que sea introducido por el usuario
    
    public static void Calculadora_factorial() {    
        System.out.println(" F A C T O R I A L 2 "); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee un numero cualesquiera para conocer su factorial :");   
        pm = sc.nextInt();
        for (int i = 1; i <= pm; ++i) {
        factorial_num *= i;
        System.out.println(factorial_num); 
        }
}
    // 4) Calcular la media de la suma del 0 hasta el número introducido por el usuario
    
    public static void Mi_media_aritmetica() {
        System.out.println(" M E D I A "); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee para obtener la media de su numero :");   
        pm = sc.nextInt();
        for (int i = 1; i <= pm; ++i) {
        sumando += i;    }
        la_media = sumando / pm;
        System.out.println(la_media);
}
      // 5) Pedir un número y leer n veces números, realizar la suma de los números, sacar el promedio 
      //y determinar cuál número introducido es el mayor y cuál el menor, y la distancia numérica entre ellos
    
    public static void Operaciones() {
        System.out.println(" M A Y O R Y M E NO R N U M E R O "); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee un número para conocer la suma, promedio, numero mayor o menor y su diferencia: ");   
        pm = sc.nextInt();
        for (int i = 1; i <= pm; ++i) {
        sumando += i;
        la_media = sumando / pm;
        if (i == 1){
        System.out.println("El número más bajo es: " + la_media);
        }
         if (i == pm){
        System.out.println("El número más alto es:  " + la_media);
        }
        }
        System.out.println("La diferencia es de  " + la_media + " entre el número más bajo y alto de la suma " + pm + " veces");
}
     // 6) Imprima un arreglo que tenga los nombres de los días de la semana.
    
    public static void Diasdelasemana() {
       System.out.println(" D I A S D E L A S E M A N A "); 
       System.out.println("Una semana se conforma del siguiente arreglo :"); 
       String[] dias = {" 1) Lunes"," 2) Martes"," 3) Miercoles"," 4) Jueves"," 5) Viernes"," 6) Sábado"," 7) Domingo"};
       for (String i:dias){
           pm += 1;
        System.out.println("Dia " + pm + ": " + i);
       }
}
       // 7) Imprima un arreglo de 2 dimensiones de 3 X 3 que dibuje el modelo del juego gato.
    
    public static void Arreglo2() {  
        System.out.println(" T R E S E N R A Y A "); 
        System.out.println("Modelo del juego de tres en raya :");
        for (char[] gato1 : mi_gato) {
            for (int m = 0; m<mi_gato.length; m++) {
                System.out.print("  -  " + gato1[m]);
            }
            System.out.println();
        }
    }
    // Panel de eleccion
   
     public static void programas(int opcion){
            switch (opcion) {
            case 1:
                Mi_suma();
                break;
            case 2:
                Factorial();
                break;
            case 3:
                Calculadora_factorial();
                break;
            case 4:
                Mi_media_aritmetica();
                break;
            case 5:
                Operaciones();
                break;
            case 6:
                Diasdelasemana();
                break;
            case 7:
                Arreglo2();
                break;
            default:
            System.out.println("Escribir el numero del programa que quiere probar: ");   
                break;    
            }      
    }
     public static void main(String[] args) {
         Interfaz();
    Scanner sc = new Scanner(System.in);
        System.out.println("Eliga la calculadora que desee? \n Sumar del 0 al 10 ---> 1 \n Factorial del 1 al 10 ---> 2 \n Calculadora del factorial ---> 3° \n Media aritmetica ---> 4 \n Promedio, numero mayor y menor, diferencia ---> 5 \n Dias de la semana ---> 6 \n Mini juego gato ---> 7 ");  
        selections = sc.nextInt();
        programas(selections);
    
    }
    
}
