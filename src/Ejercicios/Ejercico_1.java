package Ejercicios;

public class Ejercico_1 {

    public int i, j, k, infinito = 1000000;
    int matriz[][] = {{0, 6, 0, 4, 0}, {0, 2, 0, 1, 8}, {0, 5, 0, 0, 0}, {0, 1, 0, 0, 3}, {1, 2, 2, 0, 0}};
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
        System.out.println("\nLA MATRIZ DE CAMINOS MINIMOS ES");
        System.out.println("_________");
        recorrido();
        System.out.println("_________");
    }

    public static void main(String[] args) {
        Ejercico_1 camino = new Ejercico_1();
        camino.salidaFinal();
    }

}
