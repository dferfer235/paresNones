package paresnones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author davidfdez
 */
public class paresNonesDF {

    public static void main(String[] args) {
        int dedosJ1, dedosJ2;
        boolean j1Pares, j2Pares;
        int paresNones;
        String paresNonesS;

        Random jugadorAleatorio = new Random();

        System.out.println("Bienvenido a Pares o Nones");

        JOptionPane.showMessageDialog(null, "Un jugador escojerá pares o nones");

        int jugadorElegido = jugadorAleatorio.nextInt(2) + 1;

        switch (jugadorElegido) {
            case 1:
                JOptionPane.showMessageDialog(null, "Jugador " + jugadorElegido + " te toca escoger");

                paresNonesS = JOptionPane.showInputDialog(null,
                        "Jugador " + jugadorElegido + " ¿Pares o nones?\n"
                        + "1-. Pares\n"
                        + "2-. Nones");
                paresNones = Integer.parseInt(paresNonesS);

                if (paresNones == 1) {
                    j1Pares = true;
                    j2Pares = false;
                } else {
                    j2Pares = true;
                    j1Pares = false;
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Jugador " + jugadorElegido + " te toca escoger");

                paresNonesS = JOptionPane.showInputDialog(null,
                        "Jugador " + jugadorElegido + " ¿Pares o nones?\n"
                        + "1-. Pares\n"
                        + "2-. Nones");
                paresNones = Integer.parseInt(paresNonesS);

                if (paresNones == 1) {
                    j2Pares = true;
                    j1Pares = false;
                } else {
                    j1Pares = true;
                    j2Pares = false;
                }
                break;
        }

        String dedosTexto = JOptionPane.showInputDialog(null,
                "Jugador 1, escribe los dedos que vas a sacar");
        dedosJ1 = Integer.parseInt(dedosTexto);

        dedosTexto = JOptionPane.showInputDialog(null,
                "Jugador 2, escribe los dedos que vas a sacar");
        dedosJ2 = Integer.parseInt(dedosTexto);

    }

}
