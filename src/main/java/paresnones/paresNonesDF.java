package paresnones;

import javax.swing.JOptionPane;

/**
 * @author davidfdez
 */
public class paresNonesDF {

    public static void main(String[] args) {
        int dedosJ1, dedosJ2;

        System.out.println("Bienvenido a Pares o Nones");

        String dedosTexto = JOptionPane.showInputDialog(null,
                "Jugador 1, escribe los dedos que vas a sacar");
        dedosJ1 = Integer.parseInt(dedosTexto);

        dedosTexto = JOptionPane.showInputDialog(null,
                "Jugador 2, escribe los dedos que vas a sacar");
        dedosJ2 = Integer.parseInt(dedosTexto);

    }

}
