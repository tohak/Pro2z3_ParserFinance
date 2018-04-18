package com.Konovalov;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Тоха on 18.04.18.
 */
public class TrainsDateFormatter extends XmlAdapter<String, Date> {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddThh:mm:ss+0000");

    @Override
    public Date unmarshal(String v) throws Exception {
        Date date = new Date();
        try {
            date = sdf.parse(v);
        } catch (ParseException e) {
            System.out.println(e);
        }
        return date;
    }

    @Override
    public String marshal(Date v) throws Exception {
        return sdf.format(v);
    }
}
