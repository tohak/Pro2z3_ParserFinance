package com.Konovalov;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Created by Тоха on 18.04.18.
 */
@XmlRootElement(name ="resource")
public class Resource {
    private  String classname;

    private String nameField;
    private String name;
    private String priceField;
    private String price;
    private String symbolField;
    private String symbol;
    private String tsField;
    private String ts;
    private String typeField;
    private String type;
    private Date utctimeField;
    private String utctime;
    private String volumeField;
    private String volume;

    public Resource(String classname, String nameField, String name, String priceField, String price, String symbolField, String symbol,
                    String tsField, String ts, String typeField, String type, Date utctimeField, String utctime, String volumeField,
                    String volume) {
        this.classname = classname;
        this.nameField = nameField;
        this.name = name;
        this.priceField = priceField;
        this.price = price;
        this.symbolField = symbolField;
        this.symbol = symbol;
        this.tsField = tsField;
        this.ts = ts;
        this.typeField = typeField;
        this.type = type;
        this.utctimeField = utctimeField;
        this.utctime = utctime;
        this.volumeField = volumeField;
        this.volume = volume;
    }

    public Resource() {
    }

    @XmlAttribute
    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
@XmlElement (name="field")
    public String getNameField() {
        return nameField;
    }

    public void setNameField(String nameField) {
        this.nameField = nameField;
    }
@XmlAttribute (name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XmlElement (name="field")
    public String getPriceField() {
        return priceField;
    }

    public void setPriceField(String priceField) {
        this.priceField = priceField;
    }
    @XmlAttribute (name="name")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @XmlElement (name="field")
    public String getSymbolField() {
        return symbolField;
    }

    public void setSymbolField(String symbolField) {
        this.symbolField = symbolField;
    }
    @XmlAttribute (name="name")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    @XmlElement (name="field")
    public String getTsField() {
        return tsField;
    }

    public void setTsField(String tsField) {
        this.tsField = tsField;
    }
    @XmlAttribute (name="name")
    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }
    @XmlElement (name="field")
    public String getTypeField() {
        return typeField;
    }

    public void setTypeField(String typeField) {
        this.typeField = typeField;
    }
    @XmlAttribute (name="name")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @XmlElement (name="field")
    @XmlJavaTypeAdapter(TrainsDateFormatter.class)
    public Date getUtctimeField() {
        return utctimeField;
    }

    public void setUtctimeField(Date utctimeField) {
        this.utctimeField = utctimeField;
    }
    @XmlAttribute (name="name")
    public String getUtctime() {
        return utctime;
    }

    public void setUtctime(String utctime) {
        this.utctime = utctime;
    }
    @XmlElement (name="field")
    public String getVolumeField() {
        return volumeField;
    }

    public void setVolumeField(String volumeField) {
        this.volumeField = volumeField;
    }
    @XmlAttribute (name="name")
    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "classname='" + classname + '\'' +
                ", nameField='" + nameField + '\'' +
                ", name='" + name + '\'' +
                ", priceField='" + priceField + '\'' +
                ", price='" + price + '\'' +
                ", symbolField='" + symbolField + '\'' +
                ", symbol='" + symbol + '\'' +
                ", tsField='" + tsField + '\'' +
                ", ts='" + ts + '\'' +
                ", typeField='" + typeField + '\'' +
                ", type='" + type + '\'' +
                ", utctimeField=" + utctimeField +
                ", utctime='" + utctime + '\'' +
                ", volumeField='" + volumeField + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
