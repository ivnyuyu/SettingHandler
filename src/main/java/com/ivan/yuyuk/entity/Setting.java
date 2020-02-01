package com.ivan.yuyuk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "Setting")
@Table(name = "Settings")
public class Setting {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "name")
    private String name;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "description")
    private String description;

    @Column(name = "sort_number")
    private Integer sortNumber;

    @Column(name = "bit_mask")
    private Long bitMask;

    @Column(name = "int_value")
    private Long intValue;

    @Column(name = "float_value")
    private Double floatValue;

    @Column(name = "text_value")
    private String textValue;

    @Column(name = "date_value")
    private Date dateValue;

    @Column(name = "ref_value")
    private Long refValue;

    public Setting() {

    }

    public Setting(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Long getBitMask() {
        return bitMask;
    }

    public void setBitMask(Long bitMask) {
        this.bitMask = bitMask;
    }

    public Long getIntValue() {
        return intValue;
    }

    public void setIntValue(Long intValue) {
        this.intValue = intValue;
    }

    public Double getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Double floatValue) {
        this.floatValue = floatValue;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    public Long getRefValue() {
        return refValue;
    }

    public void setRefValue(Long refValue) {
        this.refValue = refValue;
    }

    @Override
    public String toString() {
        return "Setting{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", description='" + description + '\'' +
                ", sortNumber=" + sortNumber +
                ", bitMask=" + bitMask +
                ", intValue=" + intValue +
                ", floatValue=" + floatValue +
                ", textValue='" + textValue + '\'' +
                ", dateValue=" + dateValue +
                ", refValue=" + refValue +
                '}';
    }
}

/*
    CREATE TABLE SETTINGS(
        id BIGINT PRIMARY KEY,
        parent_id BIGINT,
        name VARCHAR(255) NOT NULL,
    short_name VARCHAR(255),
    description VARCHAR(255),
    sort_number INTEGER,
    bit_mask BIGINT,
    int_value BIGINT,
    float_value double precision,
            text_value VARCHAR(255),
            date_value DATE,
            ref_value BIGINT
            );*/
