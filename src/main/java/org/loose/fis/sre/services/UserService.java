package org.loose.fis.sre.services;

import org.dizitart.no2.Cursor;
import org.dizitart.no2.Document;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.NitriteCollection;
import org.dizitart.no2.objects.ObjectRepository;
import org.loose.fis.sre.exceptions.IncorrectCodeException;
import org.loose.fis.sre.exceptions.IncorrectPasswordException;
import org.loose.fis.sre.exceptions.IncorrectUsernameException;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.model.User;


import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

import static org.loose.fis.sre.services.FileSystemService.getPathToFile;

public class UserService {

    private static ObjectRepository<User> userRepository;

    public static void initDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(getPathToFile("VNews.db").toFile())
                .openOrCreate("test", "test");

        userRepository = database.getRepository(User.class);
    }

    public static void addUser(String username, String password, String address, String ID, String phone, String mail, String role, String code) throws UsernameAlreadyExistsException {
        checkUserDoesNotAlreadyExist(username);
        //System.out.println(password + " " + encodePassword(username, password));
        userRepository.insert(new User(username, encodePassword(username, password), address, ID, phone, mail, role, code));
        //printUsers();
    }

    private static void checkUserDoesNotAlreadyExist(String username) throws UsernameAlreadyExistsException {
        for (User user : userRepository.find()) {
            if (Objects.equals(username, user.getUsername()))
                throw new UsernameAlreadyExistsException(username);
        }
    }

   /* public static void printUsers(){
        try {
            NitriteCollection n = userRepository.getDocumentCollection();
            Cursor x = n.find();
            for (Document keyValuePairs : x) {
                System.out.println(keyValuePairs.get("username") + " " + keyValuePairs.get("password"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());}
    } */

    private static String encodePassword(String salt, String password) {
        MessageDigest md = getMessageDigest();
        md.update(salt.getBytes(StandardCharsets.UTF_8));

        byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));

        // This is the way a password should be encoded when checking the credentials
        return new String(hashedPassword, StandardCharsets.UTF_8)
                .replace("\"", ""); //to be able to save in JSON format
    }

    private static MessageDigest getMessageDigest() {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-512 does not exist!");
        }
        return md;
    }


    public static boolean CheckLogin(String username, String password) throws IncorrectUsernameException, IncorrectPasswordException {
        for (User user : userRepository.find()) {//pt toti userii din bazade date
            if (Objects.equals(username, user.getUsername())) {
               // System.out.println(user.getPassword());
                if(user.getPassword().equals(encodePassword(username,password))) //daca parolele din aplicatie si din baza de date(cea din baza de date e criptata) sunt egale
                    return true;
                throw new IncorrectPasswordException(username);
            }
        }
        throw new IncorrectUsernameException(username);
    }

    public static boolean CheckCode(String username, String password, String code) throws IncorrectUsernameException, IncorrectPasswordException, IncorrectCodeException {
        for (User user : userRepository.find()) {//pt toti userii din bazade date
            if (Objects.equals(username, user.getUsername())) {
                if (user.getPassword().equals(encodePassword(username, password))) {
                    if (Objects.equals(code, "12345"))
                        return true;
                    throw new IncorrectCodeException(username);
                }
             throw new IncorrectPasswordException(username);
            }
        }
        throw new IncorrectUsernameException(username);
    }
}

