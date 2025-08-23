import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BonusTrack1 {
    public static void main(String[] args) {
        int opcion = 1, cantidadpacientes, edadPaciente, mayores78 = 0, cantidadPrestadores, masDe10Pacientes = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (opcion != 0) {

            try {
                System.out.println("elija una opción:\n1.\n2.\n3.\n4.");
                opcion = Integer.valueOf(entrada.readLine());
                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Ingrese la cantidad de pacientes(hasta 15)");
                            cantidadpacientes = Integer.valueOf(entrada.readLine());
                            if (cantidadpacientes > 15) {
                                System.out.println("La cantidad de pacientes excede el limite");
                            } else {

                                for (int i = 1; i <= cantidadpacientes; i++) {
                                    System.out.println("ingrese la edad del paciente" + i);
                                    edadPaciente = Integer.valueOf(entrada.readLine());
                                    if (edadPaciente > 78) {
                                        mayores78++;

                                    }

                                }
                                System.out.println("hay " + mayores78 + " pacientes mayores de 78 años");
                            }

                        } catch (Exception e) {

                        }

                        break;
                    case 2:
                        try {
                            System.out.println("Ingrese la cantidad de prestadores de servicio(hasta 10)");
                            cantidadPrestadores = Integer.valueOf(entrada.readLine());
                            if (cantidadPrestadores > 10) {
                                System.out.println("ingresaste un numero mayor al limite");
                            } else {
                                for (int i = 1; i <= cantidadPrestadores; i++) {
                                    System.out
                                            .println("Ingrese cuantos pacientes se han atendido en los ultimos 2 dias");
                                    cantidadpacientes = Integer.valueOf(entrada.readLine());
                                    if (cantidadpacientes > 10) {
                                        masDe10Pacientes++;

                                    }

                                }
                                System.out.println(masDe10Pacientes
                                        + " prestadores han atendido a mas de 10 pacientes en los ultimos 2 dias");
                            }

                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    case 3:
                        int femenino, masculino, edad = 0, promedioHombres, promedioMujeres;
                        try {
                            System.out.println("Ingrese la cantidad de mujeres(hasta 10)");
                            femenino = Integer.valueOf(entrada.readLine());
                            System.out.println("Ingrese la cantidad de hombres(hasta 10)");
                            masculino = Integer.valueOf(entrada.readLine());
                            if (femenino > 10 || masculino > 10) {
                                System.out.println("pusiste mas de 10 hombres o mas de 10 mujeres");

                            } else {
                                for (int i = 1; i <= femenino; i++) {
                                    System.out.println("Ingrese la edad de la mujer" + i);
                                    edad += Integer.valueOf(entrada.readLine());

                                }
                                promedioMujeres = edad / femenino;
                                System.out.println("el promedio de edad de las mujeres es: " + promedioMujeres);
                                edad = 0;
                                for (int i = 1; i <= masculino; i++) {
                                    System.out.println("Ingrese la edad del hombre " + i);
                                    edad += Integer.valueOf(entrada.readLine());

                                }
                                promedioHombres = edad / masculino;
                                System.out.println("el promedio de edad de los hombres es de: " + promedioHombres);
                            }

                        } catch (Exception e) {
                            // TODO: handle exception
                        }

                    case 4:
                        try {
                            System.out.println("Ingresa la cantidad de pacientes");
                            cantidadpacientes = Integer.valueOf(entrada.readLine());
                            int pacientesConCobertura = 0, pacientesSinCobertura, paciente = 1;
                            while (paciente <= cantidadpacientes) {
                                System.out.println("El paciente " + paciente
                                        + " tiene obra social? (ingrese 1 en caso de afirmativo o un 0 en caso de negativo)");
                                int respuesta = Integer.valueOf(entrada.readLine());
                                if (respuesta == 0 || respuesta == 1) {
                                    paciente++;
                                    pacientesConCobertura += respuesta;

                                } else {
                                    System.out.println("lee bien capo");

                                }

                            }
                            pacientesSinCobertura = (cantidadpacientes - pacientesConCobertura);
                            System.out.println(pacientesSinCobertura + " Pacientes no tienen cobertura");

                        } catch (Exception e) {
                            // TODO: handle exception
                        }

                    default:
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
