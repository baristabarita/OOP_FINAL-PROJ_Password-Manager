/***********************************************************************************
 * Name: Shane Louis A. Barita          Course: BSIT
 *       Lenel John N. Baring
 *       Hannah Angelica Galve
 * 
 * CIS 2103 - Object Oriented Programming
 * 
 * File: PasswordGenerator.java
 * Description: PasswordGenerator for Password Manager Program
**************************************************************************************/


package Features;

import java.security.SecureRandom;

public class PasswordGenerator {
    
        private static final SecureRandom random = new SecureRandom();
        private static final String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private static final String small_caps = "abcdefghijklmnopqrstuvwxyz";
        private static final String Numeric = "1234567890";
        private static final String special_char = "~!@#$%^&*(_+{}|:_[?]>=<";
        private static final String dic = caps + small_caps + Numeric + special_char;

        //password generator function
        public String generatePassword(int length){
            StringBuilder password = new StringBuilder();
            for (int i = 0; i < length; i++){
                int index = random.nextInt(dic.length());
                password.append(dic.charAt(index));
            }
            return password.toString();
        }

}
