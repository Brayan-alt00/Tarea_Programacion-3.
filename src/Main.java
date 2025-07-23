import java.util.Scanner;

public class DecimalABinario{}
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese un número decimal: ");
                int decimal = sc.nextInt();
                String binario = "";

                if (decimal == 0) {
                        binario = "0";
                } else {
                        while (decimal > 0) {
                                int residuo = decimal % 2;
                                binario = residuo + binario;
                                decimal = decimal / 2;
                        }
                }

                System.out.println("El número en binario es: " + binario);
        }

// Item 2



public class AreaCirculo {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese el radio del círculo: ");
                double radio = sc.nextDouble();

                double area = Math.PI * Math.pow(radio, 2);

                System.out.println("El área del círculo es: " + area);
        }
}

// Item 3

public class AreaTriangulo {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Ingrese la base del triángulo: ");
                double base = sc.nextDouble();

                System.out.print("Ingrese la altura del triángulo: ");
                double altura = sc.nextDouble();

                double area = (base * altura) / 2;

                System.out.println("El área del triángulo es: " + area);
        }
}

// Item 4

public class NumeroPrimo {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int numero = sc.nextInt();

                if (numero <= 1) {
                        System.out.println("No es un número primo.");
                } else {
                        boolean primo = true;
                        for (int i = 2; i < numero; i++) {
                                if (numero % i == 0) {
                                        primo = false;
                                        break;
                                }
                        }

                        if (primo) {
                                System.out.println("El número es primo.");
                        } else {
                                System.out.println("El número no es primo.");
                        }
                }
        }
}

// Item 5

public class ConversionTiempo {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de segundos: ");
                int segundos = sc.nextInt();

                int horas = segundos / 3600;
                int minutos = (segundos % 3600) / 60;
                int sobrantes = segundos % 60;

                System.out.println("Horas: " + horas);
                System.out.println("Minutos: " + minutos);
                System.out.println("Segundos restantes: " + sobrantes);
        }
}

// item 6

public class MatrizFrutas {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                String[][] frutas = {
                        {"Banano", "Cereza"},
                        {"Fresa", "Kiwi"},
                        {"Manzana", "Pera"}
                };

                System.out.print("Ingrese el nombre de la fruta a buscar: ");
                String frutaBuscar = sc.nextLine();

                boolean encontrado = false;

                for (int i = 0; i < frutas.length; i++) {
                        for (int j = 0; j < frutas[i].length; j++) {
                                if (frutas[i][j].equalsIgnoreCase(frutaBuscar)) {
                                        System.out.println("Fruta encontrada en fila " + i + ", columna " + j);
                                        encontrado = true;
                                }
                        }
                }

                if (!encontrado) {
                        System.out.println("Fruta no encontrada.");
                }

                System.out.println("\nContenido completo de la matriz:");
                for (int i = 0; i < frutas.length; i++) {
                        for (int j = 0; j < frutas[i].length; j++) {
                                System.out.println("Fila " + i + ", Columna " + j + ": " + frutas[i][j]);
                        }
                }
        }
}
