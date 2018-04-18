package com.Konovalov;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by Тоха on 18.04.18.
 */

public class Field {
    private String name;
    private String fields;


    public Field(String name, String fields) {
        this.name = name;
        this.fields = fields;
    }

    public Field() {
    }

    public String getName() {
        return name;
    }
    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public String getFields() {
        return fields;
    }
@XmlValue
    public void setFields(String fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "Field{" +
                "name='" + name + '\'' +
                ", fields='" + fields + '\'' +
                '}';
    }
}
