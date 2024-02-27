package Ejercicios2.Bucles;

/**
 *
 * @author xavis
 */

import java.util.concurrent.TimeUnit;

public class Ejercicio8 {
  public static void main(String args[]) throws InterruptedException {
    int hora;
    int minuto;
    int segundo;

    for (hora=0; hora<=23; hora++) {     
    for (minuto=0; minuto<=59; minuto++) {        
    for (segundo=0; segundo<=59; segundo++) {        
        System.out.printf("%02d:%02d:%02d\n",hora,minuto,segundo);
            TimeUnit.SECONDS.sleep(1);
        }
      }
    }
  }


}