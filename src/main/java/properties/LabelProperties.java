/*
 * Copyright(C) 2018 Trung Hieu Bui (Mr)
 * StudentInformationSystem, app.java.utils - IntelliJ IDEA
 * LabelProperties.java, 19/10/2018 Trung Hieu Bui (Mr)
 */
package properties;

import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/**
 * LabelProperties
 *
 * @author Trung Hieu Bui (Mr)
 */
public class LabelProperties {
    private static Properties          prop;
    private static InputStreamReader   reader;
    private static Map<String, String> map = getMapProperties();

    private static void initProperties() {
        try {
            prop = new Properties();
            reader = new InputStreamReader(Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResourceAsStream("../../../.properties/label.properties")), StandardCharsets.UTF_8);
            prop.load(reader);
        } catch (FileNotFoundException e) {
            System.out.println("Label Properties Err: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Label Properties Err: " + e.getMessage());
        }
    }

    private static Map<String, String> getMapProperties() {

        return null;
    }
}
