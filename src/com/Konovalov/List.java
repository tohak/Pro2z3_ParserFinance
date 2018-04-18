package com.Konovalov;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Тоха on 18.04.18.
 */
@XmlRootElement(name= "list")
public class List {
    private double version;
    private Meta meta;
    private Resources resources;

    public List() {
    }
@XmlAttribute
    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
@XmlElement
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
    @XmlElement
    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "List{" +
                "version=" + version +
                ", meta=" + meta +
                ", resources=" + resources +
                '}';
    }
}
