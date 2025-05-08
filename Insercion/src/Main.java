public class Main {
            public static void main(String[] args) {
                int[] numeros = {5, 2, 9, 1, 3, 4, 10};

                System.out.println("Arreglo original: ");
                imprimir(numeros);

                ordenInsercion(numeros);

                System.out.println("Ya ordenado: ");
                imprimir(numeros);
            }



            public static void ordenInsercion(int[] arreglo) {
                for (int i = 1; i < arreglo.length; i++) {
                    int clave = arreglo[i];
                    int j = i - 1;

                    while (j >= 0 && arreglo[j] > clave) {
                        arreglo[j + 1] = arreglo[j];
                        j = j - 1;
                    }
                    arreglo[j + 1] = clave;
                }
            }

            public static void imprimir(int[] arreglo) {
                for (int num : arreglo) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }


