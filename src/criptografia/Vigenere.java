/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

/**
 *
 * @author anderson
 */
public class Vigenere {

    public static String encrypt(final String message, final String key)
    {

        String result = "";

        for (int i = 0, j = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)){
                if(Character.isUpperCase(c)) {
                    result += (char) ((c + key.toUpperCase().charAt(j) - 2 * 'A') % 26 + 'A');

                } else {
                    result += (char) ((c + key.toLowerCase().charAt(j) - 2 * 'a') % 26 + 'a');

                }
            } else {
                result+=c;
            }
            j = ++j % key.length();
        }
        return result;
    }

     public static String decrypt( final String message, final String key)
    {
        String result ="";

        for(int i = 0, j = 0; i < message.length(); i++){

            char c = message.charAt(i);
            if (Character.isLetter(c)){
                if(Character.isUpperCase(c)) {
                    result += ((char)('Z'-(25-(c-key.toUpperCase().charAt(j)))%26));

                } else {
                    result += ((char)('z'-(25-(c-key.toLowerCase().charAt(j)))%26));

                }
            } else {
                result+=c;
            }

            j = ++j % key.length();

        }
        return result;
     }
    public static void main (String [] args){
        String text="ATACARBASESUL";
        String key="LIMAO";
        System.out.println(text);
        String ciphertext=encrypt(text, key);
        System.out.println(ciphertext);
        System.out.println("LBMCOCJMSSDCX");
        System.out.println(decrypt(ciphertext, key));

    }
}
