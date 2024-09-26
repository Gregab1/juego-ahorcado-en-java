import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMximos = 10;
        int intentos = 0;
        boolean palabrasAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
           // System.out.print(letrasAdivinadas[i]);
        }
        while (!palabrasAdivinada && intentos < intentosMximos) {
            System.out.println("palabra a adivinar; " + String.valueOf(letrasAdivinadas)+"  ("+palabraSecreta.length()+" letras)");
            System.out.println("ingrese la letra, por favor");
            char letra = Character.toLowerCase(leer.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("letra incorrecta !! te quedan " + (intentosMximos - intentos) + " intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabrasAdivinada = true;
                System.out.println("felicidaes adiviniste la palabra secreta;  "+palabraSecreta+" (" + palabraSecreta.length()+" letras)");

            }

        }
        if (!palabrasAdivinada) {
            System.out.println("te has quedado sin intentos ");
        }

        leer.close();
    }
}
