package org.example;

public class Main {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        System.out.println(cipher.generate_encryption("mahasiswa usd", 7));
    }
}