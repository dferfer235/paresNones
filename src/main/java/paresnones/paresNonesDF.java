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
        String dedosTexto;

        boolean repetirJuego = true, repetirDato = true;

        Random jugadorAleatorio = new Random();

        System.out.println("Bienvenido a Pares o Nones");

        JOptionPane.showMessageDialog(null, "Un jugador aleatorio tendra que elegir pares o nones");

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

            do {
                dedosTexto = JOptionPane.showInputDialog(null,
                        "Jugador 1, escribe los dedos que vas a sacar");
                dedosJ1 = Integer.parseInt(dedosTexto);
                if (dedosJ1 <= 0 || dedosJ1 >= 10) {
                    JOptionPane.showMessageDialog(null, "Los dedos de Jugador 1 no son validos\n"
                            + "(No puedes sacar mas de 10 dedos o menos de 0)");
                } else {
                    repetirDato = false;
                }
            } while (repetirDato);
            repetirDato = true;

            do {
                dedosTexto = JOptionPane.showInputDialog(null,
                        "Jugador 2, escribe los dedos que vas a sacar");
                dedosJ2 = Integer.parseInt(dedosTexto);
                if (dedosJ2 <= 0 || dedosJ2 >= 10) {
                    JOptionPane.showMessageDialog(null, "Los dedos de Jugador 2 no son validos\n"
                            + "(No puedes sacar mas de 10 dedos o menos de 0)");
                } else {
                    repetirDato = false;
                }
            } while (repetirDato);

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
