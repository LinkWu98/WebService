package cn.link.api.rest.entity;

import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@ToString
@XmlRootElement(name = "Car")
public class Car {

    private Integer id;

    private String carName;

    private Double price;


}
