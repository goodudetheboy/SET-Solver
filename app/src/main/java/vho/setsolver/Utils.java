package vho.setsolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Utils {
        /**
     * Create a string from the content of input file in the ./resource folder
     * <p>
     * This code was adapted from the following Stack Overflow post:
     * https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file
     * </p>
     * 
     * @param filename filename in the ./resource folder
     * @return String created from content of a file
     * @throws IOException when can't find the file
     * @author erickson, https://stackoverflow.com/users/3474/erickson
     */
    public static String readFileFromResource(String filename) throws IOException {
        BufferedReader inputRules = new BufferedReader(new InputStreamReader(Utils.getFileFromResourceAsStream(filename), StandardCharsets.UTF_8));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = inputRules.readLine()) != null) {
            builder.append(line);
            builder.append('\n');
        }
        inputRules.close();
        return builder.toString();
    }

    /**
     * Gets an {@link InputStream} of a file from ./resource folder
     * 
     * @param fileName a file name in the ./resource folder
     * @return an {@link InputStream} of a file from ./resource folder
     * @author mykong, https://mkyong.com/java/java-read-a-file-from-resources-folder/
     */
    public static InputStream getFileFromResourceAsStream(String fileName) {
        // The class loader that loaded the class
        ClassLoader classLoader = Utils.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }
    }
}
