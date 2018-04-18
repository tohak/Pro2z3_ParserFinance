package com.Konovalov;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        String urlSt = "https://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote";
        File file = new File("1.xml");
        List listOne = Parser.loadFromXMLURL(urlSt);
        Parser.saveToXMLFile(listOne, file);
        System.out.println(listOne);
    }
}
