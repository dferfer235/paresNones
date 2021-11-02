package paresnones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author davidfdez
 */
public class paresNonesDF {

    public static void main(String[] args) {
        int dedosJ1, dedosJ2;
        boolean j1Pares = true, j2Pares = true;
        int paresNones;
        String paresNonesS;

        boolean repetirJuego = true;

        Random jugadorAleatorio = new Random();

        System.out.println("Bienvenido a Pares o Nones");

        JOptionPane.showMessageDialog(null, "Un jugador escojerá pares o nones");

        do {
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

            int totalDedos = dedosJ1 + dedosJ2;

            if (j1Pares == true && totalDedos % 2 == 0) {
                JOptionPane.showMessageDialog(null, "!Jugador 1 ha ganado!");
            } else {
                JOptionPane.showMessageDialog(null, "!Jugador 2 ha ganado!");
            }
            String seleccionRepeticion = JOptionPane.showInputDialog(null,
                    "¿Quieres jugar otra ronda?\n"
                    + "1-. Si\n"
                    + "2-. No");
            int seleccion = Integer.parseInt(seleccionRepeticion);
            
            if (seleccion == 2) {
                repetirJuego = false;
                System.out.println("Saliendo...");
            }

        } while (repetirJuego == true);

    }

}
