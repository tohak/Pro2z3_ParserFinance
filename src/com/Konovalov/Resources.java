package com.Konovalov;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Тоха on 18.04.18.
 */
@XmlRootElement(name = "resources")
public class Resources {
    private int start;
    private int count;
    private List<ResourceNew> listResource = new ArrayList<>();

    public Resources() {
    }

    @XmlAttribute
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    @XmlAttribute
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @XmlElement(name = "resource")
    public List<ResourceNew> getListResource() {
        return listResource;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "start=" + start +
                ", count=" + count +
                ", listResource=" + listResource +
                '}';
    }
}
