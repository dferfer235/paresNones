package paresnones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * https://github.com/dferfer235/paresNones.git
 *
 * @author davidfdez
 */
public class ParesNonesDF {

    public static void main(String[] args) {
        int dedosJ1 = 0, dedosJ2 = 0;
        boolean j1Pares = true;
        int paresNones = 0;
        int totalDedos;
        String paresNonesS, dedosTexto, seleccionRepeticion;
        int seleccionJugador = 0;
        int seleccion = 0;

        boolean repetirJuego = true, repetirDato = true;

        Random nAleatorio = new Random();

        System.out.println("Bienvenido a Pares o Nones");

        do {
            repetirDato = true;
            do {
                try {
                    String seleccionTexto = JOptionPane.showInputDialog(null,
                            "¿Como deseas jugar?\n"
                            + "1-. Jugar contra otro jugador\n"
                            + "2-. Jugar contra la maquina");
                    seleccionJugador = Integer.parseInt(seleccionTexto);
                    repetirDato = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                }
            } while (repetirDato);

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

                            repetirDato = true;
                            do {
                                try {
                                    paresNonesS = JOptionPane.showInputDialog(null,
                                            "Jugador " + jugadorElegido + " ¿Pares o nones?\n"
                                            + "1-. Pares\n"
                                            + "2-. Nones\n"
                                            + "(Cualquier otro numero se considera como Nones)");
                                    paresNones = Integer.parseInt(paresNonesS);
                                    repetirDato = false;
                                } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                                }
                            } while (repetirDato);

                            //En el if else se asignan la eleccion unicamente al jugador 1
                            //(Si J1 es pares, J2 es nones)
                            if (paresNones == 1) {
                                j1Pares = true;
                            } else {
                                j1Pares = false;
                            }
                            break;

                        case 2:
                            do {
                                try {
                                    paresNonesS = JOptionPane.showInputDialog(null,
                                            "Jugador " + jugadorElegido + " ¿Pares o nones?\n"
                                            + "1-. Pares\n"
                                            + "2-. Nones\n"
                                            + "(Cualquier otro numero se considera como Nones)");
                                    paresNones = Integer.parseInt(paresNonesS);
                                    repetirDato = false;
                                } catch (NumberFormatException nfe) {
                                    JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                                }
                            } while (repetirDato);

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
                        try {
                            dedosTexto = JOptionPane.showInputDialog(null,
                                    "Jugador 1, escribe los dedos que vas a sacar");
                            dedosJ1 = Integer.parseInt(dedosTexto);
                            if (dedosJ1 < 0 || dedosJ1 >= 11) {
                                JOptionPane.showMessageDialog(null, "Los dedos de Jugador 1 no son validos\n"
                                        + "(No puedes sacar mas de 10 dedos o menos de 0)");
                            } else {
                                repetirDato = false;
                            }
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                        }

                    } while (repetirDato);

                    repetirDato = true;
                    do {
                        try {
                            dedosTexto = JOptionPane.showInputDialog(null,
                                    "Jugador 2, escribe los dedos que vas a sacar");
                            dedosJ2 = Integer.parseInt(dedosTexto);
                            if (dedosJ2 < 0 || dedosJ2 >= 11) {
                                JOptionPane.showMessageDialog(null, "Los dedos de Jugador 2 no son validos\n"
                                        + "(No puedes sacar mas de 10 dedos o menos de 0)");
                            } else {
                                repetirDato = false;
                            }
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                        }

                    } while (repetirDato);

                    totalDedos = dedosJ1 + dedosJ2;

                    JOptionPane.showMessageDialog(null, "Un, dos, tres...");

                    //En la condicion de este ifelse se comprueba si el jugador 1 ha escogido pares
                    //Y si el modulo de la suma total de dedos es 0
                    if (j1Pares == true && totalDedos % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "!Jugador 1 ha ganado!");
                    } else if (j1Pares == false && totalDedos % 2 != 0) {
                        JOptionPane.showMessageDialog(null, "!Jugador 1 ha ganado!");
                    } else {
                        JOptionPane.showMessageDialog(null, "!Jugador 2 ha ganado!");
                    }
                    repetirDato = true;
                    do {
                        try {
                            seleccionRepeticion = JOptionPane.showInputDialog(null,
                                    "¿Quieres jugar otra ronda?\n"
                                    + "1-. Si\n"
                                    + "2-. No");
                            seleccion = Integer.parseInt(seleccionRepeticion);
                            repetirDato = false;
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                        }
                    } while (repetirDato);

                    if (seleccion == 2) {
                        repetirJuego = false;
                        System.out.println("Saliendo...");
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Jugador, te toca escoger");

                    repetirDato = true;
                    do {
                        try {
                            paresNonesS = JOptionPane.showInputDialog(null,
                                    "Jugador, ¿Pares o nones?\n"
                                    + "1-. Pares\n"
                                    + "2-. Nones\n"
                                    + "(Cualquier otro numero se considera como Nones)");
                            paresNones = Integer.parseInt(paresNonesS);
                            repetirDato = false;
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                        }
                    } while (repetirDato);

                    if (paresNones == 1) {
                        j1Pares = true;
                    } else {
                        j1Pares = false;
                    }

                    repetirDato = true;
                    do {
                        try {
                            dedosTexto = JOptionPane.showInputDialog(null,
                                    "Jugador, escribe los dedos que vas a sacar");
                            dedosJ1 = Integer.parseInt(dedosTexto);
                            if (dedosJ1 < 0 || dedosJ1 >= 11) {
                                JOptionPane.showMessageDialog(null, "Los dedos de Jugador 1 no son validos\n"
                                        + "(No puedes sacar mas de 10 dedos o menos de 0)");
                            } else {
                                repetirDato = false;
                            }
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                        }
                    } while (repetirDato);

                    //En lugar de introducir un dato, dejamos que Random nos genere 
                    //un numero entre 0 y 10, el resto de codigo no necesitan ningun cambio
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

                    repetirDato = true;
                    do {
                        try {
                            seleccionRepeticion = JOptionPane.showInputDialog(null,
                                    "¿Quieres jugar otra ronda?\n"
                                    + "1-. Si\n"
                                    + "2-. No");
                            seleccion = Integer.parseInt(seleccionRepeticion);
                            repetirDato = false;
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "No se ha introducido un numero");
                        }
                    } while (repetirDato);

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
