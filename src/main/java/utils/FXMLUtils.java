/*
 * Copyright(C) 2018 buitr
 * StudentInformationSystem, utils - IntelliJ IDEA
 * FXMLUtils.java
 * Created at 22:48 ~ 30/10/2018 by buitr
 */

package utils;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

/**
 * Description about this Class/Interface/Enum...
 *
 * @author buitr
 * Created: 22:48 ~ 30/10/2018
 */
public class FXMLUtils {
    public static <T> T load(String location) throws IOException {
        return getLoader(location).load();
    }
    
    public static FXMLLoader getLoader(String location) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(FXMLUtils.class.getResource(location));
        return loader;
    }
}
