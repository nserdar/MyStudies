package main.java.random;

import java.util.Random;

public class RAndomMethods {
    /*
    •	nextInt() → Rastgele bir int döndürür.
	•	nextInt(bound) → 0 ile bound-1 arasında rastgele bir int döndürür.
	•	nextDouble() → 0.0 ile 1.0 arasında rastgele bir double döndürür.
	•	nextFloat() → 0.0 ile 1.0 arasında rastgele bir float döndürür.
	•	nextLong() → Rastgele bir long döndürür.
	•	nextBoolean() → Rastgele true veya false döndürür.
     */
    private static Random random = new Random();

    //Rastgele karakter uzunluğunda bir string nasıl üretilir?
    public static String getRandomWord(int length){

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int idx = random.nextInt(characters.length());
            sb.append(characters.charAt(idx));
        }
        return sb.toString();
    }

    //Rastgele boolean değer üretmek
    public static boolean getRandomBool(){
        return random.nextBoolean();   //true veya false döndürür.
    }

    public static Double getRandomDouble(){
       return random.nextDouble();   //0.0 ile 1.0 arasında rastgele bir double döndürür.
    }






}
