/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, app.java.utils - IntelliJ IDEA
 * Commons.java, 19/10/2018 Trung Hieu Bui (Mr)
 */
package utils;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.UUID.randomUUID;

/**
 * Common function
 *
 * @author Trung Hieu Bui (Mr)
 */
public class Commons {
    /**
     * Logger to get log to console
     */
    private static final Logger logger = Logger.getLogger(Commons.class.getName());

    /**
     * Create salt string.
     *
     * @return the string
     */
    public static String createSalt() {
        // Create a random String
        return randomUUID().toString().replace("-", "");
    }

    /**
     * Encode sha 256 string.
     *
     * @param salt the salt
     * @param pass the pass
     * @return the string
     */
    public static String encodeSHA256(String salt, String pass) {
        try {
            // Call the SHA256 algorithm
            MessageDigest sha1 = MessageDigest.getInstance("SHA-256");
            // get the encoded byte
            byte[] messageDigest = sha1.digest((pass + salt).getBytes(Charset.forName("UTF-8")));
            // return the string that create from bytes
            return Base64.getEncoder().encodeToString(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            // Non-exist algorithm
            logger.log(Level.WARNING, e.getMessage());
        }
        // if exception, return null
        return null;
    }

    /**
     * Encode xss string.
     *
     * @param keyword the keyword
     * @return the string
     */
    public static String encodeXSS(String keyword) {
        // encode String
        return keyword.replace("&", "&amp;")
                      .replace("<", "&lt;")
                      .replace(">", "&gt;")
                      .replace("\"", "&quot;")
                      .replace("'", "&#x27;")
                      .replace("\\", "&#x2F;");
    }

    /**
     * Decode xss string.
     *
     * @param keyword the keyword
     * @return the string
     */
    public static String decodeXSS(String keyword) {
        // decode string
        return keyword.replaceAll("&amp;", "&")
                      .replaceAll("&lt;", "<")
                      .replaceAll("&gt;", ">")
                      .replaceAll("&quot;", "\"")
                      .replaceAll("&#x27;", "'")
                      .replaceAll("&#x2F;", "\\");
    }

    /**
     * Create key string.
     *
     * @return the string
     */
    public static String createKey() {
        // Tạo một chuỗi ngẫu nhiên bằng thư viện hỗ trợ
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * Escape wildcard string.
     *
     * @param string the string
     * @return the string
     */
    public static String escapeWildcard(String string) {
        if (string != null) {
            return string.replace("\\", "\\\\")
                         .replace("%", "\\%")
                         .replace("_", "\\_");
        }
        return null;
    }
}
