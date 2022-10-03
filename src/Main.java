import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        boolean loop = true;

        Scanner input = new Scanner(System.in);
/*
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)Math.floor(Math.random() * 10 + 1);
        }
        while (loop){
            try{
                System.out.println("Che Posizione vuoi modificare?");
                int pos = input.nextInt();
                if (pos > 0 && pos <= arr.length){
                    System.out.println("Cosa vuoi sostituire?");
                    int el = input.nextInt();
                    arr[pos-1] = el;
                    for (int j : arr) {
                        System.out.println(j);
                    }
                }else{
                    System.out.println("Grazie di aver giocato!");
                    loop = false;
                }
            }catch (Exception e){
                logger.error("sono accettati solo numeri da 0 a 10");
                input.nextLine();
            }
        }
        input.close();
*/

        //km litro----------------------------------------------------------
        while(loop){
            try{
                System.out.println("quanto hai viaggiato in km?");
                double km = input.nextDouble();
                System.out.println("quanta benzina hai consumato?");
                double l = input.nextDouble();
                if (km != 0 || l != 0){
                    System.out.println( km/l + "litri al km");
                    loop = false;
                } else {
                    logger.error("non è possibile dividere per 0");
                }

            }catch (Exception e){
                logger.error("Errore trovato!");
                input.nextLine();
            }
        }
    }
}