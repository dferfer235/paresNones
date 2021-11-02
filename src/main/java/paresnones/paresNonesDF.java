package paresnones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author davidfdez
 */
public class paresNonesDF {

    public static void main(String[] args) {
        int dedosJ1, dedosJ2;

        Random jugadorAleatorio = new Random();

        System.out.println("Bienvenido a Pares o Nones");

        JOptionPane.showMessageDialog(null, "Un jugador escojerá pares o nones");

        int jugadorElegido = jugadorAleatorio.nextInt(2) + 1;

        JOptionPane.showMessageDialog(null, "Jugador " + jugadorElegido + " te toca escoger");

        String paresNonesS = JOptionPane.showInputDialog(null,
                "Jugador "+jugadorElegido+" ¿Pares o nones?\n"
                + "1-. Pares\n"
                + "2-. Nones");
        int paresNones = Integer.parseInt(paresNonesS);

        String dedosTexto = JOptionPane.showInputDialog(null,
                "Jugador 1, escribe los dedos que vas a sacar");
        dedosJ1 = Integer.parseInt(dedosTexto);

        dedosTexto = JOptionPane.showInputDialog(null,
                "Jugador 2, escribe los dedos que vas a sacar");
        dedosJ2 = Integer.parseInt(dedosTexto);

    }

}
