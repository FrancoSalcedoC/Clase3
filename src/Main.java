import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String usuarioCorrecto = "usuario";
        String claveCorrecta = "clave";
        Scanner scanner =new Scanner(System.in);
        System.out.print ("Ingrese el usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese la contraseña");
        String clave = scanner.nextLine();
        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)){
            System.out.println("bienvenido al sistema...");
            } else
        System.out.println("Credenciales Incorrectas.");
    }
}