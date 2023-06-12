import java.util.Scanner;
public class Asd1 {
    public static void main(String[] args) {
        int temp ;
        String Tiempo = "";
        String Sugerencia = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la temperatura");
        temp = scanner.nextInt();
        if (temp >= 25) {
            Tiempo = "Soleado";
            Sugerencia = "Caminar y Tomar sol.";
        }
        if (temp > 15 && temp <=25){
            Tiempo = "Soleado";
            Sugerencia = "Caminar.";
        }
        if (temp <10){
            Tiempo = "Lluvia";
            Sugerencia = "Quedarse en casa o salir con paraguas y campera.";
        }
        if (temp <=15 ){
            Tiempo = "Soleado";
            Sugerencia = "Caminar con campera.";
        }
        if (temp <10 ){
            Tiempo = "Nieve";
            Sugerencia = "Esquiar.";
        }
        System.out.println("El clima: "+ Tiempo+" "+"Se recomienda: "+Sugerencia);
    }
    }