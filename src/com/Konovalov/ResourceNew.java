package com.Konovalov;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;
import java.util.List;

/**
 * Created by Тоха on 18.04.18.
 */
@XmlRootElement
public class ResourceNew {
    private String classname;
    private List<Field> listField = new ArrayList<>();

    public ResourceNew(List<Field> listField) {
        this.listField = listField;
    }

    public ResourceNew() {
    }
@XmlAttribute
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
@XmlElement(name="field")
    public List<Field> getListField() {
        return listField;
    }

    public void setListField(List<Field> listField) {
        this.listField = listField;
    }

    @Override
    public String toString() {
        return "ResourceNew{" +
                "classname='" + classname + '\'' +
                ", listField=" + listField +
                '}';
    }
}
