package org.example;

public class CaesarCipher {

    public String generate_encryption(String text, int shift) {
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char msg = text.charAt(i);
            if(Character.isLetter(msg)){
                int pos = msg;
                if(Character.isUpperCase(msg)){
                    pos = (pos + shift) % 26 + 65;
                    cipher.append((char)pos);
                } else {
                    pos = (pos + shift - 97) % 26 + 97;
                    cipher.append((char)pos);
                }
            }
        }
        return cipher.toString();
    }

    public String generate_decryption() {
        return "";
    }
}
