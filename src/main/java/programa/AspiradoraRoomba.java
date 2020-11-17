/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.time.LocalDateTime;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author GR6
 */
public class AspiradoraRoomba {

    public static void main(String[] args) {

        Random random = new Random();

        //VARIABLES
        //Usuario y contraseña
        String usuario = "Alberto";
        String password = "Aspiradora";

        //Habitaciones
        int cocinaInt = 0, salonInt = 0, cuartoBañoInt = 0, dormitorioUnoInt = 0, dormitorioDosInt = 0;

        //CARGA
        int nivelBateria = 0;

        //String modoCompleto, modoCarga;
        //int estadoGeneral;
        //String baseCarga, salir;
        final double aspiradoFregado = 2.25;

        //Menu variables
        int opcionElegidaMenu;
        int opcionModo;
        int opcionElegidaMenuCaracteristicas;
        boolean repetir = true;

        //INTRODUCIR USUSARIO
        do {

            JOptionPane.showMessageDialog(null, "ASPIRADORA ROOMBA");

            usuario = JOptionPane.showInputDialog("Introduzca el usuario: ");

            password = JOptionPane.showInputDialog("Introduzca la contraseña: ");

            if (usuario.equals("Alberto") && password.equals("Aspiradora")) {

                JOptionPane.showMessageDialog(null, "Bienvenido:\n Has ingresado "
                        + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {

                JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                        + "Por favor ingrese un usuario y/o contraseña correctos",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);

                JOptionPane.showMessageDialog(null, "El usuario es Alberto y la contraseña es Aspiradora");
            }

        } while (!usuario.equals("Alberto") && !password.equals("Aspiradora"));

        //INTRODUCIR NUMERO DEPENDECIAS Y METROS
        do {

            String cocina = JOptionPane.showInputDialog("Introduzca los metros cuadrados de la cocina: ");

            cocinaInt = Integer.parseInt(cocina);

        } while (cocinaInt < 0 || cocinaInt > 100);

        do {

            String salon = JOptionPane.showInputDialog("Introduzca los metros cuadrados del salón: ");

            salonInt = Integer.parseInt(salon);

        } while (salonInt < 0 || salonInt > 100);

        do {

            String cuartoBaño = JOptionPane.showInputDialog("Introduzca los metros cuadrados del cuartobaño: ");

            cuartoBañoInt = Integer.parseInt(cuartoBaño);

        } while (cuartoBañoInt < 0 || cuartoBañoInt > 100);

        do {

            String dormitorioUno = JOptionPane.showInputDialog("Introduzca los metros cuadrados del dormitorio 1: ");

            dormitorioUnoInt = Integer.parseInt(dormitorioUno);

        } while (dormitorioUnoInt < 0 || dormitorioUnoInt > 100);

        do {

            String dormitorioDos = JOptionPane.showInputDialog("Introduzca los metros cuadrados del dormitorio 2: ");

            dormitorioDosInt = Integer.parseInt(dormitorioDos);

        } while (dormitorioDosInt < 0 || dormitorioDosInt > 100);

        JOptionPane.showMessageDialog(null, "Los metros cuadrados de la dependencias son: " + " cocina: " + cocinaInt + " m2" + " salón: " + salonInt + " m2" + " cuarto de baño: " + cuartoBañoInt + " m2"
                + " dormitorio 1: " + dormitorioUnoInt + " m2" + " dormitorio 2: " + dormitorioDosInt + " m2");

        //INTRODUCIR NIVEL BATERIA
        do {

            String bateria = JOptionPane.showInputDialog(
                    null, "Introduzca el nivel de bateria (0-100");

            nivelBateria = Integer.parseInt(bateria);
        } while (nivelBateria <= 0 || nivelBateria > 100);

        JOptionPane.showMessageDialog(
                null, "El nivel de bateria es: " + nivelBateria + " %");

        //MENU PRINCIPAL - CONFIGURAR SALIR
        do {

            do {

                String menu = JOptionPane.showInputDialog(null, "MENU ASPIRADORA \nEliga una opción:"
                        + "\n1.- Configurar sistema\n"
                        + "0.- Salir del programa\n");
                //Recoger una variable por consola
                opcionElegidaMenu = Integer.parseInt(menu);

            } while (opcionElegidaMenu < 0 || opcionElegidaMenu > 1);

            switch (opcionElegidaMenu) {

                // CONFIGURAR SISTEMA
                case 1:

                    //Introducir nivel bateria
                    JOptionPane.showMessageDialog(
                            null, "Ha entrado usted configurar sistema");

                    //MODOS DE USO
                    do {

                        String menuModo = JOptionPane.showInputDialog(null, "MENU MODO\nEliga una opción:\n1.- Modo completo"
                                + "\n2.- Modo dependencias\n"
                                + "3.- Aspirado y fregado\n");
                        //Recoger una variable por consola
                        opcionModo = Integer.parseInt(menuModo);

                        if (opcionModo == 1) {

                            JOptionPane.showMessageDialog(
                                    null, "Ha entrado usted en Modo completo");

                            if (nivelBateria <= 0) {
                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                    JOptionPane.showMessageDialog(
                                            null, "El nivel de bateria es: " + nivelBateria + " %");

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                        } else if (opcionModo == 2) {

                            JOptionPane.showMessageDialog(
                                    null, "Ha entrado usted en Modo dependencias");

                            if (nivelBateria <= 0) {
                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                    JOptionPane.showMessageDialog(
                                            null, "El nivel de bateria es: " + nivelBateria + " %");

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                        } else if (opcionModo == 3) {

                            JOptionPane.showMessageDialog(
                                    null, "Ha entrado usted en Aspiracion y fregado");

                            nivelBateria = (int) (nivelBateria / aspiradoFregado);

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            if (nivelBateria <= 0) {
                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                    JOptionPane.showMessageDialog(
                                            null, "El nivel de bateria es: " + nivelBateria + " %");

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                        }

                    } while (opcionModo < 0 || opcionModo > 3);

                    //MENU CARACTERISTICAS
                    do {

                        do {

                            String menuCaracteristicas = JOptionPane.showInputDialog(null, "MENU CARACTERISTICAS\nEliga una opción:\n1.- Fecha y Hora"
                                    + "\n2.- Nivel de Bateria\n"
                                    + "3.- Lugar donde esta parado\n"
                                    + "4.- Dependencias y metros cuadrados\n"
                                    + "5. - Salir del menu\n");
                            //Recoger una variable por consola
                            opcionElegidaMenuCaracteristicas = Integer.parseInt(menuCaracteristicas);

                            if (opcionElegidaMenuCaracteristicas == 1) {

                                LocalDateTime locaDate = LocalDateTime.now();
                                int horas = locaDate.getHour();
                                int minutos = locaDate.getMinute();
                                int segundos = locaDate.getSecond();

                                JOptionPane.showMessageDialog(null, "Hora actual : " + horas + ":" + minutos + ":" + segundos);

                            } else if (opcionElegidaMenuCaracteristicas == 2) {

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es: " + nivelBateria + " %");

                            } else if (opcionElegidaMenuCaracteristicas == 3) {

                            } else if (opcionElegidaMenuCaracteristicas == 4) {

                                JOptionPane.showMessageDialog(null, "Los metros cuadrados de la dependencias son: " + " cocina: " + cocinaInt + " m2" + " salón: " + salonInt + " m2" + " cuarto de baño: " + cuartoBañoInt + " m2"
                                        + " dormitorio 1: " + dormitorioUnoInt + " m2" + " dormitorio 2: " + dormitorioDosInt + " m2");

                            } else if (opcionElegidaMenuCaracteristicas == 5) {

                                JOptionPane.showMessageDialog(null, "Saliendo del menu...");

                            }

                        } while (opcionElegidaMenuCaracteristicas < 0 || opcionElegidaMenuCaracteristicas > 5);

                        int op = JOptionPane.showConfirmDialog(null,
                                "¿Deseas salir del menu?", "Salida del menú", JOptionPane.YES_NO_OPTION);

                        // System.out.println("Opcion: " + op); // Depuración
                        if (op == JOptionPane.YES_OPTION) {
                            // Quiere salir
                            System.out.println("Saliendo del menú...."); // Depuración
                            repetir = false; // Condición de parada del programa

                        } else {

                            System.out.println("Indique otra opcion:");
                        }

                    } while (repetir);

                //SALIDA
                default:

                    JOptionPane.showMessageDialog(
                            null, "Ha elegido usted salir del programa");

                    break;
            }

            //PREGUNTAR PARA SALIR
            int op = JOptionPane.showConfirmDialog(null,
                    "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

            // System.out.println("Opcion: " + op); // Depuración
            if (op == JOptionPane.YES_OPTION) {
                // Quiere salir
                JOptionPane.showMessageDialog(
                        null, "Saliendo del programa...."); // Depuración
                repetir = false; // Condición de parada del programa

            } else {

                JOptionPane.showMessageDialog(
                        null, "Indique otra instrucción a realizar:");
            }

        } while (repetir);

    }

}
