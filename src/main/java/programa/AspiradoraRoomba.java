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
        int cocinaInt = 0, salonInt = 0, cuartoBañoInt = 0, dormitorioUnoInt = 0, dormitorioDosInt = 0;

        //Variable para establecer la carga de la bateria de tipo enttero e inicializada a 0 
        //y otra variable de tipo double para la bateria actual
        int nivelBateria = 0;
        double bateriaActual = 0;

        //Una constante de tipo double para establecer el gasto de bateria en el modo aspiración y fregado
        final double aspiracionMetroCuadrado = 1.50;
        final double aspiradoFregado = 2.25;

        //Variables de tipo entero para establecer las opciones del menu
        int opcionElegidaMenu;
        int opcionModo;
        int opcionElegidaMenuCaracteristicas;

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

        //Se muestra los metros de cada dependencia introducida
        JOptionPane.showMessageDialog(null, "Los metros cuadrados de la dependencias son: " + " cocina: " + cocinaInt + "m2," + " salón: " + salonInt + "m2," + " cuarto de baño: " + cuartoBañoInt + "m2,"
                + " dormitorio 1: " + dormitorioUnoInt + "m2," + " dormitorio 2: " + dormitorioDosInt + "m2");

        //INTRODUCIR NIVEL BATERIA
        //Bucle do-while donde el nivel de bateria no puede tener un valor fuera del rango 0-100
        do {

            String bateria = JOptionPane.showInputDialog(
                    null, "Introduzca el nivel de bateria (0-100");

            nivelBateria = Integer.parseInt(bateria);
        } while (nivelBateria < 0 || nivelBateria > 100);

        //Se muestra el nivel de bateria
        JOptionPane.showMessageDialog(
                null, "El nivel de bateria es: " + nivelBateria + " %");

        //MENU PRINCIPAL - CONFIGURAR Y SALIR
        //Con este do-while se repetira el bucle en caso de elegir no salir del programa
        do {

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
                                    null, "Empezando por la cocina: " + cocinaInt);

                            for (int i = 0; i > cocinaInt; i++) {

                                bateriaActual = nivelBateria - aspiracionMetroCuadrado;

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + bateriaActual + " %");

                            if (bateriaActual < 3) {

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

                                for (bateriaActual = 0; bateriaActual < 100; bateriaActual++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + bateriaActual + " %");

                            }

                            //SALON
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el salón: " + salonInt);

                            for (int i = 0; i > salonInt; i++) {

                                bateriaActual = nivelBateria - aspiracionMetroCuadrado;

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + bateriaActual + " %");
                            
                            
                            if (bateriaActual < 3) {

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

                                for (bateriaActual = 0; bateriaActual < 100; bateriaActual++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + bateriaActual + " %");

                            }
                            
                            
                            
                            
                              //CUARTO DE BAÑO
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el cuarto de baño: " + cuartoBañoInt);

                            for (int i = 0; i > cuartoBañoInt; i++) {

                                bateriaActual = nivelBateria - aspiracionMetroCuadrado;

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + bateriaActual + " %");
                            
                            
                            if (bateriaActual < 3) {

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

                                for (bateriaActual = 0; bateriaActual < 100; bateriaActual++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + bateriaActual + " %");

                            }

                            
                                  //Dormitorio 1
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el dormitorio 1: " + dormitorioUnoInt);

                            for (int i = 0; i > dormitorioUnoInt; i++) {

                                bateriaActual = nivelBateria - aspiracionMetroCuadrado;

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + bateriaActual + " %");
                            
                            
                            if (bateriaActual < 3) {

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

                                for (bateriaActual = 0; bateriaActual < 100; bateriaActual++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + bateriaActual + " %");

                            }
                            
                            
                                   //Dormitorio 2
                            JOptionPane.showMessageDialog(
                                    null, "Empezando por el dormitorio 2: " + dormitorioDosInt);

                            for (int i = 0; i > dormitorioDosInt; i++) {

                                bateriaActual = nivelBateria - aspiracionMetroCuadrado;

                            }

                            JOptionPane.showMessageDialog(
                                    null, "El nivel de bateria es: " + bateriaActual + " %");
                            
                            
                            if (bateriaActual < 3) {

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

                                for (bateriaActual = 0; bateriaActual < 100; bateriaActual++) {

                                }

                                JOptionPane.showMessageDialog(
                                        null, "Carga de la bateria completa: " + bateriaActual + " %");

                            }

                           

                        } else if (opcionModo == 2) {

                            JOptionPane.showMessageDialog(
                                    null, "Ha entrado usted en Modo dependencias");

                            if (nivelBateria < 3) {
                                //BASE CARGA
                                JOptionPane.showMessageDialog(
                                        null, "Ha entrado usted en Base de carga: Entrando en modo de carga de bateria "
                                        + "espere hasta que la carga llegue al 100%");

                                for (nivelBateria = 0; nivelBateria < 100; nivelBateria++) {

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

                        //Si se cumple la condicion del while, se repite el bucle
                    } while (opcionModo < 0 || opcionModo > 3);

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

                                JOptionPane.showMessageDialog(
                                        null, "El aspirador se encuentra parado en: " + nivelBateria);

                                //Se muestran las dependencias y sus metros cuadrados
                            } else if (opcionElegidaMenuCaracteristicas == 4) {

                                JOptionPane.showMessageDialog(null, "Los metros cuadrados de la dependencias son: " + " cocina: " + cocinaInt + "m2," + " salón: " + salonInt + "m2," + " cuarto de baño: " + cuartoBañoInt + "m2,"
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
                            repetir = false; // Condición de parada del programa

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
