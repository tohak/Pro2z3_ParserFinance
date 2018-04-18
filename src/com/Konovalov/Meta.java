package com.Konovalov;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Тоха on 18.04.18.
 */
@XmlRootElement(name = "meta")
public class Meta {
    private String type;

    public Meta(String type) {
        this.type = type;
    }

    public Meta() {
    }

    @XmlElement
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "type='" + type + '\'' +
                '}';
    }
}
