import java.util.Scanner;

public class ceasarCipher_Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice ;
        String planText = "" , enText= "";
        int key =0;

        do {
            System.out.println("1- Encryption Text .");
            System.out.println("2- Decryption Text .");
            System.out.println("3- Exit .");
            choice = input.nextInt();
            if (choice == 1) {
                encryptionText(input , planText , key);
            } else if (choice==2) {
                decryptionText(input , enText , key);
            }
            else
                System.out.println("Choice Wrong !!!");
        }while (choice!=3);
    }



    public static void encryptionText(Scanner input ,String plainText  , int key) {
        System.out.println("Enter text for encryption : ");
        plainText  = input.next();
        System.out.println("Enter key value : ");
        key = input.nextInt();


        for (int i = 0; i < plainText.length(); i++) {
            char letter = plainText.charAt(i);

            if (Character.isLetter(letter)) { // Check if the character is a letter

                if (Character.isUpperCase(letter)) { // Check if the letter is uppercase
                    letter +=key; // letter = letter +key ;
                    if (letter > 'Z') {
                        letter-= 26;// letter = letter -26 ;
                    }
                } else if (Character.isLowerCase(letter)) { // Check if the letter is lowercase
                    letter +=key;
                    if (letter > 'z') {
                        letter-= 26;

                    }
                }

            }
            System.out.print(letter);
        }
        System.out.println("\n");
    }
    public static void decryptionText(Scanner input ,String enText  , int key) {
        System.out.println("Enter text for decryption : ");
        enText  = input.next();
        System.out.println("Enter key value : ");
        key = input.nextInt();


        for (int i = 0; i < enText.length(); i++) {
            char letter = enText.charAt(i);

            if (Character.isLetter(letter)) { // Check if the character is a letter
                if (Character.isUpperCase(letter)) { // Check if the letter is uppercase
                    letter -=key;
                    if (letter < 'A') {
                        letter+= 26;
                    }
                } else if (Character.isLowerCase(letter)) { // Check if the letter is lowercase
                    letter -=key;
                    if (letter < 'a') {
                        letter+= 26;

                    }
                }
            }
            System.out.print(letter);
        }

        System.out.println("\n");
    }



}
