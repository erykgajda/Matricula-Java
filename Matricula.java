package Ejercicios.others;

import java.util.Scanner;

public class Matricula {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String tipoCurso;
        String tipoGrado;
        String repetidor = "";
        String especialidad = "";
        int edad;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bienvenido al IES Torrevigia");
            System.out.println("Vas hacer la telematricula con lo que quiero que me indiques algunos datos:");

            System.out.println("Introduceme tu nombre: ");
            nombre = scanner.nextLine();

            System.out.println("Introduceme tu apellido: ");
            apellido = scanner.nextLine();

            System.out.println("Introduceme tu edad: ");
            edad = scanner.nextInt();
            scanner.nextLine();

            if (edad < 18) {
                System.out.println("Eres menor de edad, necesitas una autorización de tus padres");
                return;
            } else {
                System.out.println("Eres mayor de edad puedes hacer tu matricula");
            }

            System.out.println("¿Eres repetidor?");
            repetidor = scanner.nextLine().toLowerCase();

            if (repetidor.equals("si")) {
                System.out.println("No podrás continuar con tu matricula.");
                return;
            } else if (repetidor.equals("no")) {
                System.out.println("Puedes continuar con tu matricula.");
            } else {
                System.out.println("No ha introducido nada correcto, diga si/no");
                return;
            }

            System.out.println(" ");
            System.out.println("Introduceme al curso que quieres matricular: (eso/fpmedio/fpsuperior/batchiller) ");
            tipoCurso = scanner.nextLine();

            switch (tipoCurso.toLowerCase()) {
                case "eso":
                    System.out.println("Matricula guardada para la ESO");
                    break;
                case "fpmedio":
                case "fpsuperior":
                    System.out.println("Matricula guardada para " + (tipoCurso.equals("fpmedio") ? "FP Medio" : "FP Superior") + ".");
                    System.out.println("Si es tan amable eliga su tipo de especialidad para la FP.");
                    if (tipoCurso.equals("fpmedio")) {
                        System.out.println("1. Gestion administrativa (gestion).");
                        System.out.println("2. Sistemas microinformática en red (smr).");
                    } else {
                        System.out.println("1. Administracion y finanzas (administracion).");
                        System.out.println("2. Desarrollo en multiplataforma de web (web).");
                    }

                    System.out.println("Introduce el tipo de especialidad para "+tipoCurso+".");

                    int opcionEspecialidad = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoCurso.equals("fpmedio")) {
                        especialidad = (opcionEspecialidad == 1) ? "Gestión administrativa" : "Sistemas microinformáticos y redes";
                    } else {
                        especialidad = (opcionEspecialidad == 1) ? "Administración y finanzas" : "Desarrollo multiplataforma";
                    }

                    System.out.println("Has seleccionado " + especialidad + " como tu especialidad.");
                    break;
                case "batchiller":
                    System.out.println("Matricula guardada para Batchiller");
                    System.out.println("Por favor elige un tipo de modalidad:");
                    System.out.println("1. Ciencias");
                    System.out.println("2. Humanidades");
                    System.out.println("3. Artes");
                    System.out.println("4. Mixto");

                    System.out.println("Digame el numero de tu modalidad al que quieres matricularte: ");
                    int opcionModalidad = scanner.nextInt();
                    scanner.nextLine();

                    especialidad = switch (opcionModalidad) {
                        case 1 -> "Ciencias";
                        case 2 -> "Humanidades";
                        case 3 -> "Artes";
                        case 4 -> "Mixto";
                        default -> "Desconocido";
                    };

                    if (!especialidad.equals("Desconocido")) {
                        System.out.println("Has seleccionado el Batchiller de "+especialidad+".");
                    } else {
                        System.out.println("Opcion no valida, intentalo de nuevo.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Hubo un fallo en nuestro sistema, intentalo de nuevo.");
                    return;
            }

            System.out.println("Muy bien ya solicitaste el curso que es: " + tipoCurso);
            System.out.println("A continuación dime que año es: 1/2/3/4");
            tipoGrado = scanner.nextLine();

            switch (tipoGrado.toLowerCase()) {
                case "1":
                    System.out.println("Has selecionado que sera tu primer año en " + tipoCurso);
                    break;
                case "2":
                    System.out.println("Has seleccionado que sera tu segundo año en " + tipoCurso);
                    break;
                case "3", "4":
                    if (tipoCurso.equals("eso")) {
                        System.out.println("Has seleccionado el año "+tipoGrado+" para el curso de "+tipoCurso);
                    } else {
                        System.out.println("Lo sentimos pero no existe un año para este curso de "+tipoCurso);
                    }
                    break;
                default:
                    System.out.println("Hubo un error en nuestro sistema, intentalo de nuevo.");
                    return;
            }

            System.out.println("\nGracias por realizar la matrícula. A continuación, dejo la información:");
            System.out.println("Nombre registrado: " + nombre + ".");
            System.out.println("Apellido registrado: " + apellido + ".");
            System.out.println("Edad registrada: " + edad + ".");
            System.out.println("¿Repetidor?: " + repetidor + ".");
            System.out.println("Curso que va a realizar: " + tipoCurso + ".");
            if (tipoCurso.equals("fpmedio") || (tipoCurso.equals("fpsuperior") || (tipoCurso.equals("batchiller")))) {
                System.out.println("Especialidad seleccionada: " + especialidad + ".");
            } else {
                System.out.println("No se requiere especialidad.");
            }
            System.out.println("Grado que va a realizar: " + tipoGrado + ".");

        } finally {
            scanner.close();
        }
    }
}
