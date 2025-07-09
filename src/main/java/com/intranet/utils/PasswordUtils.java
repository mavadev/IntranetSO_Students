package com.intranet.utils;
import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtils {

    // Generar el hash del Password
    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    // Verifica si la contraseña ingresada coincide con el hash guardado
    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        if (plainPassword == null || hashedPassword == null) {
            return false;
        }
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
