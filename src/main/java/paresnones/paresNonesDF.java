package paresnones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author davidfdez
 */
public class paresNonesDF {

    public static void main(String[] args) {
        int dedosJ1, dedosJ2;
        boolean j1Pares = true;
        int paresNones;
        int totalDedos;
        String paresNonesS, dedosTexto, seleccionRepeticion;
        int seleccion;

        boolean repetirJuego = true, repetirDato;

        Random nAleatorio = new Random();

        System.out.println("Bienvenido a Pares o Nones");

        String seleccionTexto = JOptionPane.showInputDialog(null,
                "¿Como deseas jugar?\n"
                + "1-. Jugar contra otro jugador\n"
                + "2-. Jugar contra la maquina");
        int seleccionJugador = Integer.parseInt(seleccionTexto);

        do {
            switch (seleccionJugador) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Un jugador aleatorio tendra que elegir pares o nones");

                    int jugadorElegido = nAleatorio.nextInt(2) + 1;
                    //Numero aleatorio que escoje un numero aleatorio que sea 1 o 2

                    //El numero se utiliza en el switch para que el jugador elegido 
                    //escoja si quiere pares o nones
                    switch (jugadorElegido) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Jugador " + jugadorElegido + " te toca escoger");

                            paresNonesS = JOptionPane.showInputDialog(null,
                                    "Jugador " + jugadorElegido + " ¿Pares o nones?\n"
                                    + "1-. Pares\n"
                                    + "2-. Nones");
                            paresNones = Integer.parseInt(paresNonesS);

                            //En el if else se asignan la eleccion unicamente al jugador 1
                            //(Si J1 es pares, J2 es nones)
                            if (paresNones == 1) {
                                j1Pares = true;
                            } else {
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

                            //Como se ha visto antes, solo se necesita guardar la seleccion en J1
                            //incluso aunque sea el j2 al que le ha tocado elegir
                            if (paresNones == 1) {
                                j1Pares = false;
                            } else {
                                j1Pares = true;
                            }
                            break;
                    }

                    //dowhile para controlar que el jugador no introduzca unos datos erroneos
                    repetirDato = true;
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

                    totalDedos = dedosJ1 + dedosJ2;

                    //En la condicion de este ifelse se comprueba si el jugador 1 ha escogido pares
                    //Y si el modulo de la suma total de dedos es 0
                    if (j1Pares == true && totalDedos % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "!Jugador 1 ha ganado!");
                    } else if (j1Pares == false && totalDedos % 2 != 0) {
                        JOptionPane.showMessageDialog(null, "!Jugador 1 ha ganado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "!Jugador 2 ha ganado!");
                    }

                    seleccionRepeticion = JOptionPane.showInputDialog(null,
                            "¿Quieres jugar otra ronda?\n"
                            + "1-. Si\n"
                            + "2-. No");
                    seleccion = Integer.parseInt(seleccionRepeticion);

                    if (seleccion == 2) {
                        repetirJuego = false;
                        System.out.println("Saliendo...");
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Jugador, te toca escoger");

                    paresNonesS = JOptionPane.showInputDialog(null,
                            "¿Pares o nones?\n"
                            + "1-. Pares\n"
                            + "2-. Nones");
                    paresNones = Integer.parseInt(paresNonesS);

                    if (paresNones == 1) {
                        j1Pares = true;
                    } else {
                        j1Pares = false;
                    }

                    repetirDato = true;
                    do {
                        dedosTexto = JOptionPane.showInputDialog(null,
                                "Jugador, escribe los dedos que vas a sacar");
                        dedosJ1 = Integer.parseInt(dedosTexto);
                        if (dedosJ1 <= 0 || dedosJ1 >= 10) {
                            JOptionPane.showMessageDialog(null, "Los dedos no son validos\n"
                                    + "(No puedes sacar mas de 10 dedos o menos de 0)");
                        } else {
                            repetirDato = false;
                        }
                    } while (repetirDato);

                    dedosJ2 = nAleatorio.nextInt(10) + 0;
                    JOptionPane.showMessageDialog(null, "La maquina saca " + dedosJ2 + " dedo/s");

                    totalDedos = dedosJ1 + dedosJ2;

                    if (j1Pares == true && totalDedos % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "!Jugador 1 ha ganado!");
                    } else if (j1Pares == false && totalDedos % 2 != 0) {
                        JOptionPane.showMessageDialog(null, "!Jugador 1 ha ganado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "!La maquina ha ganado!");
                    }

                    seleccionRepeticion = JOptionPane.showInputDialog(null,
                            "¿Quieres jugar otra ronda?\n"
                            + "1-. Si\n"
                            + "2-. No");
                    seleccion = Integer.parseInt(seleccionRepeticion);

                    if (seleccion == 2) {
                        repetirJuego = false;
                        System.out.println("Saliendo...");
                    }

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida");
            }

        } while (repetirJuego == true);

    }
}
