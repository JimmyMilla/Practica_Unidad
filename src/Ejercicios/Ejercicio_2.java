package Ejercicios;

public class Ejercicio_2 {

    public int i, j, k, infinito = 1000000;
    int matriz[][] = {{0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 0}, {0, 1, 0, 0, 1}, {1, 0, 1, 0, 1}};
    int matriz1[][] = new int[matriz.length][matriz.length];

    public void caminos() {
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == 0) {
                    matriz1[i][j] = infinito;
                } else {
                    matriz1[i][j] = matriz[i][j];
                }
            }
        }

        for (k = 0; k < matriz.length; k++) {
            for (i = 0; i < matriz.length; i++) {
                for (j = 0; j < matriz.length; j++) {
                    matriz1[i][j] = Math.min(matriz1[i][j], matriz1[i][k] + matriz1[k][j]);
                }
            }
        }
    }

    public void recorrido() {
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[i][j] + "-");
            }
            System.out.println("");
        }
    }

    public void recorrido1() {
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "-");
            }
            System.out.println("");
        }
    }

    public void salidaFinal() {
        System.out.print("LA MATRIZ ORIGINAL ES\n");
        System.out.println("_________");
        recorrido1();
        System.out.println("_________");
        caminos();
        System.out.println("\nLA MATRIZ DE CAMINOS MINIMOS");
        System.out.println("_________");
        recorrido();
        System.out.println("_________");
    }

    public void contarGradosSalida() {
        int n = matriz.length;
        int m = matriz.length;

        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == 1) {
                    s = s + 1;
                }
            }
            System.out.println("vertice" + (i + 1) + ":" + s);
        }
    }

    public void contarGradosEntrada() {
        int n = matriz.length;
        int m = matriz.length;

        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < m; j++) {
                if (matriz[j][i] == 1) {
                    s = s + 1;
                }
            }
            System.out.println("vertice" + (i + 1) + ":" + s);
        }
    }

    public void CaminoLongitud3() {
        int matrizL2[][] = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    matrizL2[i][j] += matriz[i][k] * matriz[k][j];

                }
            }
        }
        int matrizL3[][] = new int[matriz.length][matriz.length];
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                for (k = 0; k < matriz.length; k++) {
                    matrizL3[i][j] += matriz[i][k] * matrizL2[k][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matrizL3[i][j]);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Ejercicio_2 camino = new Ejercicio_2();

        System.out.println("los gados de salida son :");
        camino.contarGradosSalida();
        System.out.println("");
        System.out.println("los grados de entrada son :");
        camino.contarGradosEntrada();
        System.out.println("");
        System.out.println("longitud 2");
        camino.CaminoLongitud3();
    }

}
