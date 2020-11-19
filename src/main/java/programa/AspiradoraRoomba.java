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
        //Usuario y contraseña, variables de tipo String
        String usuario = "Alberto";
        String password = "Aspiradora";

        //Habitaciones declaradas como variables de tipo entero e inicializadas a 0
        int cocinaInt = 0, salonInt = 0, cuartoBanioInt = 0, dormitorioUnoInt = 0, dormitorioDosInt = 0;

        //Variable para establecer la carga de la bateria de tipo enttero e inicializada a 0 
        int nivelBateria = 0;

        //Una constante de tipo double para establecer el gasto de bateria en el modo aspiración y fregado
        final double aspiracionMetroCuadrado = 1.50;
        final double aspiradoFregado = 2.25;
        int metrosLimpiados = 0;

        //Variables de tipo entero para establecer las opciones de los distintos menus
        int opcionElegidaMenu;
        int menuHabitaciones;
        int opcionModo;
        int opcionElegidaMenuCaracteristicas;

        //Variable string para saber el lugar donde esta parado
        String lugarParado = null;

        //Variable de tipo booleano para establecer la salida del programa
        boolean repetir = true;

        //INTRODUCIR USUSARIO
        //Bucle deo-while para repetir en caso de introducir mal el usuario y contraseña
        do {

            JOptionPane.showMessageDialog(null, "ASPIRADORA ROOMBA");

            usuario = JOptionPane.showInputDialog("Introduzca el usuario: ");

            password = JOptionPane.showInputDialog("Introduzca la contraseña: ");

            //Si se introduce el usuario y la contraseña de forma correcta, aparece mensaje de confirmacion
            // y se sale del bucle
            if (usuario.equals("Alberto") && password.equals("Aspiradora")) {

                JOptionPane.showMessageDialog(null, "Bienvenido:\n Has ingresado "
                        + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                        JOptionPane.INFORMATION_MESSAGE);

                //En caso contrario se muestra mensaje de error y se volveria a pedir los datos
            } else {

                JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                        + "Por favor ingrese un usuario y/o contraseña correctos",
                        "Acceso denegado", JOptionPane.ERROR_MESSAGE);

                JOptionPane.showMessageDialog(null, "El usuario es Alberto y la contraseña es Aspiradora");
            }
            //Si se cumple la condición del while, se repite el bucle
        } while (!usuario.equals("Alberto") && !password.equals("Aspiradora"));

        //INTRODUCIR NUMERO DEPENDECIAS Y METROS
        //Con este do-while se repetira el bucle en caso de elegir no salir del programa
        do {
            //Bucle do-while para cada dependencia donde los m2 no pueden pasar del valor 0-100
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

                cuartoBanioInt = Integer.parseInt(cuartoBaño);

            } while (cuartoBanioInt < 0 || cuartoBanioInt > 100);

            do {

                String dormitorioUno = JOptionPane.showInputDialog("Introduzca los metros cuadrados del dormitorio 1: ");

                dormitorioUnoInt = Integer.parseInt(dormitorioUno);

            } while (dormitorioUnoInt < 0 || dormitorioUnoInt > 100);

            do {

                String dormitorioDos = JOptionPane.showInputDialog("Introduzca los metros cuadrados del dormitorio 2: ");

                dormitorioDosInt = Integer.parseInt(dormitorioDos);

            } while (dormitorioDosInt < 0 || dormitorioDosInt > 100);

            //Se muestra los metros de cada dependencia introducida
            JOptionPane.showMessageDialog(null, "Los metros cuadrados de la dependencias son: " + " cocina: " + cocinaInt + "m2," + " salón: " + salonInt + "m2," + " cuarto de baño: " + cuartoBanioInt + "m2,"
                    + " dormitorio 1: " + dormitorioUnoInt + "m2," + " dormitorio 2: " + dormitorioDosInt + "m2");

            //INTRODUCIR NIVEL BATERIA
            //Bucle do-while donde el nivel de bateria no puede tener un valor fuera del rango 0-100
            do {

                String bateria = JOptionPane.showInputDialog(
                        null, "Introduzca el nivel de bateria (0-100");

                nivelBateria = Integer.parseInt(bateria);
            } while (nivelBateria < 0 || nivelBateria > 100);

            //BASE CARGA
            if (nivelBateria < 3) {

                JOptionPane.showMessageDialog(
                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                        + "espere hasta que la carga llegue al 100%");

                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                }

                JOptionPane.showMessageDialog(
                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                JOptionPane.showMessageDialog(
                        null, "El nivel de bateria es: " + nivelBateria + " %");

            }

            //Se muestra el nivel de bateria
            JOptionPane.showMessageDialog(
                    null, "El nivel de bateria es: " + nivelBateria + " %");

            //MENU PRINCIPAL - CONFIGURAR Y SALIR
            //Se tendria que elegir una opcion que no se salga de los parametros establecidos
            
            do {

                String menu = JOptionPane.showInputDialog(null, "MENU ASPIRADORA \nEliga una opción:"
                        + "\n1.- Configurar sistema\n"
                        + "0.- Salir del programa\n");
                //Recoger una variable por consola
                opcionElegidaMenu = Integer.parseInt(menu);

            } while (opcionElegidaMenu < 0 || opcionElegidaMenu > 1);

            //Estrcutura Switch asociado cada case a una opcion del menú
            switch (opcionElegidaMenu) {

                // CONFIGURAR SISTEMA
                case 1:

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

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            //COCINA
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por la cocina: " + cocinaInt+ "m2");

                            for (int i = 0; i < cocinaInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiracionMetroCuadrado);
                                
                                metrosLimpiados++;

                            }
                            

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");
                            
                             JOptionPane.showMessageDialog(
                                    null, "Los metros limpiados son: " + metrosLimpiados + "m2");

                            JOptionPane.showMessageDialog(
                                    null, "La dependencia limpiada es la cocina");

                            if (nivelBateria < 3) {

                                lugarParado = "Cocina";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina");

                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina");

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                            //SALON
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el salón: " + salonInt);

                            for (int i = 0; i < salonInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiracionMetroCuadrado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            JOptionPane.showMessageDialog(
                                    null, "La dependencia limpiada es la cocina y el salón");

                            if (nivelBateria < 3) {

                                lugarParado = "Salón";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                lugarParado = "Salón";

                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina y el salón");

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                            //CUARTO DE BAÑO
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el cuarto de baño: " + cuartoBanioInt);

                            for (int i = 0; i < cuartoBanioInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiracionMetroCuadrado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            if (nivelBateria < 3) {

                                lugarParado = "Cuarto de baño";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon y el cuarto de baño");
                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon y el cuarto de baño");

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                            //Dormitorio 1
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el dormitorio 1: " + dormitorioUnoInt);

                            for (int i = 0; i < dormitorioUnoInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiracionMetroCuadrado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            if (nivelBateria < 3) {

                                lugarParado = "Dormitorio 1";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon, el cuarto de baño y el dormitorio 1");
                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon, el cuarto de baño y el dormitorio 1");

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                            //Dormitorio 2
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el dormitorio 2: " + dormitorioDosInt);

                            for (int i = 0; i < dormitorioDosInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiracionMetroCuadrado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            if (nivelBateria < 3) {

                                lugarParado = "Dormirtorio 2";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon, el cuarto de baño, el dormitorio 1 y el dormitorio 2");
                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon, el cuarto de baño, el dormitorio 1 y el dormitorio 2");

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                        } else if (opcionModo == 2) {

                            JOptionPane.showMessageDialog(
                                    null, "Ha entrado usted en Modo dependencias");

                            do {

                                String menu = JOptionPane.showInputDialog(null, "MENU HABITACIONES \nEliga una opción:"
                                        + "\n1.- Cocina\n"
                                        + "2.- Salón\n"
                                        + "3.- Cuarto de baño\n"
                                        + "4.- Dormitorio 1\n"
                                        + "5.- Dormitorio 2\n");
                                //Recoger una variable por consola
                                menuHabitaciones = Integer.parseInt(menu);

                            } while (menuHabitaciones < 0 || menuHabitaciones > 5);

                            switch (menuHabitaciones) {

                                case 1:

                                    //COCINA
                                    JOptionPane.showMessageDialog(
                                            null, "Empezando por la cocina: " + cocinaInt);

                                    for (int i = 0; i < cocinaInt; i++) {

                                        nivelBateria = (int) (nivelBateria - aspiradoFregado);

                                    }

                                    lugarParado = "Cocina";

                                    JOptionPane.showMessageDialog(
                                            null, "El nivel de bateria es: " + nivelBateria + " %");

                                    JOptionPane.showMessageDialog(
                                            null, "La dependencia limpiada es la cocina");

                                    if (nivelBateria < 3) {

                                        lugarParado = "Cocina";

                                        JOptionPane.showMessageDialog(
                                                null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                        JOptionPane.showMessageDialog(
                                                null, "La dependencia limpiada es la cocina");

                                    }

                                    break;

                                case 2:

                                    //SALON
                                    JOptionPane.showMessageDialog(
                                            null, "Empezando por la cocina: " + salonInt);

                                    for (int i = 0; i < salonInt; i++) {

                                        nivelBateria = (int) (nivelBateria - aspiradoFregado);

                                    }

                                    lugarParado = "Salón";

                                    JOptionPane.showMessageDialog(
                                            null, "El nivel de bateria es: " + nivelBateria + " %");

                                    JOptionPane.showMessageDialog(
                                            null, "La dependencia limpiada es el salón");

                                    if (nivelBateria < 3) {

                                        lugarParado = "Salón";

                                        JOptionPane.showMessageDialog(
                                                null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                        JOptionPane.showMessageDialog(
                                                null, "La dependencia limpiada es el salón");

                                    }

                                    break;

                                case 3:

                                    //CUARTO DE BAÑO
                                    JOptionPane.showMessageDialog(
                                            null, "Empezando por la cocina: " + cuartoBanioInt);

                                    for (int i = 0; i < cuartoBanioInt; i++) {

                                        nivelBateria = (int) (nivelBateria - aspiradoFregado);

                                    }

                                    lugarParado = "Cuarto de baño";

                                    JOptionPane.showMessageDialog(
                                            null, "El nivel de bateria es: " + nivelBateria + " %");

                                    JOptionPane.showMessageDialog(
                                            null, "La dependencia limpiada es el cuarto de baño");

                                    if (nivelBateria < 3) {

                                        lugarParado = "Cuarto de Baño";

                                        JOptionPane.showMessageDialog(
                                                null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                        JOptionPane.showMessageDialog(
                                                null, "La dependencia limpiada es el cuarto de baño");

                                    }

                                    break;

                                case 4:

                                    //DORMITORIO 1
                                    JOptionPane.showMessageDialog(
                                            null, "Empezando por el dormitorio 1: " + dormitorioUnoInt);

                                    for (int i = 0; i < dormitorioUnoInt; i++) {

                                        nivelBateria = (int) (nivelBateria - aspiradoFregado);

                                    }

                                    lugarParado = "Dormitorio 1";

                                    JOptionPane.showMessageDialog(
                                            null, "El nivel de bateria es: " + nivelBateria + " %");

                                    JOptionPane.showMessageDialog(
                                            null, "La dependencia limpiada es el dormitorio 1");

                                    if (nivelBateria < 3) {

                                        lugarParado = "Dormitorio 1";

                                        JOptionPane.showMessageDialog(
                                                null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                        JOptionPane.showMessageDialog(
                                                null, "La dependencia limpiada es el dormitorio 1");

                                    }

                                    break;

                                case 5:

                                    //Dormitorio 2
                                    JOptionPane.showMessageDialog(
                                            null, "Empezando por la cocina: " + dormitorioDosInt);

                                    for (int i = 0; i < dormitorioDosInt; i++) {

                                        nivelBateria = (int) (nivelBateria - aspiradoFregado);

                                    }

                                    lugarParado = "Dormitorio 2";

                                    JOptionPane.showMessageDialog(
                                            null, "El nivel de bateria es: " + nivelBateria + " %");

                                    JOptionPane.showMessageDialog(
                                            null, "La dependencia limpiada es el dormitorio 2");

                                    if (nivelBateria < 3) {

                                        lugarParado = "Dormitorio 2";

                                        JOptionPane.showMessageDialog(
                                                null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                        JOptionPane.showMessageDialog(
                                                null, "La dependencia limpiada es el dormitorio 2");

                                    }

                                    break;

                                default:

                                    JOptionPane.showMessageDialog(
                                            null, "Saliendo del menú");

                                    break;

                            }

                        } else if (opcionModo == 3) {

                            JOptionPane.showMessageDialog(
                                    null, "Ha entrado usted en Aspiracion y fregado");

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            //COCINA
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por la cocina: " + cocinaInt);

                            for (int i = 0; i < cocinaInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiradoFregado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            lugarParado = "Cocina";

                            if (nivelBateria < 3) {

                                lugarParado = "Cocina";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina");
                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                            //SALON
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el salón: " + salonInt);

                            for (int i = 0; i < salonInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiradoFregado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            lugarParado = "Salón";

                            if (nivelBateria < 3) {

                                lugarParado = "Salón";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina y el salón");
                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                            //CUARTO DE BAÑO
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el cuarto de baño: " + cuartoBanioInt);

                            for (int i = 0; i < cuartoBanioInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiradoFregado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            lugarParado = "Cuarto de baño";

                            if (nivelBateria < 3) {

                                lugarParado = "Cuarto de baño";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon y el cuarto de baño");
                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                            //Dormitorio 1
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el dormitorio 1: " + dormitorioUnoInt);

                            for (int i = 0; i < dormitorioUnoInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiradoFregado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            lugarParado = "Dormitorio 1";

                            if (nivelBateria < 3) {

                                lugarParado = "Dormitorio 1";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon, el cuarto de baño y el dormitorio 1");
                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                            //Dormitorio 2
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el dormitorio 2: " + dormitorioDosInt);

                            for (int i = 0; i < dormitorioDosInt; i++) {

                                nivelBateria = (int) (nivelBateria - aspiradoFregado);

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + nivelBateria + " %");

                            lugarParado = "Dormitorio 2";

                            if (nivelBateria < 3) {

                                lugarParado = "Dormitorio 2";

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es insuficiente, la aspiradora se ha parado");

                                JOptionPane.showMessageDialog(
                                        null, "La dependencia limpiada es la cocina, el salon, el cuarto de baño, el dormitorio 1 y el dormitorio 2");
                                do {
                                    //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
                                    int op = JOptionPane.showConfirmDialog(null,
                                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                                    //Estructura if-else donde el usuario decidira si salir o no del menú
                                    if (op == JOptionPane.YES_OPTION) {
                                        // Quiere salir
                                        JOptionPane.showMessageDialog(
                                                null, "Saliendo del menú...."); // Depuración
                                        repetir = false; // Condición de parada del programa

                                    } else {

                                    }
                                } while (repetir);

                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + nivelBateria + " %");

                            }

                        }

                        //Si se cumple la condicion del while, se repite el bucle
                    } while (opcionModo < 0 || opcionModo > 3);

                    
                    
                    //BASE CARGA
                    if (nivelBateria < 3) {

                        JOptionPane.showMessageDialog(
                                null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                + "espere hasta que la carga llegue al 100%");

                        for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

                        }

                        JOptionPane.showMessageDialog(
                                null, "Carga de la bateria completa: " + nivelBateria + " %");

                        JOptionPane.showMessageDialog(
                                null, "El nivel de bateria es: " + nivelBateria + " %");

                    }

                    //MENU CARACTERISTICAS
                    do {
                        //Se tendria que elegir una opcion que no se salga de los parametros establecidos
                        do {

                            String menuCaracteristicas = JOptionPane.showInputDialog(null, "MENU CARACTERISTICAS\nEliga una opción:\n1.- Fecha y Hora"
                                    + "\n2.- Nivel de Bateria\n"
                                    + "3.- Lugar donde esta parado\n"
                                    + "4.- Dependencias y metros cuadrados\n"
                                    + "5. - Salir del menu\n");
                            //Recoger una variable por consola
                            opcionElegidaMenuCaracteristicas = Integer.parseInt(menuCaracteristicas);

                            //Se obitiene la hora, minutos y segundos actuales usando la clase LocalDateTime y instanciandola con
                            // LocalDateTime.now
                            if (opcionElegidaMenuCaracteristicas == 1) {

                                //Usando la funcion get. para tomar la hora, minutos y segundos
                                LocalDateTime locaDate = LocalDateTime.now();
                                int horas = locaDate.getHour();
                                int minutos = locaDate.getMinute();
                                int segundos = locaDate.getSecond();

                                JOptionPane.showMessageDialog(null, "Hora actual : " + horas + ":" + minutos + ":" + segundos);

                                //Se muestra el niveld de batería
                            } else if (opcionElegidaMenuCaracteristicas == 2) {

                                JOptionPane.showMessageDialog(
                                        null, "El nivel de bateria es: " + nivelBateria + " %");

                                //Se muestra el lugar donde esta parado la aspiradora
                            } else if (opcionElegidaMenuCaracteristicas == 3) {

                                if (lugarParado.equals("Cocina")) {

                                    JOptionPane.showMessageDialog(null, "La aspiradora se ha quedado parada en la cocina");

                                } else if (lugarParado.equals("Salón")) {

                                    JOptionPane.showMessageDialog(null, "La aspiradora se ha quedado parada en el salón");
                                } else if (lugarParado.equals("Cuarto de baño")) {

                                    JOptionPane.showMessageDialog(null, "La aspiradora se ha quedado parada en el cuarto de baño");

                                } else if (lugarParado.equals("Dormitorio 1")) {

                                    JOptionPane.showMessageDialog(null, "La aspiradora se ha quedado parada en el dormitorio 1");

                                } else if (lugarParado.equals("Dormitorio 2")) {

                                    JOptionPane.showMessageDialog(null, "La aspiradora se ha quedado parada en el dormitorio 2");

                                }

                                //Se muestran las dependencias y sus metros cuadrados
                            } else if (opcionElegidaMenuCaracteristicas == 4) {

                                JOptionPane.showMessageDialog(null, "Los metros cuadrados de la dependencias son: " + " cocina: " + cocinaInt + "m2," + " salón: " + salonInt + "m2," + " cuarto de baño: " + cuartoBanioInt + "m2,"
                                        + " dormitorio 1: " + dormitorioUnoInt + "m2," + " dormitorio 2: " + dormitorioDosInt + "m2");

                                //Opción para salir del menú
                            } else if (opcionElegidaMenuCaracteristicas == 5) {

                                JOptionPane.showMessageDialog(null, "Saliendo del menu...");

                            }

                            //Si se cumle la condicion del while, se repite el bucle
                        } while (opcionElegidaMenuCaracteristicas < 0 || opcionElegidaMenuCaracteristicas > 5);

                        //Se pregunta al usuario si quiere salir del menú, con la ventana JOptionPane.YES_NO_OPTION
                        int op = JOptionPane.showConfirmDialog(null,
                                "¿Deseas salir del menu?", "Salida del menú", JOptionPane.YES_NO_OPTION);

                        // System.out.println("Opcion: " + op); // Depuración
                        //Estructura if-else donde el usuario decidira si salir o no del menú
                        if (op == JOptionPane.YES_OPTION) {
                            // Quiere salir
                            System.out.println("Saliendo del menú...."); // Depuración
                            repetir = false; // Con11dición de parada del programa

                        } else {

                            System.out.println("Indique otra opcion:");
                        }

                        //Si se cumple la condicion del while, el bucle se repetira, iniciando una nueva ejecución
                    } while (repetir);

                //SALIDA
                //Default de la estructura switch para salir del menú de modos de ejecución
                default:

                    JOptionPane.showMessageDialog(
                            null, "Ha elegido usted salir del programa");

                    break;
            }

            //PREGUNTAR PARA SALIR
            //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
            int op = JOptionPane.showConfirmDialog(null,
                    "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

            //Estructura if-else donde el usuario decidira si salir o no del programa
            if (op == JOptionPane.YES_OPTION) {
                // Quiere salir
                JOptionPane.showMessageDialog(
                        null, "Saliendo del programa...."); // Depuración
                repetir = false; // Condición de parada del programa

            } else {

                JOptionPane.showMessageDialog(
                        null, "Indique otra instrucción a realizar:");
            }

            //Si se cumple la condicion del while, el bucle se repetira, iniciando una nueva ejecución
        } while (repetir);

    }

}
