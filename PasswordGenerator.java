import java.security.SecureRandom;

public class PasswordGenerator { private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz"; private static final String DIGITS = "0123456789"; private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?"; private static final String ALL_CHARACTERS = UPPERCASE + LOWERCASE + DIGITS + SPECIAL_CHARACTERS; private static final SecureRandom RANDOM = new SecureRandom();

public static String generatePassword(int length) {
    if (length < 4) {
        throw new IllegalArgumentException("Password length must be at least 4 characters.");
    }
    
    StringBuilder password = new StringBuilder(length);
    
    // Ensure at least one character from each category
    password.append(UPPERCASE.charAt(RANDOM.nextInt(UPPERCASE.length())));
    password.append(LOWERCASE.charAt(RANDOM.nextInt(LOWERCASE.length())));
    password.append(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
    password.append(SPECIAL_CHARACTERS.charAt(RANDOM.nextInt(SPECIAL_CHARACTERS.length())));
    
    // Fill the rest of the password with random characters
    for (int i = 4; i < length; i++) {
        password.append(ALL_CHARACTERS.charAt(RANDOM.nextInt(ALL_CHARACTERS.length())));
    }
    
    // Shuffle the password to avoid predictable patterns
    return shuffleString(password.toString());
}

private static String shuffleString(String input) {
    char[] array = input.toCharArray();
    for (int i = array.length - 1; i > 0; i--) {
        int index = RANDOM.nextInt(i + 1);
        char temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }
    return new String(array);
}

public static void main(String[] args) {
    int passwordLength = 12; // You can change the length
    String password = generatePassword(passwordLength);
    System.out.println("Generated Password: " + password);
}

}

