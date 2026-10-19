import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1 Yago
            //Una matriz de caracteres 10 x 10
        char[][] matriz = new char[10][10];

        // 2 sergio
            // variable vidas
        int vidas = 10;

        //3
        for (int i = 0; i < matriz.length;i++ ){
            for (int o = 0;o < matriz.length; o++){
                matriz[i][o] = '*';
            }
        }



        matriz[0][0] = 'Y';
        matriz[9][9] = 'F';

        //casilla aleatoria m

        Random random = new Random();
        int filaM = random.nextInt(10);
        int columnaM = random.nextInt(10);

        matriz[filaM][columnaM] = 'M';

        //REPARTIR CASILLA ALEATORIA P


        int filaP = random.nextInt(10);

        int colP = random.nextInt(10);
        //Comparacion

        do{
             filaP = random.nextInt(10);
             colP = random.nextInt(10);
        }while (matriz[filaP][colP] != '*');


        matriz[filaP][colP] = 'P';

        for (int i = 0; i < 5;i++){
            do{
                filaP = random.nextInt(10);
                colP = random.nextInt(10);
            }while (matriz[filaP][colP] != '*');
            matriz[filaP][colP] = 'P';
        }

        System.out.println("Tu jugador se encuentra en las casilla 0, 0 y te puedes mover con las letras WASD");
        System.out.println("y te puedes mover con las letras WASD");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una letra = ");
        char x = teclado.next().charAt(0);

        System.out.println("La letra elegida es = " + x);

        //YODA

        int filaY = 0;
        int columY = 0;

        matriz [filaY][columY] = 'Y';

        if (x == 'D'){
            columY += 1;
            matriz[filaY][columY] = 'Y';

        }

        for (int i = 0; i < matriz.length;i++ ){
            for (int o = 0;o < matriz.length; o++){
                System.out.print(matriz[i][o] + " " );
            }
            System.out.println();
        }






        }
    }
