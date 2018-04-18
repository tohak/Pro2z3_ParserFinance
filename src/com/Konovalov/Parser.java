package com.Konovalov;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Тоха on 18.04.18.
 */
public class Parser {
    public static void saveToXMLFile(List list, File file) {
        try {
            JAXBContext context = JAXBContext.newInstance(List.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(list, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static List loadFromXMLURL(String urlSt) {
        JAXBContext jaxbContext = null;
        URL url = null;
        try {
            url = new URL(urlSt);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            jaxbContext = JAXBContext.newInstance(List.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            List list = (List) unmarshaller.unmarshal(url);
            return list;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
